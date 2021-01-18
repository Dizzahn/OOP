package com.company;

public class Person {   // родительский класс
    public int height = 180;
    public String name = "Default";

    public void say(String name) {
        System.out.println("Hello, " + name);
    }
     public Person(int h, String n) {    //конструктор класса c параметром h
        height = h;
        name = n;
     }
    public Person() {    //конструктор класса без параметров
    }

}

