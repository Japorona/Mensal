package mensal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mensal.entity.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {

}
