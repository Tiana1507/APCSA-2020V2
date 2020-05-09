package WinterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;
import java.util.ArrayList;;


//extend the AbstractShape class to make a FancySnowFlake class

public class FancySnowFlake extends AbstractShape
{
	public int notbottom = 0;
	
	public FancySnowFlake(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
		// TODO Auto-generated constructor stub
	}
	
	public FancySnowFlake(int x, int y, int wid, int ht, Color col) {
		super(x, y, wid, ht, col);
		// TODO Auto-generated constructor stub
	}

	public FancySnowFlake(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(Graphics window)
	{
		window.fillOval(getXPos(), getYPos() , 5, 5);
		//for some reason it wont iterate so Ill use a goddamn list then.
		//int[] LISTVALUES = {40,60,80,100,120,140,160,180,200,220,240,260,280,300,320,340,360,380,400,420,440,460,480,500,520,540,560};
		//for (int i = 0; i< LISTVALUES.length;i++) {
			//if ((LISTVALUES[i] == getYPos()) && getYPos() != 560){
				//setYPos(LISTVALUES[i+1]);
				//System.out.println(getYPos());
				//break;
			//}
			//else {
				//setYPos(LISTVALUES[0]);
				//System.out.println(getYPos());
				//break;
			//}
		//}
		
		//Random ughh = new Random();
		//at the top
		//if (notbottom == 3) {
			//int initialx = ughh.nextInt(800);
			//window.drawOval(initialx, notbottom , 5, 5);
		//}
		//freefall
		//if (notbottom == 0) {
			//int currentY = 5;
			//window.drawOval(getXPos(), currentY , 5, 5);
			////System.out.println("repeated!");
			//currentY += 5;
			//System.out.println(currentY);
		//}
		//hitting bottom
		//if (getYPos() >= 600) {
			//notbottom = 3;
		//}
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		draw(window);
		setYPos(getYPos() + 5);
		System.out.println("HERE!");
	}

}
