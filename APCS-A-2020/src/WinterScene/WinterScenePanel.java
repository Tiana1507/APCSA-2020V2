package WinterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class WinterScenePanel extends JPanel implements Runnable
{
	private List<AbstractShape> shapes;
	private AbstractShape sMan;
	public int snow0ypos = 80;
	public int snow1ypos = 300;
	public int snow2ypos = 40;
	public int snow3ypos = 120;
	public int snow4ypos = 500;
	public int snow5ypos = 10;
	public int snow6ypos = 500;
	public int snow7ypos = 100;
	public int snow8ypos = 300;
	

	public WinterScenePanel()
	{
		setVisible(true);
		//refer shapes to a new ArrayList of AbstractShape

		//populate the list with 50 unique snowflakes

		//instantiate a snowman

		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		Random saw = new Random();
		window.setColor(Color.BLUE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		//window.drawString("MAKE A WINTER SCENE!",40,40);

		//make the snowman appear
		SnowMan okboomer = new SnowMan(200,200,10,10);
		okboomer.draw(window);
		
		//SnowMan okboomer2 = new SnowMan(200,200,10,10);
		//okboomer2.draw(window);
		
		//draw tree
		window.setColor(Color.GREEN);
		Tree newtree = new Tree(200,200,10,10);
		newtree.draw(window);
		
		window.setColor(Color.WHITE);
		//make the snowflakes appear and move down the screen
		if (snow0ypos > 600) {
			System.out.println("True!");
			this.snow0ypos = 10;
			FancySnowFlake snowwww = new FancySnowFlake(50, snow0ypos, 5, 5,Color.WHITE);
			snowwww.draw(window);
		}
		else {
			FancySnowFlake snowwww = new FancySnowFlake(50, snow0ypos, 5, 5,Color.WHITE);
			snowwww.draw(window);
			snow0ypos += 5;
		}
				
		
		//if (hitbot0 = true) {
			//System.out.println("True!");
			//this.snow0ypos = 10;
			//FancySnowFlake snowwww = new FancySnowFlake(10, snow0ypos, 5, 5,Color.WHITE);
			//snowwww.draw(window);
			//hitbot0 = false;
		//}
		
		//else {
			//FancySnowFlake snowwww = new FancySnowFlake(10, snow0ypos, 5, 5,Color.WHITE);
			//snowwww.draw(window);
			//snow0ypos += 5;
		//}
		
		
		//make the snowflakes appear and move down the screen
		if (snow1ypos > 550) {
			System.out.println("True!");
			this.snow1ypos = 40;
			FancySnowFlake snowwww1 = new FancySnowFlake(110, snow1ypos, 5, 5,Color.WHITE);
			snowwww1.draw(window);
		}
		else {
			FancySnowFlake snowwww1 = new FancySnowFlake(110, snow1ypos, 5, 5,Color.WHITE);
			snowwww1.draw(window);
			snow1ypos += 5;
		}
		
		
		//FancySnowFlake snowwww1 = new FancySnowFlake(30, 80, 5, 5,Color.WHITE);
		//snowwww1.draw(window);
		
		if (snow2ypos > 590) {
			System.out.println("True!");
			this.snow2ypos = 40;
			FancySnowFlake snowwww2 = new FancySnowFlake(200, snow2ypos, 5, 5,Color.WHITE);
			snowwww2.draw(window);
		}
		else {
			FancySnowFlake snowwww2 = new FancySnowFlake(200, snow2ypos, 5, 5,Color.WHITE);
			snowwww2.draw(window);
			snow2ypos += 5;
		}
		
		//FancySnowFlake snowwww2 = new FancySnowFlake(70, 120, 5, 5,Color.WHITE);
		//snowwww2.draw(window);
		
		if (snow3ypos > 560) {
			System.out.println("True!");
			this.snow3ypos = 40;
			FancySnowFlake snowwww3 = new FancySnowFlake(270, snow3ypos, 5, 5,Color.WHITE);
			snowwww3.draw(window);
		}
		else {
			FancySnowFlake snowwww3 = new FancySnowFlake(270, snow3ypos, 5, 5,Color.WHITE);
			snowwww3.draw(window);
			snow3ypos += 5;
		}
		//FancySnowFlake snowwww3 = new FancySnowFlake(100, 400, 5, 5,Color.WHITE);
		//snowwww3.draw(window);
		
		if (snow4ypos > 580) {
			System.out.println("True!");
			this.snow4ypos = 40;
			FancySnowFlake snowwww4 = new FancySnowFlake(390, snow4ypos, 5, 5,Color.WHITE);
			snowwww4.draw(window);
		}
		else {
			FancySnowFlake snowwww4 = new FancySnowFlake(390, snow4ypos, 5, 5,Color.WHITE);
			snowwww4.draw(window);
			snow4ypos += 5;
		}
		//FancySnowFlake snowwww4 = new FancySnowFlake(150, 500, 5, 5,Color.WHITE);
		//snowwww4.draw(window);
		
		if (snow5ypos > 570) {
			System.out.println("True!");
			this.snow5ypos = 50;
			FancySnowFlake snowwww5 = new FancySnowFlake(500, snow5ypos, 5, 5,Color.WHITE);
			snowwww5.draw(window);
		}
		else {
			FancySnowFlake snowwww5 = new FancySnowFlake(500, snow5ypos, 5, 5,Color.WHITE);
			snowwww5.draw(window);
			snow5ypos += 5;
		}
		//FancySnowFlake snowwww5 = new FancySnowFlake(190, 300, 5, 5,Color.WHITE);
		//snowwww5.draw(window);
		
		//FancySnowFlake snowwww6 = new FancySnowFlake(210, 200, 5, 5,Color.WHITE);
		//snowwww6.draw(window);
		
		if (snow6ypos > 560) {
			System.out.println("True!");
			this.snow6ypos = 50;
			FancySnowFlake snowwww6 = new FancySnowFlake(510, snow6ypos, 5, 5,Color.WHITE);
			snowwww6.draw(window);
		}
		else {
			FancySnowFlake snowwww6 = new FancySnowFlake(510, snow6ypos, 5, 5,Color.WHITE);
			snowwww6.draw(window);
			snow6ypos += 5;
		}
		
		if (snow7ypos > 570) {
			System.out.println("True!");
			this.snow7ypos = 50;
			FancySnowFlake snowwww7 = new FancySnowFlake(720, snow7ypos, 5, 5,Color.WHITE);
			snowwww7.draw(window);
		}
		else {
			FancySnowFlake snowwww7 = new FancySnowFlake(720, snow7ypos, 5, 5,Color.WHITE);
			snowwww7.draw(window);
			snow7ypos += 5;
		}
		
		if (snow8ypos > 580) {
			System.out.println("True!");
			this.snow8ypos = 50;
			FancySnowFlake snowwww8 = new FancySnowFlake(650, snow8ypos, 5, 5,Color.WHITE);
			snowwww8.draw(window);
		}
		else {
			FancySnowFlake snowwww8 = new FancySnowFlake(650, snow8ypos, 5, 5,Color.WHITE);
			snowwww8.draw(window);
			snow8ypos += 5;
		}
		
		//check to see if any of the snowflakes need to be reset to the top of the screen
	}

 public void run()
 {
 	try
 	{
 		while(true)
 		{
 		   Thread.currentThread().sleep(35);
          repaint();
       }
    }catch(Exception e)
    {
    }
	}
}
