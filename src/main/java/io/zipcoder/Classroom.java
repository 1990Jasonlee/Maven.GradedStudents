package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {

    public Student[] students;

    public Classroom(int maxNumberOfStudents) {

        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {

        this.students = students;
    }

    public Classroom() {

        this.students = new Student[30];
    }

    public Student[] getStudents() {

        return students;
    }

    public Double getAverageExamScore() {

        Double average = 0.0;
        for (int i = 0; i < this.students.length; i++) {
            average += students[i].getAverageExamScore();
        }
        return average / this.students.length;
    }

    public void addStudent(Student student) {

        ArrayList<Student> newArray = new ArrayList<>();
        newArray.add(student);

        for (int i = 0; i < this.students.length; i++) {
            if (students[i] == null) {
                students[i] = newArray.get(0);
                break;
            }
        }
    }

    public void removeStudent(String firstName, String lastName) {

        for (int i = 0; i < this.students.length; i++){
            if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                students[i] = null;
            }
        }
        for (int i = 0; i < this.students.length -1; i++){
            if (students[i] == null){
                students[i] = students[i+1];
                students[i+1] = null;
            }
        }
    }

    public Student[] getStudentsByScore(){

        Arrays.sort(students);
        return students;
    }

}