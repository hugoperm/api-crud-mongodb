package com.nosql.apimongodb.controller;

import com.nosql.apimongodb.model.Persona;
import com.nosql.apimongodb.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class PersonaController {
    private final PersonaService personaService;

    @PostMapping("/personas")
    public void save(@RequestBody Persona persona) {
        personaService.save(persona);
    }
    @GetMapping("/personas")
    public List<Persona> findAll() {
        return personaService.findAll();
    }
    @GetMapping("/persona/{id}")
    public Persona findById(@PathVariable String id) {
        return personaService.findById(id).get();
    }
    @DeleteMapping("/persona/{id}")
    public void deleteById(@PathVariable String id) {
        personaService.deleteById(id);
    }
    @PutMapping("/personas")
    public void update(@RequestBody Persona persona) {
        personaService.save(persona);
    }
}
