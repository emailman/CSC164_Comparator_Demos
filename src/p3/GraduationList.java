package p3;

import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Collections.sort;

public class GraduationList {
    public static void main(String[] args) {
        ArrayList<GraduationGroup> graduationList = new ArrayList<>();
        graduationList.add(new GraduationGroup("George", "CT", "CIS"));
        graduationList.add(new GraduationGroup("Terry", "CT", "CIS"));
        graduationList.add(new GraduationGroup("Owens", "CT", "CIS"));
        graduationList.add(new GraduationGroup("George", "CT", "CSC"));
        graduationList.add(new GraduationGroup("George", "CT", "CNE"));
        graduationList.add(new GraduationGroup("Terry", "CT", "CNE"));
        graduationList.add(new GraduationGroup("Owens", "CT", "CNE"));
        graduationList.add(new GraduationGroup("Owens", "BUS", "MGT"));
        graduationList.add(new GraduationGroup("Terry", "BUS", "MGT"));
        graduationList.add(new GraduationGroup("George", "BUS", "MGT"));
        graduationList.add(new GraduationGroup("Owens", "BUS", "ENT"));
        graduationList.add(new GraduationGroup("Terry", "BUS", "ENT"));
        graduationList.add(new GraduationGroup("George", "BUS", "ENT"));

        Comparator<GraduationGroup> c = new GraduationCeremonyComparator();
        sort(graduationList, c);

        System.out.println("DTCC Graduation Groups");
        System.out.println("Campus\tDepartment\tDegree");
        for (GraduationGroup each : graduationList)
            System.out.printf("%s\t%s\t\t\t%s\n", each.campus, each.department, each.degree);
    }
}
