package com.example.superheltv3.Controller;

import com.example.superheltv3.Model.Superhero;
import com.example.superheltv3.Services.SuperheroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("superheroes")
public class SuperheroController {

    private SuperheroService superheroService;

    public SuperheroController(SuperheroService superheroService) {
        this.superheroService = superheroService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Superhero>> getListOfSuperheroes() {
        List listOfSuperheroes = superheroService.getSuperheroes();
        return new ResponseEntity<List<Superhero>>(listOfSuperheroes, HttpStatus.OK);
    }

    @GetMapping("/{superheroName}")
    public ResponseEntity<Superhero> getSuperHero(@PathVariable String superheroName) {
        Superhero superhero = superheroService.searchForSuperhero(superheroName);
        return new ResponseEntity<>(superhero, HttpStatus.OK);
    }

    // createSuperHero TODO: finish it, doesnt work rn
    /*@GetMapping("/create")
    public ResponseEntity<List<Superhero>> createSuperHero() {
        List listOfSuperheroes = superheroService.createSuperhero();
        return new ResponseEntity<List<Superhero>>(listOfSuperheroes, HttpStatus.OK);
    }*/


    // deleteSuperHero TODO: finish it, doesnt work rn
    /*@GetMapping("/delete/{superheroName}")
    public ResponseEntity<List<Superhero>> deleteSuperhero() {
        List listOfSuperHeroes = superheroService.deleteSuperhero();
        return new ResponseEntity<List<Superhero>>(listOfSuperHeroes, HttpStatus.OK);
    }*/

}
