package edu.dtcc.emailman;

import java.util.Comparator;

public class TestComparator {


    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(5, "BEIGE");
        GeometricObject square1 = new Square(5, "RED");

        System.out.println(circle1.getArea() + " " + square1.getArea());

        GeometricObject g = max(circle1, square1, new GeometricObjectComparator());

        if (g instanceof Circle)
            System.out.printf("The circle is the ");
        else
            System.out.printf("The square is the ");

        System.out.printf("object with largest area of %.2f and is %s\n", g.getArea(), g.getColor());
    }

    private static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c) {
        if (c.compare(g1, g2) > 0)
            return g1;
        else
            return g2;
    }
}

abstract class GeometricObject {
    private String color;

    GeometricObject(String c) {
        color = c;
    }

    public abstract double getArea();

    String getColor() {
        return color;
    }
}

class Circle extends GeometricObject {
    private double radius;

    Circle(double r, String c) {
        super(c);
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends GeometricObject {
    private double side;

    Square(double s, String c) {
        super(c);
        side = s;
    }

    public double getArea() {
        return side * side;
    }
}

