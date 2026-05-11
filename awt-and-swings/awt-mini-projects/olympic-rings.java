/*
Program: Olympic Rings using AWT Graphics

Develop a Java program using AWT
to draw the Olympic Rings using Graphics class.

The program should draw:
1. Blue ring
2. Black ring
3. Red ring
4. Yellow ring
5. Green ring

Use Graphics methods such as:
1. drawOval()
2. setColor()
*/

import java.awt.*;
import java.awt.event.*;

// Main class
public class OlympicRings extends Frame {

    OlympicRings() {

        // Frame settings
        setTitle("Olympic Rings");
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

        // Blue Ring
        g.setColor(Color.BLUE);
        g.drawOval(120, 150, 100, 100);

        // Black Ring
        g.setColor(Color.BLACK);
        g.drawOval(240, 150, 100, 100);

        // Red Ring
        g.setColor(Color.RED);
        g.drawOval(360, 150, 100, 100);

        // Yellow Ring
        g.setColor(Color.YELLOW);
        g.drawOval(180, 220, 100, 100);

        // Green Ring
        g.setColor(Color.GREEN);
        g.drawOval(300, 220, 100, 100);

        // Text
        g.setColor(Color.BLACK);
        g.drawString("Olympic Rings using AWT", 240, 380);
    }

    // Main method
    public static void main(String[] args) {

        new OlympicRings();
    }
}

/*

Sample Output:

------------------------------------------------
|                                              |
|        🔵    ⚫    🔴                         |
|           🟡    🟢                            |
|                                              |
|         Olympic Rings using AWT              |
|                                              |
------------------------------------------------

*/
