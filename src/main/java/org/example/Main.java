package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentPerformanceTrackerController controller = StudentPerformanceTrackerController.getInstance();

        controller.addStudent(new Student("Joel"));
        controller.addStudent(new Student("Zoe"));
        controller.addStudent(new Student("Carlo"));
        controller.addStudent(new Student("Mia"));

        List<Student> students = controller.getStudents();

        students.getFirst().addGrades(List.of(6., 8., 9., 10., 6.5));
        students.get(1).addGrades(List.of(8., 8., 9., 10., 8.));
        students.get(2).addGrades(List.of(10., 7., 8., 10., 10.));
        students.get(3).addGrades(List.of(9., 8., 7.5, 9.5, 8.5));

        controller.printStudentsInformation();


        System.out.println("\n\n\n");
        
        controller.getStudentsSortedByAverageGrade().stream().limit(2).forEach(System.out::println);
    }
}