package com.company;

/**
 * Created by Student on 10.03.2018.
 */
public abstract class Shape {
    String color = "none";

    public Shape(String color) {
        this.color = color;
    }
    public void m(){
        System.out.println("m");
    }
    public abstract void draw();
}
