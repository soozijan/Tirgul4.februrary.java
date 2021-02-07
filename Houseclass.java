package com.company;

import lombok.ToString;

@ToString

public class House {
    public final String adress;
    public final float size;
    public String name;

    public House(String adress, float size, String name) {
        this.adress = adress;
        this.size = size;
        this.name = name;
    }

    public House(String adress, float size) {
        this.adress = adress;
        this.size = size;
    }

}
