package p2;

import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Collections.sort;

public class TestComparator {

    public static void main(String[] args) {
        ArrayList<GeometricObject> geometricObjects = new ArrayList<GeometricObject>();
        geometricObjects.add(new Circle(5, "BEIGE"));
        geometricObjects.add(new Square(5, "RED"));
        geometricObjects.add(new Circle(4, "WHITE"));
        geometricObjects.add(new Square(6, "YELLOW"));

        System.out.println("Original list:");
        String name;
        for (GeometricObject each : geometricObjects) {
            if (each instanceof Circle)
                name = "Circle";
            else
                name = "Square";

            System.out.println(name + ": " + each.getArea() + " " + each.getColor());
        }

        Comparator<GeometricObject> c = new GeometricObjectComparator();
        sort(geometricObjects, c);

        System.out.println("\nSorted list:");
        for (GeometricObject each : geometricObjects) {
            if (each instanceof Circle)
                name = "Circle";
            else
                name = "Square";

            System.out.println(name + ": " + each.getArea() + " " + each.getColor());
        }
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
