package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;
//10
@ToString
@AllArgsConstructor
public class Meal {

    public String name;
    public boolean vigan;
    public float price;

    /*public Meal(String name, boolean vigan, float price) {
        this.name = name;
        this.vigan = vigan;
        this.price = price;
    }*/
}
