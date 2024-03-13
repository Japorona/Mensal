package mensal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mensal.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
