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

}
