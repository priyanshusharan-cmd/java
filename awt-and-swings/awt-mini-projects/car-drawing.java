/*
Program: Car Drawing using AWT Graphics

Develop a Java program using AWT
to draw a Car using Graphics class.

The program should draw:
1. Car body
2. Wheels
3. Windows
4. Roof

Use Graphics methods such as:
1. drawRect()
2. drawOval()
3. drawLine()
*/

import java.awt.*;
import java.awt.event.*;

// Main class
public class CarDrawing extends Frame {

    CarDrawing() {

        // Frame settings
        setTitle("Car Drawing");
        setSize(700, 500);
        setVisible(true);

        // Window closing event
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {

                dispose();
            }
        });
    }

    // Graphics drawing
    public void paint(Graphics g) {

        // Car body
        g.drawRect(180, 220, 300, 100);

        // Car roof
        g.drawLine(240, 220, 300, 160);
        g.drawLine(300, 160, 390, 160);
        g.drawLine(390, 160, 450, 220);

        // Windows
        g.drawRect(270, 180, 50, 40);
        g.drawRect(330, 180, 50, 40);

        // Wheels
        g.drawOval(220, 300, 70, 70);
        g.drawOval(380, 300, 70, 70);

        // Wheel centers
        g.fillOval(245, 325, 20, 20);
        g.fillOval(405, 325, 20, 20);

        // Text
        g.drawString("Car Drawing using AWT", 250, 430);
    }

    // Main method
    public static void main(String[] args) {

        new CarDrawing();
    }
}

/*

Sample Output:

------------------------------------------------
|                                              |
|                                              |
|             _____________                    |
|            /             \                   |
|           /_______________\                  |
|          |  []      []    |                  |
|          |                |                  |
|          |________________|                  |
|            O          O                      |
|                                              |
|         Car Drawing using AWT                |
|                                              |
------------------------------------------------

*/
