package mensal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mensal.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
