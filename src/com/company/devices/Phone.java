package com.company.devices;

import java.net.URL;
import java.util.List;

public class Phone extends Device {
    public static final String address = "www.superapka.com";
    public static final String protocol = "http";
    public static final String version = "2.5.6";
    public String appName;
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

    public void installAnnApp(String appName)
    {

    }

    public void installAnnApp(String appName, String version)
    {

    }

    public void installAnnApp(String appName, String version, String serverAddress)
    {

    }

    public void installAnnApp(List<String> appNames)
    {

    }

    public void installAnnApp(URL urlAppObject)
    {

    }
}