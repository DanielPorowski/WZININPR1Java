package com.company.devices;


import com.company.Human;
import com.company.Sellable;

public abstract class Device implements Sellable {
    String producer;
    String model;
    int yearOfProduction;
    Double value;

    abstract void TurnOn();

    public void sell(Human seller, Human buyer, Double price)
    {
        if (seller.phone != null)
        {
            if (buyer.cash >= price)
            {
                seller.cash += price;
                buyer.cash -= price;

                buyer.phone = seller.phone;
                seller.phone = null;

                System.out.println("Sprzedano telefon za " + price + "pinindzy");
            }
        }
    }
}