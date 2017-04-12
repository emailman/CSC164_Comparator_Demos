package p3;

import java.util.Comparator;

class GraduationCeremonyComparator implements Comparator<GraduationGroup> {
    @Override
    public int compare(GraduationGroup o1, GraduationGroup o2) {
        int value1 = o1.campus.compareTo(o2.campus);
        if (value1 == 0) {
            int value2 = o1.department.compareTo(o2.department);
            if (value2 == 0)
                return o1.degree.compareTo(o2.degree);
            else
                return value2;
        }
        return value1;
    }
}
