package com.company;


public class Main {

    public static void main(String[] args) {
        Human me = new Human();


        Animal dog = new Animal( " dog");

        Car passat = new Car("VW","passat", 100.0, "black", 1999.0, 1000.1);
        me.setCar(passat);
        me.pet = dog;



    }

}
