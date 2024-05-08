package com.example.bean.infraestructure.entity;

import com.example.bean.domain.model.Persona;

public class PersonaEntity {

    private String nombre;
    private int edad;

    public PersonaEntity(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static PersonaEntity fromDomainModel(Persona persona){
        if (persona==null){
            return null;
        }
        return new PersonaEntity(persona.getNombre(), persona.getEdad());
    }

    public Persona toDomainModel(){

        return new Persona(nombre,edad);
    }
}
