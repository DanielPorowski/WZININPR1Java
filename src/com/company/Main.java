package com.company;


public class Main {

    public static void main(String[] args) {
        Human me = new Human();


        Animal dog = new Animal( " dog");

        Car passat = new Car("VW","passat", 100.0, "black", 1999.0, 1000.1);
        me.setCar(passat);
        me.pet = dog;

        Car passat2 = new Car("VW","passat", 100.0, "black", 1999.0, 1000.1);
        boolean areEqual = passat.equals(passat2);

        System.out.println(dog);

        System.out.println(passat.toString());
        System.out.println(dog.toString());
        System.out.println(me.toString());
        Phone phone = new Phone();
        System.out.println(phone.toString());
    }
}
