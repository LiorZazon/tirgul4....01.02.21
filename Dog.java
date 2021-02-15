package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@ToString

public class Dog {

    public String name;
    public int age;
    public String brand;

    //targil 5:

    public void bark() {
        System.out.println(String.format("woof, woof %s", name));
    }
}