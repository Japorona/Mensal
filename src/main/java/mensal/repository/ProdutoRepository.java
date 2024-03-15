package mensal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mensal.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findByValor (float valor);
	public List<Produto> findByNome (String nome);

}
