/*
Program 7: Inheritance Exception Program

Develop a Java program to demonstrate exception handling
using inheritance and user-defined exceptions.

Create a custom exception called AgeException.

Create two classes:
1. Father
2. Son

Accept the ages of father and son.

If the son's age is greater than or equal to the father's age,
throw an AgeException.

Otherwise display that the input is valid.
*/

import java.util.Scanner;

// User-defined exception
class AgeException extends Exception {

    AgeException(String message) {

        super(message);
    }
}

// Father class
class Father {

    int fatherAge;

    Father(int fatherAge) {

        this.fatherAge = fatherAge;
    }
}

// Son class inheriting Father
class Son extends Father {

    int sonAge;

    Son(int fatherAge, int sonAge) {

        super(fatherAge);

        this.sonAge = sonAge;
    }

    void validateAge() throws AgeException {

        if (sonAge >= fatherAge) {

            throw new AgeException(
                    "Son's age cannot be greater than or equal to father's age"
            );
        }

        else {

            System.out.println("Valid age input");
        }
    }
}

// Main class
public class InheritanceException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fatherAge, sonAge;

        System.out.print("Enter Father's Age: ");
        fatherAge = sc.nextInt();

        System.out.print("Enter Son's Age: ");
        sonAge = sc.nextInt();

        Son s = new Son(fatherAge, sonAge);

        try {

            s.validateAge();

        }

        catch (AgeException e) {

            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}

/*

Sample Output 1:

Enter Father's Age: 50
Enter Son's Age: 20

Valid age input


Sample Output 2:

Enter Father's Age: 40
Enter Son's Age: 45

Exception: Son's age cannot be greater than or equal to father's age

*/
