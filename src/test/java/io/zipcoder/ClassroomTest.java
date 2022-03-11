package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {

    @Test
    public void testClassroom(){
        //Given
        Student[] expected = new Student[30];
        //When
        Classroom classroom = new Classroom();
        Student[] actual = classroom.getStudents();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
