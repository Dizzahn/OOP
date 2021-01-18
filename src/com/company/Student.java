package com.company;

public class Student extends Person {   // класс student у4наследует все от Person
    int course = 1;
    public Student(int height, String name, int course){
        super(height, name);
        this.course = course;  // this объяснение компилятору какой именно course
    }
    void tell () {
        System.out.println("Height " + super.height);  // super для полей в родительском классе
        System.out.println("Name" + super.name);
        System.out.println("course" + course);
    }

}
