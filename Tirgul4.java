package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
   //3:
        Person moshe = new Person();
    //4:
        creatDog ();
    //7:
        printDog();
    //8:
        changeRating(7);
        System.out.println ();
    //9:
        creatMeals ();
        
    //12:
        createHouses ();
    }
        
        
     //4:   
     public static void creatDog()   {
     Dog blacky = new Dog("Blacky", 7, "Dogi");
    }
    
    public static void creatDog()   {
        Dog blacky = new Dog("Blacky", 7, "Dogi");
    }
    
     //8:
    public static void changeRating(int i)  {
        System.out.println ();
    }
    
    //9:
    public static void creatMeals()   {
        Meal meshubakh1 = new Meal ("Meshubakh", false, 65.23f);
        Meal meshubakh2 = new Meal ("Meshubakh",false , 60.50f);
    }
    
    //12:
    public static void createHouses() {
        House h1 = new House("Petah Tikva",100000f,"Deganya");

        House h2 = new House("Hertzeliya",102000.2f);
    }
    
    
