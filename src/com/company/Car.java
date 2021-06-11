package com.company;


public class Car {
    public final String producer2;
    public final String model2;
    public double millage;
    public String color;
    public double engineVolume;
    public double price;

    public Car(String producer2, String model2, Double millage, String color, Double engineVolume, Double price){
        this.producer2 = producer2;
        this.model2 = model2;
        this.millage = millage;
        this.color = color;
        this.engineVolume = engineVolume;
        this.price = price;
    }

    public boolean equals(Object obj) {
        return (this == obj);
    }

    public String toString(){
        return "producer: "+producer2+"model2: "+model2+"color: "+color+"engineVolume: "+engineVolume+"price: "+price;
    }
}