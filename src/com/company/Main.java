package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        String[] a={"Abdunuur","Azamat","Nursultan"};
        Students students = new Students("Abdunuur", LocalDate.of(2005,07,21),"abdunuura@gmail.com");
        Gruppa gruppa = new Gruppa(a,"Java",LocalDate.of(2022,01,3));
        String[] b = {"Java 1","JAva 2","Java 3","Java 4","Java 5"};
        Kurs kurs = new Kurs("Java Peaksoft",5,"Beksultan",b);
        System.out.println(students);
        System.out.println(gruppa);
        System.out.println(kurs);




    }
}
