package com.company;
import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;
    private Double salary;

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    private String pesel;

    public double getSalary() {
        System.out.println(new Date());
        System.out.println("wartość wypłaty " + this.salary);
        return salary;

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
