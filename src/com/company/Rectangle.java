package com.company;

/**
 * Created by Student on 10.03.2018.
 */
public class Rectangle extends Shape {
    int x, y, z, s;

    public Rectangle(String color, int x, int y, int z, int s) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
        this.s = s;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
