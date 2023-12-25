package com.driver;

public class Teacher {

    private String name;

    private int numberOfStudents;

    private int age;


    public Teacher(String name,int numberOfStudents,int age){
        this.name=name;
        this.numberOfStudents=numberOfStudents;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }
     public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents=numberOfStudents;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return this.name;
    }
    public double getNumberOfStudents(){
        return this.numberOfStudents;
    }
    public int getAge(){
        return this.age;
    }
  
}
