package Pong;
//(c) A +  Computer Science
//www.apluscompsci.com
//Name - Andrew Tian

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character. * ;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.JLabel;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int p1Point;
	private int p2Point;
	private Block erase;
	private Wall wall;
	
	public Pong()
	{
		//set up all variables related to the game
		ball = new BlinkyBall(400, 300, 10, 10, Color.WHITE, 2, 1);
		
		//PADDDIES
		leftPaddle = new Paddle(50, 400, 10, 60, Color.WHITE, 4);
		rightPaddle = new Paddle(750, 510, 10, 60, Color.WHITE, 4);
		keys = new boolean[4];
		p1Point = 0;
		p2Point = 0;
		erase = new Block(400, 530, 200, 60, Color.BLACK);
		wall = new Wall();
    	setBackground(Color.BLACK);
		setVisible(true);
		
		
		new Thread(this).start();
		
		//starts the key thread to log key strokes
		addKeyListener(this);
		
	}
	
   public void update(Graphics window){
	   //calls the score
	   printScore(window); 
	   paint(window);
   }

   public void paint(Graphics window)
   {
	   
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if (back == null) {
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));
		}
		
		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		
		//Then, make new instance variables for all 4 Walls. Finally, rewrite your code	so	that you actually check to see if the Ball collides with the Walls rather than will fixed number boundaries.
		//see if ball hits left wall or right wall
		int balltype = 0;
		
		if (!(ball.getX() >= wall.getX() && ball.getX() <= (wall.getWidth()-ball.getWidth()))) {
			if (ball.getX() >= (wall.getWidth()-ball.getWidth())) {
				p1Point += 1;
			}
			else if (ball.getX() <= wall.getX()) {
				p2Point += 1;
			}
		
			ball.setColor(Color.BLACK);
			
			//randomizer function to determine which direction at the start.
			if ((Math.random() * 100 < 33) && (Math.random() * 100 > 0)) {
				ball.setXSpeed(0);
				ball.setYSpeed(0);
				ball.draw(graphToBack, Color.WHITE);
				ball = new BlinkyBall(400, 300, 10, 10, Color.WHITE, 2, -1);
				System.out.println("BLINKY");
			}
			else if ((Math.random() * 100  >=  33) && (Math.random()  *  100  <=  66)) {
				ball.setXSpeed(0);
				ball.setYSpeed(0);
				ball.draw(graphToBack, Color.WHITE);
				ball = new InvisibleBall(400, 300, 10, 10, Color.WHITE, -2, 1); 
				balltype = 1;
				System.out.println("INVISIBALL");
			}
			else {
				ball.setXSpeed(0);
				ball.setYSpeed(0);
				ball.draw(graphToBack, Color.WHITE);
				ball = new SpeedUpBall(400, 300, 10, 10, Color.WHITE, -2, 1); 
				System.out.println("SPEEDBALL");
			}
		}
		
		//see if the ball hits the top or bottom wall 
		if (!(ball.getY() >=  wall.getY() && ball.getY() <=  wall.getHeight()-ball.getHeight()-ball.getYSpeed()-20)) {
			ball.setYSpeed(ball.getYSpeed() * -1);
			//System.out.println("TESTER!");
		}

		//see if the ball hits the left paddle
		if (ball.didCollideLeft(leftPaddle)) {
			if (ball.getX() <=  (leftPaddle.getX() + leftPaddle.getWidth()-Math.abs(ball.getXSpeed()))) {
				ball.setYSpeed(Math.abs(ball.getYSpeed()));
				//System.out.println("TESTER!");
			}
			else {
				ball.setXSpeed(Math.abs(ball.getXSpeed()));
				//System.out.println("TESTER!");
			}
		}	
		//checks if its the top of the bottom
		if (ball.didCollideTop(leftPaddle))	{
			ball.setYSpeed(-1 * Math.abs(ball.getYSpeed()));
			//System.out.println("TESTER!");
		}	
		if (ball.didCollideBottom(leftPaddle)) {
			ball.setYSpeed(Math.abs(ball.getYSpeed()));
			//System.out.println("TESTER!");
		}
		
		
		//see if the ball hits the right paddle
		//use method in ball
		if (ball.didCollideRight(rightPaddle)) {
			if (ball.getX() >=  (rightPaddle.getX() + rightPaddle.getWidth() + Math.abs(ball.getXSpeed()))) {
				ball.setYSpeed(-1 * Math.abs(ball.getYSpeed()));
				//System.out.println("TESTER!");
			}
			else {
				ball.setXSpeed(-1 * Math.abs(ball.getXSpeed()));
				//System.out.println("TESTER!");
			}
		}
		
		//colided top of the right paddle
		if (ball.didCollideTop(rightPaddle)) {
			ball.setYSpeed(-1 * Math.abs(ball.getYSpeed()) + rightPaddle.getSpeed());
			//System.out.println("TESTER!");
		}
		
		if (ball.didCollideBottom(rightPaddle)) {
			ball.setYSpeed(Math.abs(ball.getYSpeed()) + rightPaddle.getSpeed());
			//System.out.println("TESTER!");
		}
		//see if the paddles need to be moved
		if (keys[0] == true && leftPaddle.getY()>leftPaddle.getSpeed()) {
			leftPaddle.moveUpAndDraw(graphToBack);
			//System.out.println("TESTER!");
		}
		
		if (keys[1] == true && leftPaddle.getY()<(600-leftPaddle.getHeight()-20)) {
			leftPaddle.moveDownAndDraw(graphToBack);
			//System.out.println("TESTER!");
		}
		
		if (keys[2] == true && rightPaddle.getY()>rightPaddle.getSpeed()) {
			rightPaddle.moveUpAndDraw(graphToBack);
			//System.out.println("TESTER!");
		}	
		
		if (keys[3] == true && rightPaddle.getY()<(600-rightPaddle.getHeight()-20)) {
			rightPaddle.moveDownAndDraw(graphToBack);
			//System.out.println("TESTER!");
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}
   
   public void printScore(Graphics window) {
	   	//set up the score text.
	    window.setColor(Color.WHITE);
	    window.drawString("Player 1:"  +  p1Point, 350, 50);
	    window.drawString("Player 2:"  +  p2Point, 350, 70);
   }

	public void keyPressed(KeyEvent e) {
		//left side is ws
		//right side is ok
		switch(toUpperCase(e.getKeyChar())) {
			case 'W' : keys[0] = true; break;
			case 'S' : keys[1] = true; break;
			case 'O' : keys[2] = true; break;
			case 'K' : keys[3] = true; break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch(toUpperCase(e.getKeyChar())) {
			case 'W' : keys[0] = false; break;
			case 'S' : keys[1] = false; break;
			case 'O' : keys[2] = false; break;
			case 'K' : keys[3] = false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(4);
           repaint();
         }
      }
   	catch(Exception e) {
      }
    }	
}
