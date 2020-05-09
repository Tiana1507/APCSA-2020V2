package WinterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;

public class Tree extends AbstractShape
{
 public Tree(int x, int y, int w, int h )
 {
		super(x, y, w, h, Color.WHITE, 0, 0);
 }

 public void draw(Graphics window)
 {
	 //lets us have randomly located base x
	 Random rand = new Random();
	 int Xinit = rand.nextInt(300)+200;
	 int Yinit = rand.nextInt(200)+150;
	 
	 //list of coordinates for the tree components, all triangles, all depend on the randomly generated component.
	 int[]xtri1 = {Xinit-40,Xinit+60,Xinit+10};
	 int[]xtri2 = {Xinit-30,Xinit+50,Xinit+10};
	 int[]xtri3 = {Xinit-20,Xinit+40,Xinit+10};
	 int[]xtri4 = {Xinit-15,Xinit+35,Xinit+10};
	 
	 int[]ytri1 = {Yinit,Yinit,Yinit-30};
	 int[]ytri2 = {Yinit-25,Yinit-25,Yinit-50};
	 int[]ytri3 = {Yinit-45,Yinit-45,Yinit-60};
	 int[]ytri4 = {Yinit-55,Yinit-55,Yinit-70};
	 
	 
	 //draw the base of the tree
	 setColor(Color.BLACK);
	 window.fillRect(Xinit,Yinit,20,20);
	 //lowest part of tree
	 setColor(Color.GREEN);
	 window.fillPolygon(xtri1, ytri1, 3);
	 //second part of tree
	 window.fillPolygon(xtri2, ytri2, 3);
	 //almosttop of the tree
	 window.fillPolygon(xtri3, ytri3, 3);
	 //top
	 window.fillPolygon(xtri4, ytri4, 3);
	 
	 
	 
	 //lowest 
	 //window.fillOval(Xinit,Yinit,30,30);
	 //middle
	 //window.fillOval(Xinit+5,Yinit-20,20,20);
	 //top
	 //window.fillOval(Xinit+10,Yinit-30,10,10);
	 
	 //window.fillOval(200,200,30,30);
	 //window.fillOval(205,180,20,20);
	 //window.fillOval(210,170,10,10);
 }

 public void moveAndDraw(Graphics window)
 {
    draw(window);   
 }
}
