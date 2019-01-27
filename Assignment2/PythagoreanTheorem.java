/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		/* You fill this in */
        System.out.println("Enter values to compute the pythagorean theorem.");
        double a = readInt("a: ");
        double b = readInt("b: ");
        double c = Math.sqrt((a*a) + (b*b));
        System.out.println("c = " + c );
	}
}
