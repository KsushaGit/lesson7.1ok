package com.company;

public class SuperGirl {
    @Override
    public String toString() {
        return "SuperGirl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String name;
     int age;

    public  SuperGirl(String name, int age){


        this.name = name;
        this.age = age;
    }


}
