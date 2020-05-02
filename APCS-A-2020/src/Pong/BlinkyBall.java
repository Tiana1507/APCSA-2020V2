package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends SpeedUpBall
{

   //constructors
   public BlinkyBall() {
		super();
   }

   public BlinkyBall(int x, int y) {
	   super(x, y);
   }

   public BlinkyBall(int x, int y, int wid, int ht) {
	   super(x, y, wid, ht);
   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
	   super(x, y, wid, ht, xSpd, ySpd);
   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
	   super(x, y, wid, ht, col, xSpd, ySpd);
   }

   public Color randomColor() {
   		int r = (int)(Math.random()*256);		//use Math.random()
 		int g = (int)(Math.random()*256);
 		int b = (int)(Math.random()*256);
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window) {
	   //black is the BG colour
	   draw(window, Color.BLACK);
	   setX(getX()+getXSpeed());
	   setY(getY()+getYSpeed());
	   draw(window, randomColor());
   }
   
   /*public void setXSpeed( int xSpd )
   {
	   if (xSpd<0) super.setXSpeed(xSpd-1);
	   else super.setXSpeed(xSpd+1);
   }

   public void setYSpeed( int ySpd )
   {
	   if (ySpd<0) super.setYSpeed(ySpd-1);
	   else super.setYSpeed(ySpd+1);
   }
   */
}
