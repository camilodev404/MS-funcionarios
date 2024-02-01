package com.funcionarios.Repository;

import com.funcionarios.Model.Ugt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UgtRepository extends JpaRepository<Ugt, String> {
}
