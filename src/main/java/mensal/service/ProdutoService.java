package mensal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mensal.entity.Produto;
import mensal.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
		@Autowired
		private ProdutoRepository repository;
		
		public String save(Produto obj) {
			this.repository.save(obj);
			return obj.getNome() + " Funcionário salvo com sucesso.";
		}
		
		public List<Produto> listAll(){
			return this.repository.findAll();
		}
		
		public String update(long id, Produto obj) {
			obj.setId(id);
			this.repository.save(obj);
			return "Funcionário não encontrado para alterar";
		}
		
		public Produto findById(long id) {
			Produto obj = this.repository.findById(id).get();
			return obj;
		}
		
		public String delete(long id) {
			this.repository.deleteById(id);
			return "Funcionário não encontrado para deletar";
		}	
	}
