package com.nosql.apimongodb.service;

import com.nosql.apimongodb.model.Persona;
import com.nosql.apimongodb.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonaService {
    private final PersonaRepository personaRepository;

    public void save(Persona persona) {
        personaRepository.save(persona);
    }
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }
    public Optional<Persona> findById(String id) {
        return personaRepository.findById(id);
    }
    public void deleteById(String id){
        personaRepository.deleteById(id);
    }
}
