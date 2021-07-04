package com.company;


import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human seller = new Human();
        seller.phone = new Phone();
        seller.pet = new Pet("dog");
        Human buyer = new Human();
        buyer.cash = 1000.;
        seller.phone.sell(seller, buyer, 400.0);
        seller.pet.sell(seller, buyer, 500.0);
    }
}