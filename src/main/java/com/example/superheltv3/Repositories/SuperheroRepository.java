package com.example.superheltv3.Repositories;

import com.example.superheltv3.Model.Superhero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperheroRepository {


    private boolean changeMade = false;

    private List<Superhero> superheroes = List.of(
            new Superhero("proGamer", "nerdy", "Navid", 2000, "no", 1337),
            new Superhero("McJuiicy", "JuicePresser", "Morty", 123, "yes", 456));


    public void createSuperhero(String superheroName, String superPowers, String realName, int yearCreated,
                                String isHuman, double strength) {
                     Superhero superhero = new Superhero(superheroName,
                    superPowers, realName, yearCreated, isHuman, strength);
        superheroes.add(superhero);
        changeBeenMade();
    }

    public List<Superhero> getSuperheroes() {
        return superheroes;
    }

    public List<Superhero> searchSuperhero(String superheroName) {

        ArrayList<Superhero> superheroesMatch = new ArrayList<>();

        for (Superhero søgning : superheroes) {
            if (søgning.getSuperheroName().toLowerCase().startsWith(superheroName.toLowerCase())) {

                superheroesMatch.add(søgning);
            }

        }
        return superheroesMatch;
    }

    public void editSuperhero(int index, String superheroName, String superPowers, String realName, int yearCreated, String isHuman, double strength) {
        Superhero superhero = superheroes.get(index - 1);
        if (!superheroName.isEmpty()) {
            superhero.setSuperheroName(superheroName);
            changeBeenMade();
        }

        if (!superPowers.isEmpty()) {
            superhero.setSuperPowers(superPowers);
            changeBeenMade();
        }

        if (!realName.isEmpty()) {
            superhero.setRealName(realName);
            changeBeenMade();
        }

        if (yearCreated != 0) {
            superhero.setYearCreated(yearCreated);
            changeBeenMade();
        }

        if (strength != 0) {
            superhero.setStrength(strength);
            changeBeenMade();
        }

        if (!isHuman.isEmpty()) {
            superhero.setIsHuman(isHuman);
            changeBeenMade();
        }
    }

    public void deleteSuperhero(int index) {
        Superhero superhero = superheroes.get(index - 1);
        superheroes.remove(superhero);
        changeBeenMade();
    }

    public void changeBeenMade() {
        changeMade = true;
    }

    public void changeNotMade() {
        changeMade = false;

    }

    public boolean getChangeMade() {
        return changeMade;
    }


}
