package com.company.devices;


public abstract class Device {
    String producer;
    String model;
    int yearOfProduction;

    abstract void TurnOn();
}