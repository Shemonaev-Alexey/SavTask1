package ru.tinkoff.qa.task6;

public class Student {
    int age;
    String name;
    String gender;

    Student(String n, String g, int a) {
        name = n;
        gender = g;
        age = a;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
