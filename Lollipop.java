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

    /** Draws a red lollipop on a stick */
    private void drawLollipop() {
        UI.setLineWidth(10);                // Set line width to 10
        UI.drawLine(300, 200, 300, 400);    // draw line    (300, 200) to (300, 400)
        UI.setLineWidth(1);                 // Set line width to 1
        UI.setColor(Color.red);             // Set color to red
        UI.fillOval(260, 160, 80, 80);      // Fill an oval     @(260, 160), 80x80
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

