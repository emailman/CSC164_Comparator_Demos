package p1;

import java.util.Comparator;

class GeometricObjectComparator implements Comparator<GeometricObject> {

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




