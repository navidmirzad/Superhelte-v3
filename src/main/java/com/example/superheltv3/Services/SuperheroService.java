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

    public void createSuperhero(String superheroName, String superPowers, String realName,
                                int yearCreated, String isHuman, double strength) {
        superheroRepository.createSuperhero(superheroName, superPowers, realName, yearCreated, isHuman, strength);
    }

    public List<Superhero> getSuperheroes() {
        return superheroRepository.getSuperheroes();
    }

    public List<Superhero> searchSuperhero(String superheroName) {
        return superheroRepository.searchSuperhero(superheroName);
    }

    public Superhero searchForSuperhero(String superheroName) {
        return superheroRepository.searchForSuperhero(superheroName);
    }

    public void editSuperhero(int index, String superheroName, String superPowers, String realName,
                              int yearCreated, String isHuman, double strength) {
        superheroRepository.editSuperhero(index,superheroName,superPowers,realName,yearCreated,isHuman,strength);
    }

    public void deleteSuperhero(int index) {
        superheroRepository.deleteSuperhero(index);
    }

}
