package mensal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mensal.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
