package edu.dtcc.emailman;

import java.util.Comparator;

public class GeometricObjectComparator implements Comparator<GeometricObject> {

    @Override
    public int compare(GeometricObject g1, GeometricObject g2) {
        if (g1.getArea() > g2.getArea())
            return 1;
        else if (g1.getArea() < g2.getArea())
            return -1;
        else
            return 0;
    }
}




