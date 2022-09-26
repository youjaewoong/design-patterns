package me.easytodo.designpatterns._01_creational_patterns._04_builder._03_java;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("easytodo").append("hardtodo").toString();
        System.out.println(result);
    }
}
