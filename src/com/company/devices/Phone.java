package com.company.devices;

import com.company.Human;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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
    public Application[] aplikacje;
    public int numerApki = 0;

    public Phone()
    {
        aplikacje = new Application[10];
    }

    public String toString(){
        return "producer "+producer+"model "+model+"screenSize "+screenSize+"os "+os+"year of prod: "+ yearOfProduction;
    }

    public void TurnOn()
    {
        System.out.println("Phone turning on");
    }

    public boolean czyJuzZainstalowana(String nazwaApki)
    {
        return Arrays.asList(aplikacje).stream().filter(o -> o.nazwaApki.equals(nazwaApki)).findFirst().isPresent();
    }

    public int iloscApek()
    {
        return aplikacje.length;
    }

    public void wypiszApki()
    {
        for (int i = 0; i < aplikacje.length -1; i++) {
if (this.aplikacje[i]!=null)
{
            System.out.print("Nazwa : " + this.aplikacje[i].nazwaApki);
        }}
    }

    public void installAnnApp(Application apka, Human buyer)
    {
        if (buyer.cash >= apka.price)
        {
            aplikacje[numerApki]= apka;
            numerApki++;
            System.out.println("zainstalowano");
            buyer.cash -= apka.price;
        }

        System.out.println("Nie mozna zainstalowac");
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