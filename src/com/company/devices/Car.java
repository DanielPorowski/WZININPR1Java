package com.company.devices;


public abstract class Car extends Device {
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