package com.company.devices;

import com.company.Human;

import java.net.URL;
import java.util.*;

public class Phone extends Device {
    public static final String address = "www.superapp.com";
    public static final String protocol = "http";
    public static final String version = "2.5.6";
    public String appName;
    public String producer;
    public String model;
    public int yearOfProduction;
    public Double screenSize;
    public String os;
    public Set<Application> applications = new TreeSet<>();
    public int Appnumber = 0;
    Comparator<Application> compareByPrice = (Application app1, Application app2) ->
            app1.price.compareTo( app2.price );



    public String toString(){
        return "producer "+producer+"model "+model+"screenSize "+screenSize+"os "+os+"year of prod: "+ yearOfProduction;
    }

    public void TurnOn()
    {
        System.out.println("Phone turning on");
    }

    public boolean isItInstalled(Application app)
    {
        return applications.contains(app);
    }
    public boolean isItInstalled(String appName)
    {
        for(Application app: applications) {
            if(app.appName == appName) return true;
        }
        return false;
    }
    public int appQuantity()
    {
        return applications.size();
    }

    public void displayApps()
    {
        for(Application app: applications) {
            System.out.println("Name : " +app.appName);
        }
    }
    public void freeApps()
    {
        for(Application app: applications) {
            if(app.price == 0) System.out.println("Name : " +app.appName);
        }
    }

    public double costOfAllApps()
    {
        double  sum = 0;
        for(Application app: applications)
            sum += app.price;

        return sum;
    }
    public void installAnnApp(Application app, Human buyer)
    {
        if (buyer.cash >= app.price && !applications.contains(app))
        {
            applications.add(app);
            System.out.println("Installed");
            buyer.cash -= app.price;
        }
        else
        {
            System.out.println("Cant install an Application");
        }
    }
    public void displayByPrice(){
        List<Application> apps = new ArrayList();
        for(Application app: applications)
            apps.add(app);


        Collections.sort(apps, compareByPrice);

        for (Application app: apps)
            System.out.println("Name: " + app.appName);
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