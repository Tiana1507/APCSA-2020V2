package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall() {
		super();
   }

   
   public BlinkyBall(int x, int y) {
	   super(x, y);
   }

   
   public BlinkyBall(int x, int y, int wid, int heit) {
	   super(x, y, wid, heit);
   }
   

   public BlinkyBall(int x, int y, int wid, int heit, int xSpd, int ySpd) {
	   super(x, y, wid, heit, xSpd, ySpd);
   }
   

   //full version construc
   public BlinkyBall(int x, int y, int wid, int heit, Color col, int xSpd, int ySpd) {
	   super(x, y, wid, heit, col, xSpd, ySpd);
   }

   
   public Color randomColor() {
	   //note has to be from 0 to 255
   		int randnum1 = (int) (Math.random() * 256);
   		int randnum2 = (int) (Math.random() * 256);
   		int randnum3 = (int) (Math.random() * 256);
	    //use Math.random()

 		return new Color(randnum1,randnum2,randnum3);
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
