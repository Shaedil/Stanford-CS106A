/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		/* You fill this in */
        int n = readInt("Enter a number: ");
        int count = 0;
        while(n != 1) {
        	count = count+1;
            if (n % 2 == 0) {
                System.out.println(n + " is even, so I take half. ");
                n = n/2;
                System.out.println(n);
            }
            else {
                System.out.println(n + " is odd, so I make 3n+1. ");
                n = 3*n+1;
                System.out.println(n);
            }
        }
        System.out.println("It took " + count + " steps to get to 1");
	}
}

