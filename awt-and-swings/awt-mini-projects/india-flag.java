/*
Program: Indian Flag using AWT Graphics

Develop a Java program using AWT
to draw the Indian National Flag
using Graphics class.

The program should draw:
1. Saffron stripe
2. White stripe
3. Green stripe
4. Ashoka Chakra

Use Graphics methods such as:
1. fillRect()
2. drawOval()
3. drawLine()
*/

import java.awt.*;
import java.awt.event.*;

// Main class
public class IndiaFlag extends Frame {

    IndiaFlag() {

        // Frame settings
        setTitle("Indian Flag");
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

        // Flag pole
        g.setColor(Color.BLACK);
        g.fillRect(120, 80, 10, 300);

        // Saffron stripe
        g.setColor(Color.ORANGE);
        g.fillRect(130, 100, 300, 50);

        // White stripe
        g.setColor(Color.WHITE);
        g.fillRect(130, 150, 300, 50);

        // Green stripe
        g.setColor(Color.GREEN);
        g.fillRect(130, 200, 300, 50);

        // Ashoka Chakra
        g.setColor(Color.BLUE);
        g.drawOval(255, 155, 50, 50);

        // Chakra lines
        for (int i = 0; i < 360; i += 15) {

            double angle = Math.toRadians(i);

            int x1 = 280;
            int y1 = 180;

            int x2 = (int)(280 + 25 * Math.cos(angle));
            int y2 = (int)(180 + 25 * Math.sin(angle));

            g.drawLine(x1, y1, x2, y2);
        }

        // Text
        g.setColor(Color.BLACK);
        g.drawString("Indian Flag using AWT", 220, 320);
    }

    // Main method
    public static void main(String[] args) {

        new IndiaFlag();
    }
}

/*

Sample Output:

------------------------------------------------
|                                              |
|      ----------------------------------      |
|      |██████████████████████████████|        |
|      |                                |      |
|      |            ☸                   |      |
|      |                                |      |
|      |██████████████████████████████|        |
|                                              |
|         Indian Flag using AWT                |
|                                              |
------------------------------------------------

*/
