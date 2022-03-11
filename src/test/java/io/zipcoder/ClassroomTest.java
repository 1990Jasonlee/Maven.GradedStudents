package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {
    @Test
    public void maxStudentTest(){
        //Given
        Student[] expected = new Student[10];
        //When
        Classroom classroom = new Classroom(10);
        Student[] actual = classroom.getStudents();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void classroomTest(){
        //Given
        Student[] expected = new Student[30];
        //When
        Classroom classroom = new Classroom();
        Student[] actual = classroom.getStudents();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest(){
        //Given
        String firstName = "Abc";
        String lastName = "Def";
        Double[] examScores = {1.0, 100.0,65.0, 89.0, 38.0};
        Student student = new Student(firstName,lastName,examScores);
        double expected = 58.6;
        //When
        double actual = student.getAverageExamScore();
        //Then
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void getStudentsByScoreTest(){
        //Given
        Double[] score = new Double[]{100.0, 100.0, 95.0};
        Double[] score1 = new Double[]{0.0, 100.0, 95.0};
        Double[] score2 = new Double[]{80.0, 100.0, 95.0};
        Double[] score3 = new Double[]{100.0, 100.0, 100.0};
        Student student = new Student("Abc","Def", score);
        Student student1 = new Student("Ghi","Jkl", score);
        Student student2 = new Student("Mno","Pqr", score);
        Student student3 = new Student("stu","Vwx", score);
        Student[] expected = {student3,student,student2,student1};
        //When
        Student[] actual = student.getStudentsbyScore();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
