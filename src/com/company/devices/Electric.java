package com.company.devices;

public class Electric extends Car {
    public Electric(String producer, String model, Double millage, String color, Double engineVolume, Double price, int yearOfProduction) {
        super(producer, model, millage, color, engineVolume, price, yearOfProduction);
    }
    public void refuel()
    {
        System.out.println("Load battery");
    }
}