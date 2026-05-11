/*
Program: Smiley Face using AWT Graphics

Develop a Java program using AWT
to draw a Smiley Face using Graphics class.

The program should draw:
1. Face outline
2. Eyes
3. Smile
4. Nose

Use Graphics methods such as:
1. drawOval()
2. fillOval()
3. drawArc()
4. drawLine()
*/

import java.awt.*;
import java.awt.event.*;

// Main class
public class SmileyFace extends Frame {

    SmileyFace() {

        // Frame settings
        setTitle("Smiley Face");
        setSize(500, 500);
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

        // Face
        g.drawOval(120, 100, 250, 250);

        // Left Eye
        g.fillOval(180, 170, 25, 25);

        // Right Eye
        g.fillOval(285, 170, 25, 25);

        // Nose
        g.drawLine(245, 200, 230, 250);
        g.drawLine(230, 250, 255, 250);

        // Smile
        g.drawArc(180, 220, 120, 70, 180, 180);

        // Text
        g.drawString("Smiley Face using AWT", 170, 400);
    }

    // Main method
    public static void main(String[] args) {

        new SmileyFace();
    }
}

/*

Sample Output:

-----------------------------------------
|                                       |
|             Smiley Face               |
|                                       |
|            *************              |
|          **             **            |
|         *    ●     ●      *           |
|         *       /\        *           |
|         *      \__/       *           |
|          **             **            |
|            *************              |
|                                       |
|      Smiley Face using AWT            |
|                                       |
-----------------------------------------

*/
