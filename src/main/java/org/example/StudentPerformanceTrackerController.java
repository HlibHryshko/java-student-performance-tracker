package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentPerformanceTrackerController {
    private static StudentPerformanceTrackerController instance;
    private final List<Student> students;

    private StudentPerformanceTrackerController() {
        students = new ArrayList<>();
    }

    public static StudentPerformanceTrackerController getInstance() {
        if (instance == null) {
            instance = new StudentPerformanceTrackerController();
        }
        return instance;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void printStudentsInformation() {
        students.forEach(System.out::println);
    }

    public List<Student> getStudentsSortedByAverageGrade() {
        return students.stream().sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed()).collect(Collectors.toList());
    }
}
