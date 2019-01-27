/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
    
    public void run() {
    	int height = getHeight(); //get the window height
        int width = getWidth(); //get the window width
		/* You fill this in. */
        drawThreeCircles(height, width);
	}
    public void drawThreeCircles(int height, int width) {
        GOval bigRedOval = new GOval(width/2-37, height/2-37, 75, 75);
        bigRedOval.setFilled(true);
        bigRedOval.setColor(Color.RED);
        GOval whiteOval = new GOval(width/2-24, height/2-24, 48.75, 48.75);
        whiteOval.setFilled(true);
        whiteOval.setColor(Color.WHITE);
        GOval smallRedOval = new GOval(width/2-12, height/2-12, 22.5, 22.5);
        smallRedOval.setFilled(true);
        smallRedOval.setColor(Color.RED);
        add(bigRedOval);
        add(whiteOval);
        add(smallRedOval);
    }
}
