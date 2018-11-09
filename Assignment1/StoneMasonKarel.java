/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	private void moveToNextAv() {
		move();
		move();
		move();
		move();
	}
	private void checkBeeperThenPut() {
		for(int i = 0; i < 4; i++) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
	}
	public void run() {
		turnLeft();
		checkBeeperThenPut();
		turnRight();
		moveToNextAv();
		turnRight();//moved to 5th av on top
		checkBeeperThenPut();
		turnLeft();
		moveToNextAv();//moved to 9th av on bottom
		turnLeft();
		checkBeeperThenPut();
		turnRight();
		moveToNextAv();//moved to 13th av on top
		turnRight();
		checkBeeperThenPut();
		turnLeft();
		
	}

}
