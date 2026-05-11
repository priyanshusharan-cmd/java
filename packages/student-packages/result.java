/*
Program 6: Student Package Program

Develop a Java program to create packages CIE and SEE.

The package CIE should contain:
1. Student class
2. Internals class

The package SEE should contain:
1. External class

Create a Result class that calculates
the final marks of students in five subjects.

Final Marks = Internal Marks + External Marks
*/

import cie.*;
import see.*;

public class Result {

    public static void main(String[] args) {

        int[] internalMarks = {18, 20, 19, 17, 16};
        int[] externalMarks = {70, 68, 75, 72, 69};

        External student = new External(
                "1WA24CS223",
                "Priyanshu Sharan",
                3,
                internalMarks,
                externalMarks
        );

        System.out.println("Student Details");
        System.out.println("----------------------");

        student.displayStudentDetails();

        System.out.println("\nFinal Marks");
        System.out.println("----------------------");

        for (int i = 0; i < 5; i++) {

            int total = student.internalMarks[i] + student.externalMarks[i];

            System.out.println(
                    "Subject " + (i + 1) + " : " + total
            );
        }
    }
}

/*

Sample Output:

Student Details
----------------------
USN       : 1WA24CS223
Name      : Priyanshu Sharan
Semester  : 3

Final Marks
----------------------
Subject 1 : 88
Subject 2 : 88
Subject 3 : 94
Subject 4 : 89
Subject 5 : 85

*/
