/*
Program 9: IPC and Deadlock Program

Develop a Java program to demonstrate
Inter Process Communication (IPC)
using wait() and notify() methods.

Also demonstrate the concept of deadlock
using multithreading.

The program should show synchronization
between threads using a shared resource.
*/

// Shared resource class
class SharedResource {

    synchronized void displayNumbers() {

        try {

            for (int i = 1; i <= 5; i++) {

                System.out.println(
                        Thread.currentThread().getName() + " : " + i
                );

                Thread.sleep(1000);
            }

            notify();

        }

        catch (InterruptedException e) {

            System.out.println(e);
        }
    }
}

// Thread 1
class ThreadOne extends Thread {

    SharedResource resource;

    ThreadOne(SharedResource resource) {

        this.resource = resource;
    }

    public void run() {

        synchronized (resource) {

            resource.displayNumbers();
        }
    }
}

// Thread 2
class ThreadTwo extends Thread {

    SharedResource resource;

    ThreadTwo(SharedResource resource) {

        this.resource = resource;
    }

    public void run() {

        synchronized (resource) {

            resource.displayNumbers();
        }
    }
}

// Main class
public class IPCAndDeadlock {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        ThreadOne t1 = new ThreadOne(resource);

        ThreadTwo t2 = new ThreadTwo(resource);

        t1.setName("Thread 1");

        t2.setName("Thread 2");

        t1.start();

        t2.start();
    }
}

/*

Sample Output:

Thread 1 : 1
Thread 1 : 2
Thread 1 : 3
Thread 1 : 4
Thread 1 : 5

Thread 2 : 1
Thread 2 : 2
Thread 2 : 3
Thread 2 : 4
Thread 2 : 5

*/
