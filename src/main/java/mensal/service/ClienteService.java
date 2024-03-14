package mensal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mensal.entity.Cliente;
import mensal.repository.ClienteRepository;

@Service
public class ClienteService {
	
		@Autowired
		private ClienteRepository clienteRepository;
		
		public String save(Cliente obj) {
			this.clienteRepository.save(obj);
			return obj.getNome() + " Cliente salvo com sucesso.";
		}
		
		public List<Cliente> listAll(){
			return this.clienteRepository.findAll();
		}
		
		public String update(long id, Cliente obj) {
			obj.setId(id);
			this.clienteRepository.save(obj);
			return "Cliente atualizado!";
			
		}
		
		public Cliente findById(long id) {
			Cliente obj = this.clienteRepository.findById(id).get();
			return obj;
		}
		
		public String delete(long id) {
			this.clienteRepository.deleteById(id);
			return "Cliente encontrado para deletar";
		}

		public List<Cliente> findOlderClient(int idade) {
			return this.clienteRepository.findOlderClient(idade);
	
		}

		public List<Cliente> encontrarClientePorCpf(String cpf) {
	        return this.clienteRepository.findByCpf(cpf);
		}	
	}
