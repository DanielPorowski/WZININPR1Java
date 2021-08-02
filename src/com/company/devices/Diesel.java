package com.company.devices;

import com.company.Human;

public class Diesel extends Car {
    public Diesel(String producer, String model, Double millage, String color, Double engineVolume, Double price, int yearOfProduction, Human owner) {
        super(producer, model, millage, color, engineVolume, price, yearOfProduction, owner);
    }
    public void refuel()
    {
        System.out.println("Refuel the diesel");
    }
}