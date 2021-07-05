package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;
import java.util.Arrays;
import java.util.Date;
import java.util.*;


public class Human {
    String firstName;
    public double cash = 0.0;
    String lastName;
    public Phone phone;
    Animal pet;
    public Car[] garage;
    public Double salary;
    public Car car;


    public Human()
    {
        garage = new Car[3];
    }

    public String toString(){
        return "firstName: "+firstName+"lastName:  "+lastName+"phone:  "+phone+"pet:  "+pet+"car:  "+car+"salary:  "+salary;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    private String pesel;

    public Car getCar(int miejsceparkingowe)
    {
        return this.car;
    }

    public double getGarageValue()
    {
        double value = 0;

        for(int i = 0; i< garage.length; i++){

            value += garage[i].price;

        }

        return value;
    }

    public void sortCars()
    {
        Double[] cars = new Double []{ garage[0].price, garage[1].price, garage[2].price};
        Car[] tempCars = new Car[]{};

        Arrays.sort(cars);

        for(int i = 0; i< garage.length; i++){

            if (garage[i].price == cars[0])
            {
                tempCars[0] = garage[i];
            }
            if (garage[i].price == cars[1])
            {
                tempCars[1] = garage[i];
            }
            if (garage[i].price == cars[2])
            {
                tempCars[2] = garage[i];
            }

        }
    }

    public double getSalary() {
        System.out.println(new Date());
        System.out.println("wartość wypłaty " + this.salary);
        return salary;
    }

    public void setCar(Car newCar, int miejsceparkingowe)
    {
        if (salary > newCar.price)
        {
            System.out.println("Samochód udało się kupić za gotówkę");
            this.car = newCar;
        }
        else if (salary > newCar.price/12)
        {
            System.out.println("Udało się kupić na kredyt (no trudno)");
            this.car = newCar;
        }
        else
        {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }

    public void setSalary(double salary) {
        if (salary < 0)
        {
            System.out.println("Nie można przypisać ujemnej wartości wypłaty");
        }

        System.out.println("Nowe dane zostały wysłane do systemu księgowego");
        System.out.println("Jest koniecznosc odebrania aneksu do umowy od pani Hani z kadr");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");

        this.salary = salary;
    }
}