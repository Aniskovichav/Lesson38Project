package by.itstep.aniskovich.java.lesson38.model;

import java.util.Comparator;

public class StudentMarkDescCompare implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        int result = Double.compare(o1.getMark(),o2.getMark());
        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
            if (result == 0) {
                result = o1.getAge() - o2.getAge();
            }
        }
        return 0;
    }
}
