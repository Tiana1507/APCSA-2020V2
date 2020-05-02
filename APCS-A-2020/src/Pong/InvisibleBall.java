package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class InvisibleBall extends SpeedUpBall
{

 //constructors
 public InvisibleBall() {
	super();
 }

 public InvisibleBall(int x, int y) {
	  super(x, y);
 }

 public InvisibleBall(int x, int y, int wid, int ht) {
	  super(x, y, wid, ht);
 }

 public InvisibleBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
	  super(x, y, wid, ht, xSpd, ySpd);
 }

 public InvisibleBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
	  super(x, y, wid, ht, col, xSpd, ySpd);
 }

 public Color noColor() {
	 //this is all black so invisible.
 	int r = 0;
	int g = 0;
	int b = 0;
	return new Color(r,g,b);
 }
 
 public Color regColor()
 {
	//this is white so visible.
 	int r = 256;
	int g = 256;
	int b = 256;
	return new Color(r,g,b);
 }

 public void moveAndDraw(Graphics window)
 {
	 //uses a random number generator to decide if invisible or not.
	 if (Math.random()*100 > 50 ) {
		//regular white ball
		 draw(window, Color.BLACK);
		 setX(getX()+getXSpeed());
		 setY(getY()+getYSpeed());
		 draw(window, regColor());
	 }
	 else {
		   //black is the BG colour
		draw(window, Color.BLACK);
		setX(getX()+getXSpeed());
		setY(getY()+getYSpeed());
		draw(window, noColor());
	 }
	 
 	}
}
