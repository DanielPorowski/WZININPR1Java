package com.company;


import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Car autko = new Car("Toyota", "Corolla", 123.2, "blue", 2.5, 123.45, 2021);
        Phone telefonik = new Phone();

        autko.TurnOn();
        telefonik.TurnOn();
    }
}