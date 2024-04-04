package by.itstep.aniskovich.java.lesson38.controller;

import by.itstep.aniskovich.java.lesson38.model.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("Alex", 20, 8));
        set.add(new Student("Nick", 22, 7));
        set.add(new Student("Alice", 21, 9));
        set.add(new Student("Neo", 23, 10));
        set.add(new Student("Mike", 24, 6));
//        set.add(new Student("Alex", 20, 8));
//        set.add(new Student("Nick", 22, 7));
//        set.add(new Student("Alice", 21, 9));
//        set.add(new Student("Neo", 23, 10));
//        set.add(new Student("Mike", 24, 6));

        System.out.println("________________");
        for (Student student : set) {
//            System.out.println(student + " \t " + student.hashCode());
            System.out.println(student);
        }
        
        
//        Set<Integer> set = new LinkedHashSet<>();
//        set.add(5);
//        set.add(67);
//        set.add(12);
//        set.add(7);
//        set.add(89);
//        set.add(111);
//        set.add(3);
//        set.add(5);
//        set.add(67);
//        set.add(12);
//        set.add(7);
//        set.add(89);
//        set.add(111);
//        set.add(3);
//
//        for (int num : set) {
//            System.out.print(num + " ");
//        }

//        Student student = new Student("Alex", 20, 9);
//
//        System.out.println(student);
    }
}
