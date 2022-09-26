package me.easytodo.designpatterns._01_creational_patterns._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student keesun = new Student("Jaewoong");
        Student easytodo = new Student("easytodo");
        List<Student> students = new ArrayList<>();
        students.add(keesun);
        students.add(easytodo);

        //shallow copy
        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
