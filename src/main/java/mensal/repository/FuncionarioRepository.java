package mensal.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import mensal.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	
	public List<Funcionario> findByNome (String nome);
    public List<Funcionario> findByMatricula(String matricula);

	
	
}
