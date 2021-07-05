package com.company;


import com.company.devices.Car;
import com.company.devices.LPG;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human seller = new Human();
        Human buyer = new Human();
        buyer.cash = 1000;
        Car stareAuto = new LPG("toyota", "corolla", 123.0, "blue", 2.2, 333.0, 2021);
        buyer.garage[0] = stareAuto;
        stareAuto.sell(seller, buyer, 333.0);
    }
}