package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final List<Double> grades = new ArrayList<>();
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public void addGrades(List<Double> grades) {
        this.grades.addAll(grades);
    }

    public double getAverageGrade() {
        return grades.stream().mapToDouble(x -> x).average().getAsDouble();
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", average grade=" + getAverageGrade() + "]";
    }
}
