package com.example.superheltv3.Services;

import com.example.superheltv3.Model.Superhero;
import com.example.superheltv3.Repositories.SuperheroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroService {

    private SuperheroRepository superheroRepository;

    public SuperheroService(SuperheroRepository superheroRepository) {
        this.superheroRepository = superheroRepository;
    }

    public Superhero createSuperhero(Superhero superhero) {
        return superheroRepository.createSuperhero(superhero);
    }

    public List<Superhero> getSuperheroes() {
        return superheroRepository.getSuperheroes();
    }

    public Superhero searchForSuperhero(String superheroName) {
        return superheroRepository.searchForSuperhero(superheroName);
    }

    public Superhero editSuperhero(Superhero superhero) {
        return superheroRepository.editSuperhero(superhero);
    }

    public Superhero deleteSuperhero(Superhero superhero) {
       return superheroRepository.deleteSuperhero(superhero);
    }

}
