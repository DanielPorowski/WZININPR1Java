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
    public Human[] owners;
    public int iloscTransakcji;

    public Car(String producer, String model, Double millage, String color, Double engineVolume, Double price, int yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.millage = millage;
        this.color = color;
        this.engineVolume = engineVolume;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.owners = new Human[3];
        this.iloscTransakcji = 0;
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
            if (this.owners[2] != seller)
            {
                throw new IllegalAccessException("Sprzedajacy nie jest aktualnym wlascicielem");
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

            this.owners[0] = this.owners[1];
            this.owners[1] = this.owners[2];
            this.owners[2] = buyer;

            iloscTransakcji++;

            seller.cash += price;
            buyer.cash -= price;

            System.out.println("Transakcja sprzedazy auta powiodla sie");
        }
        catch(IllegalAccessException e)
        {
            System.out.println("Transakcja nie powiodła się.");
        }
    }

    public int sprawdzIloscTransakcji()
    {
        return this.iloscTransakcji;
    }

    public boolean czyMialWlasciciela()
    {
        boolean result = true;
        if(this.owners[0] == null && this.owners[1] == null && this.owners[2] == null)
        {
            result = false;
        }
        return result;
    }

    public boolean czyAsprzedalB(Human aaa, Human bbb)
    {
        if (this.owners[2] == bbb && this.owners[1] == aaa)
        {
            return true;
        }
        return false;
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