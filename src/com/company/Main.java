package com.company;


import com.company.devices.Application;
import com.company.devices.Car;
import com.company.devices.LPG;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human seller = new Human();
        Human buyer = new Human();
        buyer.cash = 1000;
        Car OldCar = new LPG("toyota", "corolla", 123.22, "blue", 2.2, 333.22, 2021, seller);
        buyer.garage[0] = OldCar;
        OldCar.sell(seller, buyer, 333.0);

        System.out.println("Czy doszlo miedzy nimi do transakcji ? : " + OldCar.doesAsellB(seller, buyer));
        System.out.println("Czy auto mialo wlasciciela ? : " + OldCar.hadOwner(buyer));
        System.out.println("Liczba transakcji ? : " + OldCar.numberOfTransaction());



        /*
        Human Daniel = new Human();
        Daniel.cash = 1000;
        Application app = new Application();
        app.price = 0.0;
        app.appName = "Weather Forecast";
        app.version = "1,003";
        Phone tel = new Phone();
        tel.installAnnApp(app, Daniel);
        app = new Application();
        app.price = 75.0;
        app.appName = "Tibia";
        app.version = "37,21.0";
        tel.installAnnApp(app, Daniel);
        System.out.println("DOes he have this app ? : " + tel.isItInstalled(app.appName));
        System.out.println("App quantity: " + tel.appQuantity());
        tel.displayApps();
        tel.freeApps();
        System.out.println("Cost of all APPs: " + tel.costOfAllApps());
        tel.displayByPrice();
 */
    }
}