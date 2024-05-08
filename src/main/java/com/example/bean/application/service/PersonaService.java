package com.example.bean.application.service;


import com.example.bean.domain.model.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {
    private final List<Persona> personas;
    public PersonaService(){
        this.personas= new ArrayList<>();
        personas.add(new Persona("juan",30));
        personas.add(new Persona("brenda",26));
        personas.add(new Persona("Tatiana",21));

    }

    public Persona obtenerPersonaporNombre(String nombre){
        for(Persona per: personas){
            if(per.getNombre().equalsIgnoreCase(nombre)){
                return per;
            }
        }
        return null;
    }

}
