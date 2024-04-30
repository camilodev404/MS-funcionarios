package com.funcionarios.Controller;

import com.funcionarios.Model.Ugt;
import com.funcionarios.Service.UgtService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ugt")
@CrossOrigin("*")
@Tag(name = "Ugts")
public class UgtController {

    @Autowired
    UgtService ugtService;

    @GetMapping("/all")
    public ResponseEntity<List<Ugt>> getUgts(){
        return new ResponseEntity<>(ugtService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idugt}")
    public ResponseEntity<Ugt> ugtById(@PathVariable("idugt") String idugt){
        return ugtService.getById(idugt).map(ugt -> new ResponseEntity<>(ugt, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
