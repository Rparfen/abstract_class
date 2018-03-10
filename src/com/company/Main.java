package com.company;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", 10, 10, 10);
        shapes[1] = new Circle("blue", 10, 10, 10);
        shapes[2] = new Rectangle("blue", 10, 10, 10, 12);
        for (Shape shape : shapes) {
            shape.draw();
        }

    }
}
