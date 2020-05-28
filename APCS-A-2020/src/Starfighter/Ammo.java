package Starfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Andrew Tian

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,5,5,10);
	}

	public Ammo(int x, int y)
	{
		this(x, y, 5, 5, 10);
	}

	public Ammo(int x, int y, int w, int h, int s)
	{
		setX(x);
		setY(y);
		setSpeed(s);
		setWidth(w);
		setHeight(h);
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	
	public void move( String direction )
	{
		   //note to self think of going up and down on the x and y from starting at the top left.
		   if (direction.equals("UP")) {
			   //can't access the variable directly, that's why you use get/set methods
			   setY(getY() - getSpeed());
		   }
		   else if (direction.equals("DOWN")) {
			   setY(getY() + getSpeed());
		   }
		   else if (direction.equals("LEFT")) {
			   setX(getX() - getSpeed());
		   }
		   else if (direction.equals("RIGHT")) {
			   setX(getX() + getSpeed());
		   }
	}

	public String toString()
	{
		return "";
	}
}
