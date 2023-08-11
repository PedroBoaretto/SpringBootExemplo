package com.example.aula1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula1.models.NumeroDTO;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class MeuController {
    @GetMapping(value="/MetodoX")
    public String getMetodoX(@RequestParam(name = "p1") String p1, @RequestParam(name = "p2") String p2) {
        return "Metodo X " + p1 + " e " + p2;
    }

    @GetMapping(value="metodoY/{p1}/{p2}")
    public String getUrlAmigavel(@PathVariable (name = "p1") String p1, @PathVariable(name = "p2") String p2) {
        return p1 + " e " + p2;
    }
    
    @PostMapping(value="ExemploObjeto")
    public NumeroDTO postExemplo(@RequestBody () NumeroDTO numeroDTO) {
        
        return numeroDTO;
    }
    
}
