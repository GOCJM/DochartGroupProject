package mvcexample;

/**
 * CSCU9P6 - Dochart Group Project
 * Main.java
 * 
 * @author Michael Sammels
 * @version 25.02.2022
 */

public class Main {
    public static void main(String[] args) {
        Model model = new Model();                                  // Create shared database
        Controller1 c1 = new Controller1(model, "Controller1");     // Create first controller
        Controller2 c2 = new Controller2(model, "Controller2");     // Create second controller
        
        Controller2 c3 = new Controller2(model, "Controller3");     // Create third controller
        c3.setLocation(40, 360);
        
        Controller2 c4 = new Controller2(model, "Controller4");     // Create fourth controller
        c4.setLocation(450, 200);
        
        Controller2 c5 = new Controller2(model, "Controller5");     // Create fifth controller
        c5.setLocation(450, 360);
    } // main
} // Main
