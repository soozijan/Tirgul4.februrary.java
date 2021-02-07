package com.company;

import lombok.ToString;

import java.sql.Time;

@ToString


public class Movie {


    public final String name;
    public final Time exit;
    public float number;
    public String Story;

    public static int movie_counter = 0;
    public static final int ratingForOscar = 9;


    public Movie(String name, Time exit, float number, String story) {
        this.name = name;
        this.exit = exit;
        this.number = number;
        Story = story;
    }

    public void resetCounter() {
        movie_counter = 0;
    }

    public boolean isWonOscar() {
        if (number > ratingForOscar) {
            return true;

        }


        return false;
    }
}
