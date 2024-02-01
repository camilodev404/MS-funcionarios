package com.funcionarios.Service;

import com.funcionarios.Model.Funcionario;
import com.funcionarios.Repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    public List<Funcionario> getAll(){
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> getById(String idFuncionario){
        return funcionarioRepository.findById(idFuncionario);
    }

    public Funcionario save(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario update(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

}
