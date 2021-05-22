package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Owczarek Niemiecki");

        //dog.name = "Szarik";
        //dog.weight = 12.0;
        //dog.species = "Owczarek niemiecki";

        System.out.println(dog.name);


        dog.printName();
        dog.printNameAndOwner("Daniel");
        String text = dog.getNameAndOwner("Daniel");
        System.out.println(text);

        Human daniel = new Human();
        daniel.pet = dog;
        daniel.firstName = "Daniel";
        daniel.lastName = "JakisTam";

        System.out.println(daniel.pet.species);



    }
}
