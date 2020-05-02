package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Andrew Tian

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
	//the speed of the paddle
   private int speed;

   public Paddle() {
		super(10,10);
      speed =5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y) {
	   super(x, y, 10, 10, Color.WHITE);
	   setSpeed(5);
   }
   
   public Paddle (int x, int y, int sp) {
	   super(x, y, 10, 10, Color.WHITE);
	   setSpeed(sp);
   }
   
   public Paddle (int x, int y, int width, int height, int sp) {
	   super (x, y, width, height, Color.BLACK);
	   setSpeed(sp);
   }
   
   public Paddle (int x, int y, int width, int height, Color col, int sp) {
	   super (x, y, width, height, col);
	   setSpeed(sp);
   }

   //must set colour to be black so it blends in the BG
   
   
   public void moveUpAndDraw(Graphics window) {
	   draw(window, Color.BLACK);
	   setY(getY()-speed);
	   draw(window);
   }

   public void moveDownAndDraw(Graphics window) {
	   draw(window, Color.BLACK);
	   setY(getY()+speed);
	   draw(window);
   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }   
   
   public void setSpeed(int newspeed) {
	   speed = newspeed;
   }
   
   //add a toString() method
   public String toString() {
	   return super.toString()+" "+speed;
   }
}
