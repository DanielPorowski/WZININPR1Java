package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary;

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

    public Car getCar()
    {
        return this.car;
    }

    public double getSalary() {
        System.out.println(new Date());
        System.out.println("wartość wypłaty " + this.salary);
        return salary;
    }

    public void setCar(Car newCar)
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