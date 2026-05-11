/*
Program: Traffic Light using AWT Graphics

Develop a Java program using AWT
to draw a Traffic Light using Graphics class.

The program should draw:
1. Traffic light box
2. Red light
3. Yellow light
4. Green light

Use Graphics methods such as:
1. drawRect()
2. drawOval()
3. fillOval()
*/

import java.awt.*;
import java.awt.event.*;

// Main class
public class TrafficLight extends Frame {

    TrafficLight() {

        // Frame settings
        setTitle("Traffic Light");
        setSize(400, 600);
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

        // Pole
        g.drawLine(190, 120, 190, 500);

        // Traffic light box
        g.drawRect(130, 120, 120, 260);

        // Red light
        g.setColor(Color.RED);
        g.fillOval(155, 150, 70, 70);

        // Yellow light
        g.setColor(Color.YELLOW);
        g.fillOval(155, 230, 70, 70);

        // Green light
        g.setColor(Color.GREEN);
        g.fillOval(155, 310, 70, 70);

        // Text
        g.setColor(Color.BLACK);
        g.drawString("Traffic Light using AWT", 120, 550);
    }

    // Main method
    public static void main(String[] args) {

        new TrafficLight();
    }
}

/*

Sample Output:

------------------------------------
|                                  |
|             ______               |
|            |  🔴  |              |
|            |  🟡  |              |
|            |  🟢  |              |
|            |______|              |
|               ||                 |
|               ||                 |
|               ||                 |
|                                  |
|      Traffic Light using AWT     |
|                                  |
------------------------------------

*/
