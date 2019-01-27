/*
 * File: Pyramid.jav
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;

			
	public void run() {
		int startingWidth = 60; //in x value
		int rowWidthBrick = 45;
		int startingHeight = getHeight(); // in y value
		int startingHeightforRow = getHeight()-12;
		for(int i = BRICKS_IN_BASE; i > 0; i--) {
			startingWidth += 15; //for the above row
			rowWidthBrick += 30; //for the row
			startingHeight -= 12; // in y value
			switch (i) {
				case 1: 
					GRect rect14 = new GRect(rowWidthBrick-195,startingHeightforRow-156,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect14);
				case 2: 
					GRect rect13 = new GRect(rowWidthBrick-180,startingHeightforRow-144,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect13);
				case 3: 
					GRect rect12 = new GRect(rowWidthBrick-165,startingHeightforRow-132,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect12);
				case 4: 
					GRect rect11 = new GRect(rowWidthBrick-150,startingHeightforRow-120,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect11);
				case 5: 
					GRect rect10 = new GRect(rowWidthBrick-135,startingHeightforRow-108,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect10);
				case 6: 
					GRect rect9 = new GRect(rowWidthBrick-120,startingHeightforRow-96,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect9);
				case 7: 
					GRect rect8 = new GRect(rowWidthBrick-105,startingHeightforRow-84,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect8);
				case 8: 
					GRect rect7 = new GRect(rowWidthBrick-90,startingHeightforRow-72,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect7);
				case 9: 
					GRect rect6 = new GRect(rowWidthBrick-75,startingHeightforRow-60,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect6);
				case 10: 
					GRect rect5 = new GRect(rowWidthBrick-60,startingHeightforRow-48,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect5);
				case 11: 
					GRect rect4 = new GRect(rowWidthBrick-45,startingHeightforRow-36,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect4);
				case 12: 
					GRect rect3 = new GRect(rowWidthBrick-30,startingHeightforRow-24,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect3);
				case 13: 
					GRect rect2 = new GRect(rowWidthBrick-15,startingHeightforRow-12,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect2);
				case 14: 
					GRect rect1 = new GRect(rowWidthBrick,startingHeightforRow,BRICK_WIDTH, BRICK_HEIGHT); //for row
					add(rect1);
			}
			GRect rect = new GRect(startingWidth,startingHeight,BRICK_WIDTH, BRICK_HEIGHT); //for above row
			add(rect);
		}
	}
}

