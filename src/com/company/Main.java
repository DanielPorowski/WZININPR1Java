package com.company;


import com.company.devices.Application;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human ktos = new Human();
        ktos.cash = 1000;
        Application apka = new Application();
        apka.price = 555.55;
        apka.nazwaApki = "jutup";
        apka.wersja = "123,123";
        Phone tel = new Phone();
        tel.installAnnApp(apka, ktos);
        System.out.println("Czy juz ma taka apke ? : " + tel.czyJuzZainstalowana("jutup"));
        System.out.println("Ilosc apek: " + tel.iloscApek());
        tel.wypiszApki();
    }
}