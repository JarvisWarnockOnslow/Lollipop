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
    public static final double X = 300.0;        // Horizontal center of lollipop
    public static final double Y = 180.0;        // Verticle center of lollipop
    public static final double SIZE = 80.0;      // Diameter of lollipop
    public static final double STICK = 200.0;    // Length of lollipop stick

    /**
     * Constructor for objects of class Lollipop 
     * 
     */
    public Lollipop(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }

    /** Draws a red lollipop on a stick */
    private void drawLollipop() {
        double left = X-SIZE/2.0;           //Left of lollipop
        double top = Y-SIZE/2.0;            //top of lollipop
        double bottom = Y + STICK;          //bottom of stick
        
        UI.setLineWidth(SIZE/8.0);          // Set line width to 10
        UI.drawLine(X, Y, X, bottom);       // draw line
        UI.setLineWidth(1);                 // Set line width to 1
        UI.setColor(Color.red);             // Set color to red
        UI.fillOval(left, top, SIZE, SIZE); // Fill an oval     @(260, 160), 80x80
    }

    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.drawLollipop();
    }

}

