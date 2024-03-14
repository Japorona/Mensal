package mensal.service;

import java.util.List;
import java.util.Optional;

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
		Optional<Venda> optionalVenda = this.repository.findById(id);
		if (optionalVenda.isPresent()) {
			obj.setId(id);
			this.repository.save(obj);
			return "Venda atualizada com sucesso.";
		} else {
			return "Venda não encontrada para alterar.";
		}
	}
	
	public Venda findById(long id) {
		Optional<Venda> optionalVenda = this.repository.findById(id);
		return optionalVenda.orElse(null);
	}
	
	public String delete(long id) {
		Optional<Venda> optionalVenda = this.repository.findById(id);
		if (optionalVenda.isPresent()) {
			this.repository.deleteById(id);
			return "Venda deletada com sucesso.";
		} else {
			return "Venda não encontrada para deletar.";
		}
	}	
}
