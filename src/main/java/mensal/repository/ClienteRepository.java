package mensal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mensal.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	@Query("FROM Cliente c WHERE c.idade > :idade")
	public List<Cliente> findOlderClient (int idade);
    public List<Cliente> findByCpf(String cpf);

}