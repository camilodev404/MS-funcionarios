package com.funcionarios.Controller;

import com.funcionarios.Model.Funcionario;
import com.funcionarios.Service.FuncionarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
@CrossOrigin("*")
@Tag(name = "Funcionarios")
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @GetMapping("/all")
    public ResponseEntity<List<Funcionario>> getFuncionarios(){
        return new ResponseEntity<>(funcionarioService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idFuncionario}")
    public ResponseEntity<Funcionario> funcionarioById(@PathVariable("idFuncionario") String idFuncionario){
        return funcionarioService.getById(idFuncionario).map(funcionario -> new ResponseEntity<>(funcionario, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/ugt/{idugt}")
    public ResponseEntity<List<Funcionario>> getFuncByUgt(@PathVariable("idugt") String idugt){
        return new ResponseEntity<>(funcionarioService.getByUgt(idugt), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Funcionario> guardarFuncionario(@RequestBody Funcionario funcionario){
        return new ResponseEntity<>(funcionarioService.save(funcionario), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Funcionario> updateFuncionario(@RequestBody Funcionario funcionario){
        return new ResponseEntity<>(funcionarioService.update(funcionario), HttpStatus.OK);
    }

}
