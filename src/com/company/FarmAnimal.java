package com.company;

public class FarmAnimal extends Animal implements Eddbile {
    public FarmAnimal(String species)
    {
        super(species);
    }

    public void beEaten()
    {
        System.out.println("Be Eaten");
    }
}