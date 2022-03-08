package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    public String firstName;
    public String lastName;
    public ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores){

        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public String getFirstName(){

        return firstName;
    }

    public void setFirstName(String firstName){

        this.firstName = firstName;
    }

    public String getLastName(){

        return lastName;
    }

    public void setLastName(String lastName){

        this.lastName = lastName;
    }

    public ArrayList<Double> getExams(){

        return examScores;
    }

    public Integer getNumberOfExamsTaken(){

        return examScores.size();
    }

    public String getExamScores(){

        String score = "";
        for(int i = 0; i < getNumberOfExamsTaken(); i++){
            score += "exam" + (i +1) + "score is" + examScores.get(i) + "/n";
        }
        return score;
    }

    public void addExamScore(double examScore){

        this.examScores.add(examScore);
    }

    public void setExamScores(int examList, double newScore){

        examScores.set(examList -1, newScore);
    }
    public Double getAverageExamScore(){
        Double average = 0.0;
        for( Double i : this.examScores){
            average += i.intValue();
        }
        return average / this.examScores.size();
    }
    public String toString(){
        String student = firstName + " " + lastName + "/n" + "Average Score: " + getAverageExamScore() + "/n" + "";

    }
    //Student should override the toString method by returning a clean String representation of the person.
}
