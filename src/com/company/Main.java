package com.company;


import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        FarmAnimal farmAnimalek = new FarmAnimal("dog");
        Pet petek = new Pet("dog");;
        farmAnimalek.feed();
        farmAnimalek.feed(20);
        petek.feed();
        petek.feed(15);
    }
}