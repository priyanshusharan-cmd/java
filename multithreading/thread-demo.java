/*
Program 8: Thread Demo Program

Develop a Java program to demonstrate multithreading.

Create two threads:
1. First thread displays "BMS College of Engineering"
2. Second thread displays "CSE Department"

The first thread should execute every 1000 milliseconds.
The second thread should execute every 2000 milliseconds.

Use Thread class and sleep() method.
*/

// First Thread
class BMSThread extends Thread {

    public void run() {

        try {

            for (int i = 1; i <= 5; i++) {

                System.out.println("BMS College of Engineering");

                Thread.sleep(1000);
            }

        }

        catch (InterruptedException e) {

            System.out.println(e);
        }
    }
}

// Second Thread
class CSEThread extends Thread {

    public void run() {

        try {

            for (int i = 1; i <= 5; i++) {

                System.out.println("CSE Department");

                Thread.sleep(2000);
            }

        }

        catch (InterruptedException e) {

            System.out.println(e);
        }
    }
}

// Main class
public class ThreadDemo {

    public static void main(String[] args) {

        BMSThread t1 = new BMSThread();

        CSEThread t2 = new CSEThread();

        t1.start();

        t2.start();
    }
}

/*

Sample Output:

BMS College of Engineering
CSE Department
BMS College of Engineering
BMS College of Engineering
CSE Department
BMS College of Engineering
BMS College of Engineering
CSE Department
CSE Department
CSE Department

*/
