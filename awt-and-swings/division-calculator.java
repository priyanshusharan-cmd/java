/*
Program 10: Division Calculator using AWT

Develop a Java program using AWT
to perform division of two integers.

Create a GUI application with:
1. Two text fields for input
2. One button for division
3. One label for displaying result

Handle exceptions such as:
1. Division by zero
2. Invalid number format

Use ActionListener for event handling.
*/

import java.awt.*;
import java.awt.event.*;

// Main class
public class DivisionCalculator extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField t1, t2;
    Button b1;

    DivisionCalculator() {

        // Labels
        l1 = new Label("Enter First Number:");
        l2 = new Label("Enter Second Number:");
        l3 = new Label("Result:");

        // Text fields
        t1 = new TextField();
        t2 = new TextField();

        // Button
        b1 = new Button("Divide");

        // Set layout
        setLayout(new GridLayout(4, 2));

        // Add components
        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(b1);
        add(l3);

        // Register button event
        b1.addActionListener(this);

        // Frame settings
        setTitle("Division Calculator");
        setSize(400, 200);
        setVisible(true);

        // Window closing event
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {

                dispose();
            }
        });
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {

        try {

            int num1 = Integer.parseInt(t1.getText());

            int num2 = Integer.parseInt(t2.getText());

            int result = num1 / num2;

            l3.setText("Result: " + result);
        }

        catch (ArithmeticException ex) {

            l3.setText("Cannot divide by zero");
        }

        catch (NumberFormatException ex) {

            l3.setText("Invalid input");
        }
    }

    // Main method
    public static void main(String[] args) {

        new DivisionCalculator();
    }
}

/*

Sample Output:

-----------------------------------
|      Division Calculator        |
-----------------------------------
| Enter First Number:   20        |
| Enter Second Number:   5        |
|                                 |
|          [ Divide ]             |
|                                 |
| Result: 4                       |
-----------------------------------

Case 2:

Result: Cannot divide by zero

Case 3:

Result: Invalid input

*/
