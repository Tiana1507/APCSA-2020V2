package Pong;
//(c) A +  Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.awt.Color;
import java.awt.Graphics;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200,200);
		setSpeed(3, 1);
	}

	
	//SO MANY CONSTRUCTORSSSSSS
	public Ball(int x, int y) {
		super(x, y);
		setSpeed(3, 1);
	}
	
	public Ball(int x, int y, int width, int height) {
		this(x, y);
		super.setWidth(width);
		super.setHeight(height);
	}
	
	public Ball(int x, int y, int width, int height, Color col) {
		this(x, y, width, height);
		super.setColor(col);
	}
	
	public Ball(int x, int y, int width, int height, int xS, int xY) {
		this(x, y, width, height);
		setSpeed(xS, xY);
	}
	
	public Ball(int x, int y, int width, int height, Color col, int xS, int xY) {
		super(x, y, width, height, col);
		setSpeed(xS, xY);
	}
	
	public void setXSpeed(int xS) {
		xSpeed = xS;
	}
	
	public void setYSpeed(int yS) {
		ySpeed  = yS;
	}
	
	public void setSpeed(int newxspeed, int newyspeed) {
		xSpeed = newxspeed;
		ySpeed = newyspeed;
	}
	

   public void moveAndDraw(Graphics window) {
	   draw(window, Color.BLACK);
	   setX(getX() + xSpeed);
	   setY(getY() + ySpeed);
	   draw(window);
   }
   
	public boolean equals(Object obj) {
		Ball other = (Ball) obj;
		return super.equals(other) && xSpeed == other.getXSpeed() 
				&& ySpeed == other.getYSpeed();
	}

	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
	
	public boolean didCollideLeft(Object obj)
	{
		Block leftcolid = (Block)obj;
		if (getX() <=  (leftcolid.getX() + leftcolid.getWidth() + Math.abs(getXSpeed()))) {
			if (getX() > (leftcolid.getX() - getWidth() - Math.abs(getXSpeed()))) {
				if (getX() >= (leftcolid.getX())) {
					if (getY() <= (leftcolid.getY() + leftcolid.getHeight())) {
						if ((getY() + getHeight()) >= leftcolid.getY()){
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	public boolean didCollideRight(Object obj)
	{
		Block rightcolid = (Block)obj;
		if (getX() < (rightcolid.getX() + rightcolid.getWidth() + Math.abs(getXSpeed()))){
			if (getX() >=  (rightcolid.getX() - getWidth() - Math.abs(getXSpeed()))) {
				if (getX() <= rightcolid.getX() + rightcolid.getWidth()) {
					if (getY() <= (rightcolid.getY() + rightcolid.getHeight())) {
						if ((getY() + getHeight()) >= rightcolid.getY()) {
							return true;
						}
					}
				}
			}
		}
		
	return false;
	}
	
	public boolean didCollideTop(Object obj)
	{
		Block topcolid = (Block)obj;
		if (getY() >=  (topcolid.getY() - getHeight() - Math.abs(getYSpeed()))) {
			if (getY() < (topcolid.getY() + topcolid.getHeight() + Math.abs(getYSpeed()))) {
				if(getX() >= topcolid.getX()){
					if (getX() <= (topcolid.getX() + topcolid.getWidth())) {
						if ((getX() + getWidth()) >= topcolid.getX()) {
							if ((getX() + getWidth()) <= topcolid.getX() + topcolid.getWidth()) {
								return true;
							}
						}
					}
				}
			}
		}
		
	return false;	
	}
	
	public boolean didCollideBottom(Object obj)
	{
		Block botcolid = (Block) obj;
		if (getY() > (botcolid.getY() - getHeight() - Math.abs(getYSpeed()))) {
			if (getY() <= (botcolid.getY() + botcolid.getHeight() + Math.abs(getYSpeed()))) {
				if ((getX() >= botcolid.getX())) {
					if (getX() <= (botcolid.getX() + botcolid.getWidth())) {
						if ((getX() + getWidth()) >= botcolid.getX()){							
							if (getX() + getWidth() <= botcolid.getX() + botcolid.getWidth()) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

   //add the get methods

	//add a toString() method  - x , y , width, height, color
	@Override
	public String toString() {
		return "xPos: " +  getX() + ", yPos: " + getY() + ", Width: " + getWidth() + ", height: " + getHeight() + ", Color: " + getColor() + " XSpeed: " + getXSpeed() + " YSpeed: " + getYSpeed();
	}
}
