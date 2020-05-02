package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class InvisibleBall extends Ball
{

 //constructors
 public InvisibleBall() {
	 super();
 }

 public InvisibleBall(int x, int y) {
	   super(x, y);
 }

 public InvisibleBall(int x, int y, int wid, int heit) {
	   super(x, y, wid, heit);
 }

 public InvisibleBall(int x, int y, int wid, int heit, int xSpd, int ySpd) {
	   super(x, y, wid, heit, xSpd, ySpd);
 }

 public InvisibleBall(int x, int y, int wid, int heit, Color col, int xSpd, int ySpd) {
	   super(x, y, wid, heit, col, xSpd, ySpd);
 }

 public Color theColor() {
	 	//this is all black so invisible.
 		if (Math.random() * 100 > 50) {
 		 	System.out.println("invisible");
 			return new Color(0,0,0);
 		}
 		else {
 		 	//this is white so visible.
 			System.out.println("visible");
 			return new Color(255,255,255);
 		}
 }

 public void moveAndDraw(Graphics window)
 {
	   draw(window, Color.BLACK);
	   setX(getX()+getXSpeed());
	   setY(getY()+getYSpeed());
	   draw(window, theColor());

 }
}
