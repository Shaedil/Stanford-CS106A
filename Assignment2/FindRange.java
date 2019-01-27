/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
    private static final int sentinel = 0;

    public void run() {
		/* You fill this in */
        aboutProgram();
        findRange();
	}
    public void aboutProgram() {
        System.out.println("This program finds the largest and smallest numbers.");

    }
    public void findRange() {
        int firstnumber = readInt("?");
        if (firstnumber == sentinel) {
            System.out.println("You entered the sentinel on the first line, you can't do that.");
        }
        int smallestnumber = firstnumber;
        int largestnumber = firstnumber;
        
        while (firstnumber != sentinel) {
            int secondnumber = readInt("?");
            if (secondnumber < smallestnumber) {
                smallestnumber = secondnumber;
            }
            else if (secondnumber > largestnumber) {
                largestnumber = secondnumber;
            }
            else if (secondnumber == sentinel) {
                System.out.println("smallest:" + smallestnumber);
                System.out.println("largest:" + largestnumber);
            }
        }
    }
}

