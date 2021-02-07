package com.company;

import lombok.ToString;

@ToString


public class Dog {
    public String name;
    public int age;
    public String brand;

    public Dog(String name, int age, String brand) {
        this.name = name;
        this.age = age;
        this.brand = brand;
    }
    //5:
    public void bark()   {
        System.out.println(String.format ("woof!woof! %s", name));
    }
}
