package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private int age;
    private List<Student> students = new ArrayList<Student>();


    public void setStudents(List students) {
        this.students = students;
    }

    public List getStudents() {

        return students;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public University(String name, int age) {

    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        Student student = null;
        for (Student s : students) {
            if (s.getAverageGrade() == averageGrade) {
                student = s;
            }
        }
        return student;
    }

    public Student getStudentWithMaxAverageGrade() {
        double maxAverageGrade = Double.MIN_VALUE;
        Student student = null;
        for (Student s : students) {
            if (s.getAverageGrade() > maxAverageGrade) {
                student = s;
                maxAverageGrade = s.getAverageGrade();
            }
        }
        return student;
    }


    public Student getStudentWithMinAverageGrade() {
        double minAverageGrade = Double.MAX_VALUE;
        Student student = null;
        for (Student s : students) {
            if (s.getAverageGrade() < minAverageGrade) {
                student = s;
                minAverageGrade = s.getAverageGrade();
            }
        }
        return student;
    }

    public void expel(Student student) {
        if (student != null && students.contains(student))
            students.remove(student);
    }
}