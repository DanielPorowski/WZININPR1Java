package com.company.devices;


import com.company.Human;
import com.company.Sellable;

public abstract class Car extends Device implements Sellable {
    public final String producer;
    public final String model;
    public final int yearOfProduction;
    public double millage;
    public String color;
    public double engineVolume;
    public double price;

    public Car(String producer, String model, Double millage, String color, Double engineVolume, Double price, int yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.millage = millage;
        this.color = color;
        this.engineVolume = engineVolume;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }

    public void sell(Human seller, Human buyer, Double price)
    {
        try
        {
            if (seller.garage.length == 0)
            {
                throw new IllegalAccessException("Sprzedajacy nie ma aut");
            }
            if (buyer.garage[0] != null && buyer.garage[1] != null && buyer.garage[2] != null)
            {
                throw new IllegalAccessException("Kupujacy nie ma miejsca w garazu");
            }
            if (buyer.cash < price)
            {
                throw new IllegalAccessException("Kupujacy nie ma pieniedzy");
            }

            if (buyer.garage[0] == null)
            {
                buyer.garage[0] = this;
            }
            if (buyer.garage[1] == null)
            {
                buyer.garage[1] = this;
            }
            if (buyer.garage[2] == null)
            {
                buyer.garage[2] = this;
            }

            seller.cash += price;
            buyer.cash -= price;

            System.out.println("Transakcja sprzedazy auta powiodla sie");
        }
        catch(IllegalAccessException e)
        {
            System.out.println("Transakcja nie powiodła się.");
        }
    }

    public boolean equals(Object obj) {
        return (this == obj);
    }

    public String toString(){
        return "producer: "+producer+"model: "+model+"color: "+color+"engineVolume: "+engineVolume+"price: "+price+"year of prod: "+ yearOfProduction;
    }

    public void TurnOn()
    {
        System.out.println("Car turning on");
    }

    abstract void refuel();
}