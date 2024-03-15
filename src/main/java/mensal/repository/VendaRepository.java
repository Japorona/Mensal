package mensal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import mensal.entity.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {
	
	public List<Venda> findByEnderecoEntrega (String enderecoEntrega);

}
