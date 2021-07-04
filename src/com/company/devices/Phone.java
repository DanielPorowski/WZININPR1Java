package com.company.devices;

public class Phone extends Device {
    public String producer;
    public String model;
    public int yearOfProduction;
    public Double screenSize;
    public String os;

    public String toString(){
        return "producer "+producer+"model "+model+"screenSize "+screenSize+"os "+os+"year of prod: "+ yearOfProduction;
    }

    public void TurnOn()
    {
        System.out.println("Phone turning on");
    }
}