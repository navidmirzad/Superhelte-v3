package com.example.superheltv3.Model;

public class Superhero {

    private String superheroName;
    private String superPowers;
    private String realName;
    private int yearCreated;
    private String isHuman;      // TODO: make boolean
    private double strength;


    public Superhero(String superheroName,String superPowers,String realName,int yearCreated,String isHuman,double strength) {
        this.superheroName = superheroName;
        this.superPowers = superPowers;
        this.realName = realName;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    public Superhero() {

    }

    public String getSuperheroName() {
        return superheroName;
    }

    public String getSuperPowers() {
        return superPowers;
    }

    public String getRealName() {
        return realName;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public String getIsHuman() {
        return isHuman;
    }

    public double getStrength() {
        return strength;
    }

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public void setSuperPowers(String superPowers) {
        this.superPowers = superPowers;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    public void setIsHuman(String isHuman) {
        this.isHuman = isHuman;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public String toString() {
        return "\n" + "--------------------" + "\n" + "SUPERHERO #" + "\n" + "--------------------"
                + "\n" + "Superhero name: " + superheroName + "\n" + "Super powers: "
                + superPowers + "\n" + "Real name: " + realName + "\n"
                + "Year created: " + yearCreated + "\n" +
                "Is human? " + isHuman + "\n" + "Strength: " + strength + "\n";
    }

}
