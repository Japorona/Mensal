package mensal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import mensal.entity.Funcionario;
import mensal.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
		@Autowired
		private FuncionarioRepository repository;
		
		public String save(Funcionario obj) {
			this.repository.save(obj);
			return obj.getNome() + " Funcionário salvo com sucesso.";
		}
		
		public List<Funcionario> listAll(){
			return this.repository.findAll();
		}
		
		public String update(long id, Funcionario obj) {
			obj.setId(id);
			this.repository.save(obj);
			return "Funcionário não encontrado para alterar";
		}
		
		public Funcionario findById(long id) {
			Funcionario obj = this.repository.findById(id).get();
			return obj;
		}
		
		public String delete(long id) {
			this.repository.deleteById(id);
			return "Funcionário não encontrado para deletar";
		}	
		
		public List<Funcionario> findByNome(String nome) {
			return this.repository.findByNome(nome);
	
		}

		public List<Funcionario> findByMatricula(String matricula) {
	        return this.repository.findByMatricula(matricula);
		}	
	}
