package com.company.devices;
import com.company.Human;
import com.company.Sellable;
import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device implements Sellable {
    public final String producer;
    public final String model;
    public final int yearOfProduction;
    public double millage;
    public String color;
    public double engineVolume;
    public double price;
    public List<Human> owners = new ArrayList();
    public int transactionQuantity;


    public Car(String producer, String model, Double millage, String color, Double engineVolume, Double price, int yearOfProduction, Human owner){
        this.producer = producer;
        this.model = model;
        this.millage = millage;
        this.color = color;
        this.engineVolume = engineVolume;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        owners.add(owner);
        this.transactionQuantity = 0;
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
            if (owners.get(owners.size()-1) != seller)
            {
                throw new IllegalAccessException("Sprzedajacy nie jest aktualnym wlascicielem");
            }
            if (owners.get(owners.size()-1) == buyer)
            {
                throw new IllegalAccessException("Kupujacy jest aktualnym wlascicielem");
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

            owners.add(buyer);

            seller.cash += price;
            buyer.cash -= price;

            System.out.println("Transakcja sprzedazy auta powiodla sie");
        }
        catch(IllegalAccessException e)
        {
            System.out.println("Transakcja nie powiodła się.");
        }
    }

    public int checkTransactionQuantity()
    {
        return this.transactionQuantity;
    }


        public boolean hadOwner(Human person)
        {
            return owners.contains(person);
        }


    public boolean doesAsellB(Human seller, Human buyer)
    {
        if(this.hadOwner(seller) && this.hadOwner(buyer))
            if (owners.indexOf(seller) == owners.indexOf(buyer)-1)
                return true;

        return false;
    }

    public int numberOfTransaction()
    {
        return owners.size()-1;
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