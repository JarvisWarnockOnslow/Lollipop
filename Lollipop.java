/* Based on the VUW ecs100 template
 * Code for 13DTC
 * Author: Jarvis Warnock
 * Date: 17/04/2020
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Draws little pictures on the GUI
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lollipop{


    
    /**
     * Constructor for objects of class Lollipop 
     * 
     */
    public Lollipop(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }
    
    /**Draw a lollipop at (300, 180) asking the user for its size */
    public void doDrawLollipop(){
        double diam = UI.askDouble("Diameter: ");
        drawLollipop(300, 180, diam, 200);
        drawLollipop(50, 60, diam/2.0, 90);
        drawLollipop(400, 100, diam, 70);
    }
    
    /** Draws a red lollipop on a stick */
    private void drawLollipop(double x, double y, double size, double stick) {
        double left = x-size/2.0;           // Left of lollipop
        double top = y-size/2.0;            // Top of lollipop
        double bottom = y + stick;          // Bottom of stick
        
        UI.setColor(Color.black);           // Set the color of the stick
        UI.setLineWidth(size/8.0);          // Set line width to 10
        UI.drawLine(x, y, x, bottom);       // draw line
        UI.setLineWidth(1);                 // Set line width to 1
        UI.setColor(Color.red);             // Set color to red
        UI.fillOval(left, top, size, size); // Fill an oval     @(260, 160), 80x80
    }

    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.doDrawLollipop();
    }

}

