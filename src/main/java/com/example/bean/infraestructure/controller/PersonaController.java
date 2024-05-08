package com.example.bean.infraestructure.controller;

import com.example.bean.application.service.PersonaService;
import com.example.bean.domain.model.Persona;
import com.example.bean.infraestructure.entity.PersonaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/personas")
@RestController
public class PersonaController {

    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService){
        this.personaService=personaService;
    }
    @GetMapping("/{nombre}")
    public ResponseEntity<Persona> obtenerPersona(@PathVariable String nombre){
        Persona persona=personaService.obtenerPersonaporNombre(nombre);
        if(persona !=null){
            return ResponseEntity.ok(persona);
        }
        return ResponseEntity.notFound().build();

    }


}
