package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Person vitya = new Person(120, "Vitya");
        vitya.say("George");
    System.out.println(vitya.name + " Name is:" + vitya.height);
    Person vlad = new Person();
    System.out.println(vlad.height);
    System.out.println("");

    Student freshman = new Student(76, "viktor", 2);
//    System.out.println(freshman.name);
        Student fresh = new Student(150, "Vlad", 4);
    freshman.tell();
    fresh.tell();
    System.out.println("");
    System.out.println("Полиморфизм");
    Shape [] arr = new Shape[] {new Circle(), new Square(), new Triangle()};
    for (int i=0; i< arr.length; i++){  //цикл создания массива из классов
        arr[i].draw();
    }

    }
}
