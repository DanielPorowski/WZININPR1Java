package com.company;

public class Animal {
    final public String species;
    private Double weight;
    String name;
    Boolean furry;

    public Animal(String species) {
        this.species = species;
    }

    public Animal(Double weight, String species) {
        this.species = species;

        switch (this.species) {
            case "dog":
                this.weight = 10.0;
                break;
            case "cat":
                this.weight = 5.0;
                break;
            case "mouse":
                this.weight = 0.1;
            default:
                this.weight = 1.0;
        }
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    void feed() {
        if (this.weight > 0){
            this.weight += 1.0;
            System.out.println("thx for food" + this.weight);
            }
        else {

        }

    }

    void takeForWalk() {
        if (this.weight > 0){
            this.weight += 1.0;
            System.out.println("thx nice walk");
            else {
                System.out.println();
            }

        }

    }

    void printName() {
        System.out.println("my name is: " + this.name);
    }

    void printNameAndOwner(String owner) {
        System.out.println(owner + " has " + this.name);
    }

    Double getWeight() {
        return this.weight;
    }

    String getNameAndOwner(String owner) {
        return owner + " has " + this.name;
    }
}
