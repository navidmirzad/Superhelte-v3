package com.example.superheltv3.Controller;


import com.example.superheltv3.Model.Superhero;
import com.example.superheltv3.Services.SuperheroService;
import org.springframework.http.HttpStatus;
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

    @GetMapping(path = "/{id}")
    public ResponseEntity<List<Superhero>> getSpecifikSuperhero(@PathVariable String id) { //superheroName == id;
        List listOfSuperheroes = superheroService.searchSuperhero(id);
        return new ResponseEntity<List<Superhero>>(listOfSuperheroes, HttpStatus.OK);
    }



}
