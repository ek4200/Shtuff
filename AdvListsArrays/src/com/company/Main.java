package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //The Project:

        //To create a gradebook application (text based).
        //The main requirements of the Gradebook are in the requirements section of this document.
        //For this assignment you do not need to implement the methods,
        //they are just there to help you understand how all the other fields interact if it happens to be helpful.

        //Requirements:

        //The gradebook needs to keep track of different "sections" it should also keep track of what
        //section is currently active ("being viewed") each section will have a section name to identify it.
        //each section will have a different set of students.
        //The gradebook needs to keep track of all of the assignments assigned to each studentIt needs to track the
        //number of points possible, the name of the assignment and the number of points earned by the student for
        //each assignment. It should also track the number of days a student has been absent and number of days tardy.
        //It should also track the student's first and last name, student username, and phone number.

        //Methods(external API - methods that will be exposed to user to allow the user to interact with your
        //gradebook): functions that return boolean values: (true means successful,
        //false means it could not add/set etc)
        //changeSection(string sectionName); sets the currently active section
        //boolean AddStudent(String firstName, String lastName, string username, long phoneNumber);
        //creates a new student
        //double getOverallScore(String username) //returns overall score as a percentage for specified student
        //double getOverallScoreAvg(String sectionName) //returns overall score as a percentage for a section
        //boolean addAssignmentToStudent(String username, String assignmentName, int pointsPossible)
        //boolean addAssignmentToSection(String assignmentName, int pointsPossible)
        //boolean setScore(String username, String assignmentName, int pointsEarned)
        //double getAssignmentScorePercent(String username, String assignmentName)
        //returns score as a percentage for student in current section
        //double getAssignmentScoreAvg(String assignmentName)
        //returns score as a percentage for current section
        //boolean addSection(String sectionName)
        //creates a new section if there are not already 6 sections and sectionName isnt already used
        //boolean markTardy(String username) //adds 1 to the students tardy count
        //boolean markAbsent(String username)
        //adds 1 to the students absent count
        //int getTardyCount(String username)
        //returns number of times student was tardy
        //int getAbsentCount(String username) //returns number of times student was absent

        //Assumptions:
        //You may assume that each student is only in one section.

    }
}
