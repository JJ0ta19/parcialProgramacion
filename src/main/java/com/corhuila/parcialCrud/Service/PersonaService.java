package com.corhuila.parcialCrud.Service;

import com.corhuila.parcialCrud.Entity.Persona;
import com.corhuila.parcialCrud.IRepository.IPersonaRepository;
import com.corhuila.parcialCrud.IService.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository repository;

    @Override
    public List<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Persona> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Persona save(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Persona persona, Long id) {
        //Obtener el objeto persona y el id
        //Verificar con el id, si exiten los datos
        Optional<Persona> ps = repository.findById(id);

        //Cargar nuevo objeto
        if (!ps.isEmpty()){

            Persona personaUpdate = ps.get();
            personaUpdate.setNombre(personaUpdate.getNombre());
            personaUpdate.setApellido(personaUpdate.getApellido());
            personaUpdate.setBarrio(personaUpdate.getBarrio());
            personaUpdate.setTelefono(personaUpdate.getTelefono());


            //Actualizar el objeto persona
            repository.save(personaUpdate);
        }else{
            System.out.println("No existe la persona");
        }
    }



}
