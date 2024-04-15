package com.corhuila.parcialCrud.Controller;

import com.corhuila.parcialCrud.Entity.Persona;
import com.corhuila.parcialCrud.IService.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/persona")
@Controller
public class PersonaController {

    //Inyectar el servicio
    @Autowired
    private IPersonaService service;

    @GetMapping()
    public List<Persona> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Persona> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping()
    public Persona save(@RequestBody Persona persona) {
        return service.save(persona);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Persona persona, @PathVariable Long id) {
        service.update(persona, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }




}
