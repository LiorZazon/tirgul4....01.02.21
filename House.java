package com.company;

public class House {

    public final String address;
    public final float terittory;
    public String name;

    public House(String address, float terittory) {
        this.address = address;
        this.terittory = terittory;
    }

    public House(String address, float terttory, String name) {
        this.address = address;
        this.terittory = terttory;
        this.name = name;


    }
}
