package by.itstep.aniskovich.java.lesson38.model;

import java.util.Objects;

public class Student extends Object implements Comparable<Student>{
    private String name;
    private int age;
    private int mark;

    public Student() {
    }

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && mark == student.mark
                && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mark);
    }


    //    public int hashCode(){
////        System.out.println("hashCode from " + name);
//        return 10;
//    }
//
//    public boolean equals(Object obj) {
//
//        return (this == obj);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
//        if (o.mark > mark) {
//            return 1;
//        } else if (o.mark < mark) {
//            return -1;
//        }
//
//        return Double.compare(o.mark, mark);
//        return o.mark - mark;
        return name.compareTo(o.name);
    }
}
