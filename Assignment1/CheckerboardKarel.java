/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	
	private void doOneOddRow() {
		putBeeper();
		while(frontIsClear()) {
			move();
			if(frontIsClear()) {
				move();
				putBeeper();
			}
		}
	}
	private void doOneEvenRow() {
		putBeeper();
		while(frontIsClear()) {
			move();
			if(frontIsClear()) {
				move();
				putBeeper();
			}
		}
	}
	public void run() {
		turnLeft();
		int x = 0;
		while(frontIsClear()) {
			move();
			x++;
		}
		if(x % 2 == 1) { //if height is odd #
			x = (x/2)+1;
		}
		turnAround();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
		for (int i = 0; i < x; i++) {
			doOneOddRow();
			turnLeft();
			if(facingNorth() && frontIsBlocked()) {
				break;
			}
			move();
			turnLeft();
		 	doOneEvenRow();
		 	turnRight();
		 	if(facingNorth() && frontIsBlocked()) {
		 		break;
		 	}
		 	move();
		 	turnRight();
		}
	}
}
