/*
Program 11: Mouse Events Program

Develop a Java program using AWT
to demonstrate mouse events.

Handle the following mouse events:
1. mouseClicked()
2. mousePressed()
3. mouseReleased()
4. mouseEntered()
5. mouseExited()

Display corresponding messages
whenever a mouse event occurs.
*/

import java.awt.*;
import java.awt.event.*;

// Main class
public class MouseEvents extends Frame implements MouseListener {

    Label message;

    MouseEvents() {

        // Label
        message = new Label("Perform Mouse Actions");

        add(message);

        // Register mouse listener
        addMouseListener(this);

        // Frame settings
        setTitle("Mouse Events Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setVisible(true);

        // Window closing
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {

                dispose();
            }
        });
    }

    // Mouse clicked
    public void mouseClicked(MouseEvent e) {

        message.setText("Mouse Clicked");
    }

    // Mouse pressed
    public void mousePressed(MouseEvent e) {

        message.setText("Mouse Pressed");
    }

    // Mouse released
    public void mouseReleased(MouseEvent e) {

        message.setText("Mouse Released");
    }

    // Mouse entered
    public void mouseEntered(MouseEvent e) {

        message.setText("Mouse Entered");
    }

    // Mouse exited
    public void mouseExited(MouseEvent e) {

        message.setText("Mouse Exited");
    }

    // Main method
    public static void main(String[] args) {

        new MouseEvents();
    }
}

/*

Sample Output:

-----------------------------------
|        Mouse Events Demo        |
-----------------------------------
|                                 |
|    Perform Mouse Actions        |
|                                 |
-----------------------------------

When mouse is clicked:
Mouse Clicked

When mouse is pressed:
Mouse Pressed

When mouse is released:
Mouse Released

When mouse enters frame:
Mouse Entered

When mouse exits frame:
Mouse Exited

*/
