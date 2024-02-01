package com.funcionarios.Service;

import com.funcionarios.Model.Ugt;
import com.funcionarios.Repository.UgtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UgtService {

    @Autowired
    UgtRepository ugtRepository;

    public List<Ugt> getAll(){
        return ugtRepository.findAll();
    }

    public Optional<Ugt> getById(String idugt){
        return ugtRepository.findById(idugt);
    }

}
