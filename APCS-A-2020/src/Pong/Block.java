package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		//uhh this one can stay blank...
	}

	//add other Block constructors - x , y , width, height, color
	
	//this one is for ball
	public Block(int x, int y) {
		this(x, y, 10, 10, Color.BLACK);
	}
	
	public Block (int x, int y, int width, int height) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}
	
	public Block (int x, int y, int width, int height, Color color) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
		setColor(color);
	}
   //add the other set methods
   

   public void setColor(Color col) {
	   color = col;
   }
   
   public Color getColor() {
	   return color;
   }

   public void draw(Graphics window) {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col) {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj) {
		if (((Block) obj).getX() == xPos && ((Block) obj).getY() == yPos){
			return true;
		}
		return false;
	}   

   //add the other get methods
	
	public int getX() {
		return xPos;
	}
	
	public void setX(int newx) {
		xPos = newx;
	}
	
	public int getY() {
		return yPos;
	}
    
	public void setY(int newy) {
		yPos = newy;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int newwidth) {
		width = newwidth;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int newheight) {
		height = newheight;
	}
	
	
   //add a toString() method  - x , y , width, height, color
	public String toString() {
		return "xPos: " +  xPos + ", yPos: " + yPos + ", Width: " + width + ", height: " + height + ", Color: " + color;
	}

	@Override
	public void setPos(int x, int y) {
	// TODO Auto-generated method stub
		setX(x);
		setY(y);
	}
}
