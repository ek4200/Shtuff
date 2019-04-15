package com.company;

/**
 * Created by ek4200 on 3/12/2019.
 */
public class Student {
    int studentID;
    String name;
    double contentgrade;
    double workHabitGrade;
    double participation;
    int age;

    //constructors
    public Student(String Name, int ID, int Age){
        name = Name;
        studentID = ID;
        age = Age;
        contentgrade = 0;
        workHabitGrade = 0;
        participation = 0;
    }
    //secondconstructor
    public Student(){
        name = "Student";
        studentID = -1;
        contentgrade = 0;
        workHabitGrade = 0;
        participation = 0;
        age = 18;
    }
    //methods
    public void setContentgrade(int Grade){}
    public void setWorkHabitGrade(int Grade){}
    public void setParticipation(int Grade){}
    public void Getgrade(){
        double overallGrade = (.35 * workHabitGrade + .4 * contentgrade + .25 * participation);
        System.out.println(overallGrade);
    }
}
