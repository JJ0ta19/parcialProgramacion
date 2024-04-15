package com.corhuila.parcialCrud.IService;

import com.corhuila.parcialCrud.Entity.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    List<Persona> findAll();                    // Devuelve una lista de Personas
    Optional<Persona> findById(Long id);        // Devuelve una Persona por su id
    Persona save(Persona persona);                  // Guarda una Persona
    void update(Persona persona, Long id);        // Actualiza una Persona
    void delete(Long id);

}
