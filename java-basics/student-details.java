/*
Program 2: Student Details and SGPA Calculation

Develop a Java program to create a class Student with members:
USN, Name, an array to store credits, and an array to store marks.

Include methods to:
1. Accept and display student details
2. Calculate SGPA of a student

SGPA is calculated using the formula:

SGPA = Sum(Credit × Grade Point) / Sum(Credits)

Grade Point Calculation:
90 - 100  -> 10
80 - 89   -> 9
70 - 79   -> 8
60 - 69   -> 7
50 - 59   -> 6
40 - 49   -> 5
Below 40  -> 0
*/

import java.util.Scanner;

class Student {

    String usn;
    String name;
    int n;
    int[] credits;
    int[] marks;

    void acceptDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();

        credits = new int[n];
        marks = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nSubject " + (i + 1));

            System.out.print("Enter Credits: ");
            credits[i] = sc.nextInt();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
        }
    }

    int calculateGradePoint(int marks) {

        if (marks >= 90)
            return 10;
        else if (marks >= 80)
            return 9;
        else if (marks >= 70)
            return 8;
        else if (marks >= 60)
            return 7;
        else if (marks >= 50)
            return 6;
        else if (marks >= 40)
            return 5;
        else
            return 0;
    }

    double calculateSGPA() {

        int totalCredits = 0;
        int totalCreditPoints = 0;

        for (int i = 0; i < n; i++) {

            int gradePoint = calculateGradePoint(marks[i]);

            totalCredits += credits[i];
            totalCreditPoints += credits[i] * gradePoint;
        }

        return (double) totalCreditPoints / totalCredits;
    }

    void displayDetails() {

        System.out.println("\nStudent Details");
        System.out.println("-----------------------");
        System.out.println("USN  : " + usn);
        System.out.println("Name : " + name);

        System.out.printf("SGPA : %.2f\n", calculateSGPA());
    }
}

public class StudentDetails {

    public static void main(String[] args) {

        Student s = new Student();

        s.acceptDetails();

        s.displayDetails();
    }
}

/*

Sample Output:

Enter USN: 1WA24CS223
Enter Name: Priyanshu Sharan
Enter number of subjects: 3

Subject 1
Enter Credits: 4
Enter Marks: 95

Subject 2
Enter Credits: 3
Enter Marks: 84

Subject 3
Enter Credits: 4
Enter Marks: 76

Student Details
-----------------------
USN  : 1WA24CS223
Name : Priyanshu Sharan
SGPA : 9.09

*/
