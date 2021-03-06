package com.company;

public abstract class Animal implements Feedable, Sellable {
    final public String species;
    private Double weight;
    String name;
    Boolean furry;

    public Animal(String species) {
        this.species = species;
    }

    public void sell(Human seller, Human buyer, Double price)
    {
        if (seller.pet != null)
        {
            if (buyer.cash >= price)
            {
                seller.cash += price;
                buyer.cash -= price;

                buyer.pet = seller.pet;
                seller.pet = null;

                System.out.println("Animal was selled for " + price + "$$$$");
            }
        }
    }

    public String toString(){
        return "species: "+species+"weight: "+weight+"name: "+name+"furry: "+furry;
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

    public void feed() {
        if (this.weight > 0){
            this.weight += 1.0;
            System.out.println("thx for food" + this.weight);
        }
        else {

        }
    }

    public void feed(int foodWeight) {
        System.out.println("thx for food" + foodWeight);
    }

    void takeForWalk() {
        if (this.weight > 0){
            this.weight -= 0.2;
            System.out.println("thx nice walk, ,y weight" + this.weight);

        }
        else {
            System.out.println("You cant walk with dead dog on the street ");
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