package com.company;

/**
 * Created by Student on 10.03.2018.
 */
public class Circle extends Shape{
    int x, y, z;

    public Circle(String color, int x, int y, int z) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
