package com.funcionarios.Repository;

import com.funcionarios.Model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {

    @Query("SELECT m FROM Funcionario m WHERE m.idugt = :idugt")
    List<Funcionario> findByUgt(@Param("idugt") String idugt);

}
