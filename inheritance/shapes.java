/*
Program 4: Shape Inheritance Program

Develop a Java program to create a superclass called Shape
with a method called printArea().

Create three subclasses:
1. Rectangle
2. Triangle
3. Circle

Each subclass should override the printArea() method
to calculate and display the area of the respective shape.

Formula Used:
Rectangle Area = length × breadth
Triangle Area = 0.5 × base × height
Circle Area = π × radius × radius
*/

import java.util.Scanner;

// Superclass
class Shape {

    void printArea() {
        System.out.println("Area calculation");
    }
}

// Rectangle subclass
class Rectangle extends Shape {

    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void printArea() {

        double area = length * breadth;

        System.out.println("\nRectangle Area = " + area);
    }
}

// Triangle subclass
class Triangle extends Shape {

    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void printArea() {

        double area = 0.5 * base * height;

        System.out.println("Triangle Area = " + area);
    }
}

// Circle subclass
class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void printArea() {

        double area = Math.PI * radius * radius;

        System.out.println("Circle Area = " + area);
    }
}

// Main class
public class Shapes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double length, breadth;
        double base, height;
        double radius;

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        breadth = sc.nextDouble();

        Rectangle r = new Rectangle(length, breadth);

        // Triangle
        System.out.print("\nEnter base of triangle: ");
        base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        height = sc.nextDouble();

        Triangle t = new Triangle(base, height);

        // Circle
        System.out.print("\nEnter radius of circle: ");
        radius = sc.nextDouble();

        Circle c = new Circle(radius);

        // Display areas
        r.printArea();
        t.printArea();
        c.printArea();

        sc.close();
    }
}

/*

Sample Output:

Enter length of rectangle: 10
Enter breadth of rectangle: 5

Enter base of triangle: 6
Enter height of triangle: 4

Enter radius of circle: 7

Rectangle Area = 50.0
Triangle Area = 12.0
Circle Area = 153.93804002589985

*/
