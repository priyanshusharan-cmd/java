/*
Program 12: Graphics Demo Program

Develop a Java program using AWT
to demonstrate graphics methods.

Use Graphics class to draw:
1. Line
2. Rectangle
3. Oval
4. String

Implement the paint() method
to display the graphics.
*/

import java.awt.*;
import java.awt.event.*;

// Main class
public class GraphicsDemo extends Frame {

    GraphicsDemo() {

        // Frame settings
        setTitle("Graphics Demo");
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

        // Draw String
        g.drawString("AWT Graphics Demo", 180, 80);

        // Draw Line
        g.drawLine(100, 120, 300, 120);

        // Draw Rectangle
        g.drawRect(100, 150, 150, 80);

        // Draw Oval
        g.drawOval(100, 270, 150, 80);
    }

    // Main method
    public static void main(String[] args) {

        new GraphicsDemo();
    }
}

/*

Sample Output:

-----------------------------------------
|            Graphics Demo              |
-----------------------------------------
|
|          AWT Graphics Demo            |
|
|      -----------------------          |  <- Line
|
|      ***********************          |
|      *                     *          |
|      *     Rectangle       *          |
|      *                     *          |
|      ***********************          |
|
|          (           )                |
|        (               )              |
|       (      Oval       )             |
|        (               )              |
|          (           )                |
|
-----------------------------------------

*/
