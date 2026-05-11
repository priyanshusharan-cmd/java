/*
Program 3: Book Class using Constructor and toString()

Develop a Java program to create a class called Book with the following members:
1. Name of the book
2. Author name
3. Price

Use a parameterized constructor to initialize the data members.

Override the toString() method to display the book details.

Create an object of the Book class and display its details.
*/

class Book {

    String bookName;
    String authorName;
    double price;

    // Parameterized Constructor
    Book(String bookName, String authorName, double price) {

        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    // Overriding toString() method
    public String toString() {

        return "\nBook Details" +
               "\n----------------------" +
               "\nBook Name   : " + bookName +
               "\nAuthor Name : " + authorName +
               "\nPrice       : ₹" + price;
    }
}

public class BookClass {

    public static void main(String[] args) {

        Book b1 = new Book(
                "Object Oriented Programming with Java",
                "E. Balagurusamy",
                599.00
        );

        System.out.println(b1);
    }
}

/*

Sample Output:

Book Details
----------------------
Book Name   : Object Oriented Programming with Java
Author Name : E. Balagurusamy
Price       : ₹599.0

*/
