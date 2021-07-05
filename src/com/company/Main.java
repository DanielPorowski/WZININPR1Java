package com.company;


import com.company.devices.Car;
import com.company.devices.LPG;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human seller = new Human();
        Human buyer = new Human();
        buyer.cash = 1000;
        Car stareAuto = new LPG("toyota", "corolla", 123.22, "blue", 2.2, 333.22, 2021);
        buyer.garage[0] = stareAuto;
        stareAuto.sell(seller, buyer, 333.0);

        System.out.println("Czy doszlo miedzy nimi do transakcji ? : " + stareAuto.czyAsprzedalB(seller, buyer));
        System.out.println("Czy auto mialo wlasciciela ? : " + stareAuto.czyMialWlasciciela());
    }
}