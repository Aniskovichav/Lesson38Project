package by.itstep.aniskovich.java.lesson38.controller;

import by.itstep.aniskovich.java.lesson38.model.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(67);
        set.add(12);
        set.add(7);
        set.add(89);
        set.add(111);
        set.add(3);

        for (int num : set) {
            System.out.println(num);
        }

        Student student = new Student("Alex", 20, 9);

        System.out.println(student);
    }
}
