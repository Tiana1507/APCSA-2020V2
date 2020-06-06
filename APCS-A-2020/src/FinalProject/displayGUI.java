package FinalProject;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.awt.geom.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Object;
import java.util.Random;

//displayGUI made to experiment with the GUI

public class displayGUI extends JFrame {
    
	private JPanel panel;
	
	public int year = 1900;
	
    final int WIDTH = 1000, HEIGHT = 1000;
    
    public Municipal Muni = new Municipal(10000);
    
    public displayGUI() throws IOException {
    	//create JFrame - name of JFrame
        super("Andrew Tian - Final Project - Democracy Simulator");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        panel = new IntroductoryPanel();
        panel.setBounds(0,0,WIDTH,HEIGHT);
        getContentPane().add(panel);

        this.getContentPane().add(panel);
        
        //timer system, runs for the duration of the thing.
        try
        {
        	//intro sequence -- delay of 5 seconds
        	Thread.sleep(5000);
        	
        	//instructions
        	this.getContentPane().remove(panel);
            panel = new InstructionPanel();
            panel.setBounds(0,0,WIDTH,HEIGHT);
            getContentPane().add(panel);
            this.getContentPane().add(panel);
            panel.revalidate();
            Thread.sleep(10000);
        	
        	//Muni Initial Setup.
			Muni.setCommunist(50);
			Muni.setSocialist(50);
			Muni.setPopulistLeft(200);
			Muni.setAnarchistLeft(50);
			Muni.setProgressives(400);
			Muni.setCorporatism(400);
			Muni.setFacist(50);
			Muni.setSocialLiberals(300);
			Muni.setSocialDemocrats(400);
			Muni.setGreens(50);
			Muni.setCentrist(50);
			Muni.setMarketLiberal(400);
			Muni.setFundementalist(300);
			Muni.setReactionairy(300);
			Muni.setPopulistRight(200);
			Muni.setMonarchist(800);
			Muni.setSocialConservatives(600);
			Muni.setTheoConservatism(100);
			Muni.setLibertarian(50);
            
            
        	//main sequence
        	for (int i = 0; i < 100; i++) {
    			if (Muni.getDemocracy()) {
    				//modify the number multipied by i to change the years between elections.
    				Muni.setYear(i * 5 + 1900);
    				//Muni.electionUpdate(i * 4 + 1900);
    				//System.out.println(Muni.toString());
    				Muni.popularityUpdate();
    				Muni.writetofile();
    				//System.out.println("TEST CASE");
    				Muni.dataUpdate();
    				Muni.toString();
    				
    	            //System.out.println("REACHED PANEL1!");
    	            this.getContentPane().remove(panel);
    	            panel = new MainPanel1();
    	            panel.setBounds(0,0,WIDTH,HEIGHT);
    	            getContentPane().add(panel);
    	            this.getContentPane().add(panel);
    	            panel.revalidate();
    	            Thread.sleep(1000);
    			}
        	}
        	
            /*
            Thread.sleep(3000);
            System.out.println("REACHED PANEL2!");
            this.getContentPane().remove(panel);
            panel = new MainPanel2();
            panel.setBounds(0,0,WIDTH,HEIGHT);
            getContentPane().add(panel);
            this.getContentPane().add(panel);
            panel.revalidate();
            */
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        

        
        //panel = new NotMainPanel();
        //panel.setBounds(0,0,WIDTH,HEIGHT);
        //getContentPane().add(panel);

        //this.getContentPane().add(panel);
        
    }
    
    
    private class IntroductoryPanel extends JPanel { 
        public IntroductoryPanel() {
            super();
        }
        //draw graphics
        @Override
        public void paintComponent(Graphics g) {
        	super.paintComponent(g);
        	 //first create a white BG
	        g.setColor(Color.WHITE);
	        g.fillRect(0,0,WIDTH,HEIGHT);
	        //Introductory screen with title, author, and instructions - 10
	        g.setColor(Color.BLACK);
			g.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,30));
			g.drawString("ANDREW TIAN",415,40);
			g.drawString("FINAL PROJECT",400,65);
			g.drawString("PERIOD 2 REMINGTON",350,90);
			g.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,50));
			g.drawString("DEMOCRACY SIMULATOR",200,300);
			
			g.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,30));
			g.drawString("This one runs on a Timer, no need to do anything.",200,400);
        }
    }
    
    //this panel is for instructions
    private class InstructionPanel extends JPanel { 
        public InstructionPanel() {
            super();
        }
        //draw graphics
        @Override
        public void paintComponent(Graphics g) {
        	super.paintComponent(g);
        	//first create a white BG
	        g.setColor(Color.WHITE);
	        g.fillRect(0,0,WIDTH,HEIGHT);
	        //Introductory screen with title, author, and instructions - 10
	        g.setColor(Color.BLACK);
			g.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,30));
			g.drawString("Welcome to Democracy Simulator!",40,40);
			g.drawString("A Nation with a Parliament is going to appear before you. ",40,65);
			g.drawString("Every few seconds, elections will occur that changes the Parliament",40,90);
			g.drawString("There are a large number of factors on how seats get elected",40,115);
			g.drawString("If the anti-democratic (*) parties get a larger share of the vote...",40,140);
			g.drawString("...The Republic is finished!", 40, 165);
			g.drawString("\nLet's see if the Democracy can last until 2020!",40,210);
			g.drawString("Here are the Parties: ", 500, 250);
			g.setColor(Color.RED);
			g.drawString("The People's Party (*)", 500, 275);
			g.setColor(Color.ORANGE);
			g.drawString("The Worker's Federation (*)", 500, 300);
			g.setColor(Color.CYAN);
			g.drawString("The Popular Front (*)", 500, 320);
			g.setColor(Color.PINK);
			g.drawString("Labour Party",500, 350);
			g.setColor(Color.GREEN);
			g.drawString("Liberal Democratic Party",500, 375);
			g.setColor(Color.YELLOW);
			g.drawString("Libertarian Party",500,400);
			g.setColor(Color.BLUE);
			g.drawString("Constitutionalist Conservative Party",500, 425);
			g.setColor(Color.MAGENTA);
			g.drawString("The Imperial Restoration Clique(*)",500, 450);
			g.setColor(Color.LIGHT_GRAY);
			g.drawString("The National Front(*)",500, 475);
			g.setColor(Color.BLACK);
			g.drawString("The Spiritual Revival Association(*)",500, 500);
			g.setColor(Color.DARK_GRAY);
			g.drawString("National Harmony Party(*)",500, 525);
        }
    }
    
    private class MainPanel1 extends JPanel { 
        public MainPanel1() {
            super();
        }
        
	    //draw graphics
	        @Override
	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        
	        //first create a white BG
	        g.setColor(Color.WHITE);
	        g.fillRect(0,0,WIDTH,HEIGHT);
	        
	        //create a new Municipality.
	        
			//test Scenario - can be modified later.
	        
	        //the bar graph will start at x = 20, y = 120. POPULARITY
	        //bar graphs will be 20 wide.
	        //they will be between 0 and 100 units tall.
			//each one will be 10 apart. 
			
			
			//second bargraph will be below - NUMBER OF SEATS
			//start at x = 20, y = 240
	        //they will be between 0 and 100 units tall.
			//each one will be 10 apart. 
	        
			//Party 1
			g.setColor(Color.RED);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(20,520,30, - 1 * 5 *Muni.getPartyPercentage(Muni.getParties().get(0))); //Multiplied by -1 since its the reverse when drawed.
	        
	        //Party 2
			g.setColor(Color.ORANGE);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(60,520,30,-1 * 5 * Muni.getPartyPercentage(Muni.getParties().get(1)));
			
	        //Party 3
			g.setColor(Color.CYAN);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(100,520,30,-1 * 5 *Muni.getPartyPercentage(Muni.getParties().get(2)));
	        
	        //Party 4
			g.setColor(Color.PINK);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(140,520,30,-1 * 5 *Muni.getPartyPercentage(Muni.getParties().get(3)));
			
	        //Party 5
			g.setColor(Color.GREEN);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(180,520,30,-1 * 5 *Muni.getPartyPercentage(Muni.getParties().get(4)));
			
	        //Party 6
			g.setColor(Color.YELLOW);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(220,520,30,-1 * 5 *Muni.getPartyPercentage(Muni.getParties().get(5)));
			
	        //Party 7
			g.setColor(Color.BLUE);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(260,520,30,-1 * 5 *Muni.getPartyPercentage(Muni.getParties().get(6)));
			
	        //Party 8
			g.setColor(Color.MAGENTA);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(300,520,30,-1 * 5 *Muni.getPartyPercentage(Muni.getParties().get(7)));
			
	        //Party 9
			g.setColor(Color.LIGHT_GRAY);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(340,520,30,-1 * 5 *Muni.getPartyPercentage(Muni.getParties().get(8)));
			
	        //Party 10
			g.setColor(Color.BLACK);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(380,520,30,-1 * 5 *Muni.getPartyPercentage(Muni.getParties().get(9)));
			
	        //Party 11
			g.setColor(Color.DARK_GRAY);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(420,520,30,-1 * 5 *Muni.getPartyPercentage(Muni.getParties().get(10)));
	        
			//g.drawString(Muni.toString(),540,100);
	        
			
			//Party List
			g.setColor(Color.BLACK);
			g.setFont(new Font("TIMES NEW ROMAN",Font.CENTER_BASELINE,24));
			g.drawString("Parties and their Popularity", 500, 250);
			g.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,24));
			g.setColor(Color.RED);
			g.drawString("The People's Party (*) - ~" + Muni.getPartyPercentage(Muni.getParties().get(0))+"%", 500, 275);
			g.setColor(Color.ORANGE);
			g.drawString("The Worker's Federation (*) - ~" + Muni.getPartyPercentage(Muni.getParties().get(1)) + "%", 500, 300);
			g.setColor(Color.CYAN);
			g.drawString("The Popular Front (*) - ~"+ Muni.getPartyPercentage(Muni.getParties().get(2)) + "%", 500, 325);
			g.setColor(Color.PINK);
			g.drawString("Labour Party - ~"+ Muni.getPartyPercentage(Muni.getParties().get(3)) + "%",500, 350);
			g.setColor(Color.GREEN);
			g.drawString("Liberal Democratic Party - ~"+ Muni.getPartyPercentage(Muni.getParties().get(4)) + "%",500, 375);
			g.setColor(Color.YELLOW);
			g.drawString("Libertarian Party - ~"+ Muni.getPartyPercentage(Muni.getParties().get(5)) + "%",500,400);
			g.setColor(Color.BLUE);
			g.drawString("Constitutionalist Conservative Party - ~"+ Muni.getPartyPercentage(Muni.getParties().get(6)) + "%",500, 425);
			g.setColor(Color.MAGENTA);
			g.drawString("The Imperial Restoration Clique(*) - ~"+ Muni.getPartyPercentage(Muni.getParties().get(7)) + "%",500, 450);
			g.setColor(Color.LIGHT_GRAY);
			g.drawString("The National Front(*) - ~" + Muni.getPartyPercentage(Muni.getParties().get(8)) + "%",500, 475);
			g.setColor(Color.BLACK);
			g.drawString("The Spiritual Revival Association(*) - ~"+ Muni.getPartyPercentage(Muni.getParties().get(9)) + "%",500, 500);
			g.setColor(Color.DARK_GRAY);
			g.drawString("National Harmony Party(*) - ~"+ Muni.getPartyPercentage(Muni.getParties().get(10)) + "%",500, 525);
			
			g.setColor(Color.BLACK);
			g.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,64));
			g.drawString("Year: " + Muni.getYear(),500,80);
			
			
			//Displaying those on the Municipal Council: Temp Solution until Class dispute can be resolved. 
			
			String thecouncil = "";
			int councilsize = 0;
			
			for (int i = 0; i <Muni.giveList().size();i++) {
				if (Muni.getPartyPercentage(Muni.giveList().get(i)) >= 10) {
					thecouncil += "" + Muni.giveList().get(i) + ", ";
					councilsize += 1;
				}
				if (Muni.getPartyPercentage(Muni.giveList().get(i)) >= 20) {
					thecouncil += "" + Muni.giveList().get(i) + ", ";
					councilsize += 1;
				}
				if (Muni.getPartyPercentage(Muni.giveList().get(i)) >= 30) {
					thecouncil += "" + Muni.giveList().get(i) + ", ";;
					councilsize += 1;
				}
				if (Muni.getPartyPercentage(Muni.giveList().get(i)) >= 40) {
					thecouncil += "" + Muni.giveList().get(i) + ", ";;
					councilsize += 1;
				}
			}
			
			Random rand = new Random();
			//finds out remaining seats.
			int seatsleft = Muni.getSeats() - councilsize;
			//System.out.println(MunicipalCouncil.size());
			while (seatsleft > 0) {
				//System.out.println(MunicipalCouncil.size());
				//System.out.println("Looping!");
				//System.out.println(MunicipalCouncil.get(0).getIdeology());
				councilsize += 1;
				if (councilsize == 10) {
					thecouncil += "" + Muni.giveList().get(rand.nextInt(10)) + ".";
				}
				else {
					thecouncil += "" + Muni.giveList().get(rand.nextInt(10)) + ", ";
				}
				seatsleft = Muni.getSeats() - councilsize;
			}
			
			java.util.List<String> items = Arrays.asList(thecouncil.split("\\s*,\\s*"));
			//Loop to print out the Council:
			g.setColor(Color.BLACK);
			g.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,24));
			g.drawString("THE COUNCIL:",5,560);
			for (int i = 0; i < 10; i++) {
				g.drawString(items.get(i), 5, 590 + 30*i);
			}
			
			
			//Adding in the news events area
			g.setColor(Color.BLACK);
			g.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,24));
			g.drawString("THE NEWS:",500,560);
			g.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,16));
			g.drawString(Muni.getNews(),500,585);
			
			
			//System.out.println("OG: " + Muni.toString());
			try {
				Muni.writetofile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
    }

    //Implemented in the DisplayRunner instead.
    /*
    public static void main (String [] args) throws IOException {
        new displayGUI();
        //Mainpanel();
    }
    */
}
