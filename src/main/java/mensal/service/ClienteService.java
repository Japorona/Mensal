package mensal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mensal.entity.Cliente;
import mensal.repository.ClienteRepository;

@Service
public class ClienteService {
	
		@Autowired
		private ClienteRepository repository;
		
		public String save(Cliente obj) {
			this.repository.save(obj);
			return obj.getNome() + " Cliente salvo com sucesso.";
		}
		
		public List<Cliente> listAll(){
			return this.repository.findAll();
		}
		
		public String update(long id, Cliente obj) {
			obj.setId(id);
			this.repository.save(obj);
			return "Cliente atualizado!";
			
		}
		
		public Cliente findById(long id) {
			Cliente obj = this.repository.findById(id).get();
			return obj;
		}
		
		public String delete(long id) {
			this.repository.deleteById(id);
			return "Cliente encontrado para deletar";
		}	
	}
