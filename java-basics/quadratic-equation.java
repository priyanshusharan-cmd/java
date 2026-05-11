/*
Program 1: Quadratic Equation Roots

Write a Java program that accepts the coefficients a, b, and c of a quadratic equation
in the form ax^2 + bx + c = 0 and computes its roots.

If the discriminant (b^2 - 4ac) is:
1. Greater than zero → print two distinct real roots
2. Equal to zero → print equal real roots
3. Less than zero → print that the roots are imaginary
*/

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double discriminant, root1, root2;

        System.out.print("Enter value of a: ");
        a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        c = sc.nextDouble();

        discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {

            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Roots are real and distinct");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);

        } 
        else if (discriminant == 0) {

            root1 = -b / (2 * a);

            System.out.println("Roots are real and equal");
            System.out.println("Root 1 = Root 2 = " + root1);

        } 
        else {

            System.out.println("Roots are imaginary");

        }

        sc.close();
    }
}

/*

Sample Output:

Enter value of a: 1
Enter value of b: -5
Enter value of c: 6

Roots are real and distinct
Root 1 = 3.0
Root 2 = 2.0

*/
