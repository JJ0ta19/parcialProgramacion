package com.corhuila.parcialCrud.IRepository;


import com.corhuila.parcialCrud.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
}
