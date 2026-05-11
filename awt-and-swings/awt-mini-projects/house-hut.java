/*
Program: House Hut using AWT Graphics

Develop a Java program using AWT
to draw a House/Hut using Graphics class.

The program should draw:
1. Roof
2. House body
3. Door
4. Windows
5. Sun

Use Graphics methods such as:
1. drawLine()
2. drawRect()
3. drawOval()
*/

import java.awt.*;
import java.awt.event.*;

// Main class
public class HouseHut extends Frame {

    HouseHut() {

        // Frame settings
        setTitle("House Hut");
        setSize(600, 500);
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

        // House body
        g.drawRect(180, 200, 220, 180);

        // Roof
        g.drawLine(180, 200, 290, 100);
        g.drawLine(290, 100, 400, 200);

        // Door
        g.drawRect(260, 290, 50, 90);

        // Left window
        g.drawRect(210, 240, 50, 50);

        // Right window
        g.drawRect(330, 240, 50, 50);

        // Window lines
        g.drawLine(235, 240, 235, 290);
        g.drawLine(210, 265, 260, 265);

        g.drawLine(355, 240, 355, 290);
        g.drawLine(330, 265, 380, 265);

        // Sun
        g.drawOval(450, 70, 70, 70);

        // Text
        g.drawString("House Hut using AWT", 220, 430);
    }

    // Main method
    public static void main(String[] args) {

        new HouseHut();
    }
}

/*

Sample Output:

------------------------------------------------
|                                              |
|                       ☀                      |
|                  /\                          |
|                 /  \                         |
|                /    \                        |
|               /      \                       |
|              /________\                      |
|             |  []  [] |                      |
|             |         |                      |
|             |    ||   |                      |
|             |____||___|                      |
|                                              |
|            House Hut using AWT               |
|                                              |
------------------------------------------------

*/
