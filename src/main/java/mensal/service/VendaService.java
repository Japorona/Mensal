package mensal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mensal.entity.Venda;
import mensal.repository.VendaRepository;

@Service
public class VendaService {
	
		@Autowired
		private VendaRepository repository;
		
		public String save(Venda obj) {
			this.repository.save(obj);
			return "Venda salva com sucesso.";
		}
		
		public List<Venda> listAll(){
			return this.repository.findAll();
		}
		
		public String update(long id, Venda obj) {
			obj.setId(id);
			this.repository.save(obj);
			return "Venda não encontrada para alterar";
		}
		
		public Venda findById(long id) {
			Venda obj = this.repository.findById(id).get();
			return obj;
		}
		
		public String delete(long id) {
			this.repository.deleteById(id);
			return "Venda não encontrada para deletar";
		}	
	}
