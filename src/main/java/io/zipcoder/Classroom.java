package io.zipcoder;

import java.util.*;

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

//        Arrays.sort(students, Collections.reverseOrder());
//        return students;
        List<Student> newList = Arrays.asList(students);
        Comparator<Student> comparator = Comparator.comparingDouble((Student i) -> -i.getAverageExamScore())
                .thenComparing(s -> s.getLastName())
                .thenComparing(s -> s.getFirstName());
        Collections.sort(newList, comparator);
        return newList.toArray( new Student[newList.size()]);
    }

    public Map <Student, String> getGradeBook(){

        Map<Student,String> gradeBook = new HashMap<>();
        String letter = "";
        for (Student student : students){
            if (student.getAverageExamScore() >=90){
                letter = "A";
            }else if ( student.getAverageExamScore() >=80){
                letter = "B";
            }else if ( student.getAverageExamScore() >=70){
                letter = "C";
            }else if ( student.getAverageExamScore() >= 60){
                letter = "D";
            }else letter = "F";
            gradeBook.put(student,letter);
        }
        return gradeBook;
    }
}