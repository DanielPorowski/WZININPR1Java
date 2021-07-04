package com.company;


import com.company.devices.*;
import com.company.devices.Diesel;
import com.company.devices.Electric;

public class Main {

    public static void main(String[] args) {
        // String producer, String model, Double millage, String color, Double engineVolume, Double price, int yearOfProduction
        LPG gazol = new LPG("toyota", "corolla", 123.0, "blue", 22.22, 123.32, 2021);
        Diesel ropol = new Diesel("toyota", "avensis", 321.0, "black", 22.22, 123.32, 2021);
        Electric tesla = new Electric("Elon", "Tesla PD 123", 333.0, "red", 22.22, 123.32, 2021);
        gazol.refuel();
        ropol.refuel();
        tesla.refuel();
    }
}