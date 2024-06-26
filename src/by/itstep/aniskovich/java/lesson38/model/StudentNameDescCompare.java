package by.itstep.aniskovich.java.lesson38.model;

import java.util.Comparator;

public class StudentNameDescCompare implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            result = o1.getAge() - o2.getAge();
            if (result == 0) {
                result = Double.compare(o1.getMark(),o2.getMark());
            }
        }
        return 0;
    }
}
