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
import java.util.concurrent.TimeUnit;
import java.awt.geom.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//testGUI made to experiment with the GUI
//none of this is final, this is just a testing ground.

public class TestGUI extends JFrame {
    
	private JPanel panel;
	
    final int WIDTH = 1000, HEIGHT = 1000;
    
    public TestGUI() {
    	//create JFrame - name of JFrame
        super("Andrew Tian - Final Project - Democracy Simulator");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        panel = new MainPanel();
        panel.setBounds(0,0,WIDTH,HEIGHT);
        getContentPane().add(panel);

        this.getContentPane().add(panel);
        
        
        //CAN I LOOP WITH THIS?!!!
        try
        {
            Thread.sleep(5000);
            System.out.println("REACHED IT!");
            this.getContentPane().remove(panel);
            panel = new NotMainPanel();
            panel.setBounds(0,0,WIDTH,HEIGHT);
            getContentPane().add(panel);

            this.getContentPane().add(panel);
            panel.revalidate();
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
    
    
    private class NotMainPanel extends JPanel { 
        public NotMainPanel() {
            super();
        }
        //draw graphics
        @Override
        public void paintComponent(Graphics g) {
        	super.paintComponent(g);
        	 //first create a white BG
	        g.setColor(Color.WHITE);
	        g.fillRect(0,0,WIDTH,HEIGHT);
        }
    }
    
    
    
    private class MainPanel extends JPanel { 
        public MainPanel() {
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
	        Municipal Muni1 = new Municipal(10000000);
	        
			//test Scenario - can be modified later.
			Muni1.setCommunist(50);
			Muni1.setPopulistLeft(200);
			Muni1.setAnarchistLeft(50);
			Muni1.setProgressives(400);
			Muni1.setCorporatism(400);
			Muni1.setFacist(50);
			Muni1.setSocialLiberals(300);
			Muni1.setSocialDemocrats(400);
			Muni1.setGreens(50);
			Muni1.setCentrist(50);
			Muni1.setMarketLiberal(400);
			Muni1.setFundementalist(300);
			Muni1.setReactionairy(300);
			Muni1.setPopulistRight(200);
			Muni1.setMonarchist(800);
			Muni1.setSocialConservatives(600);
			Muni1.setTheoConservatism(100);
			Muni1.setLibertarian(50);
	        
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
			g.fillRect(20,120,20, - 1 *Muni1.getPartyPercentage(Muni1.getParties().get(0))); //Multiplied by -1 since its the reverse when drawed.
	        
	        //Party 2
			g.setColor(Color.ORANGE);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(50,120,20,-1 * Muni1.getPartyPercentage(Muni1.getParties().get(1)));
			
	        //Party 3
			g.setColor(Color.CYAN);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(80,120,20,-1 * Muni1.getPartyPercentage(Muni1.getParties().get(2)));
	        
	        //Party 4
			g.setColor(Color.PINK);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(110,120,20,-1 * Muni1.getPartyPercentage(Muni1.getParties().get(3)));
			
	        //Party 5
			g.setColor(Color.GREEN);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(140,120,20,-1 * Muni1.getPartyPercentage(Muni1.getParties().get(4)));
			
	        //Party 6
			g.setColor(Color.YELLOW);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(170,120,20,-1 * Muni1.getPartyPercentage(Muni1.getParties().get(5)));
			
	        //Party 7
			g.setColor(Color.BLUE);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(200,120,20,-1 * Muni1.getPartyPercentage(Muni1.getParties().get(6)));
			
	        //Party 8
			g.setColor(Color.MAGENTA);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(230,120,20,-1 * Muni1.getPartyPercentage(Muni1.getParties().get(7)));
			
	        //Party 9
			g.setColor(Color.LIGHT_GRAY);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(260,120,20,-1 * Muni1.getPartyPercentage(Muni1.getParties().get(8)));
			
	        //Party 10
			g.setColor(Color.BLACK);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(290,120,20,-1 * Muni1.getPartyPercentage(Muni1.getParties().get(9)));
			
	        //Party 11
			g.setColor(Color.DARK_GRAY);
			//this is for their actual popularity. The Height of the bar will be determined by their Party's Popularity (percentage)
			//remember its x, y, width, height
			g.fillRect(320,120,20,-1 * Muni1.getPartyPercentage(Muni1.getParties().get(10)));
	        
			g.drawString(Muni1.toString(),540,100);
	        
    }
    }
        /*
    //MainPanel2 is for regular 
    private class MainPanel2 extends JPanel { 
        public MainPanel2() {
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
		        Muni.setYear(1904);
		        
				//pullthedata from the ifle/
		        Muni.dataUpdate();
		        Muni.popularityUpdate();
		        System.out.println("commies: " + Muni.getCommunist());
		        Muni.popularityUpdate();
		        System.out.println("commies: " + Muni.getCommunist());
		        Muni.popularityUpdate();
		        System.out.println("commies: " + Muni.getCommunist());
		        Muni.popularityUpdate();
		        System.out.println("commies: " + Muni.getCommunist());
		        Muni.popularityUpdate();
		        System.out.println("commies: " + Muni.getCommunist());
		        
		        //System.out.println("New: " + Muni.toString());
		        //Muni.electionUpdate(0);
		        //Muni.setSeats(10);
		        
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
				g.fillRect(20,520,30, - 1 *Muni.getPartyPercentage(Muni.getParties().get(0))); //Multiplied by -1 since its the reverse when drawed.
		        System.out.println("Communist: " + Muni.getPartyPercentage(Muni.getParties().get(0)));
		        
				
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
			try {
				Muni.popularityUpdate();
				Muni.writetofile();
				System.out.println("Wrote into file!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }
	        private void update (Municipal Muni) {
	        	
	        }
    }
    */

    public static void main (String [] args) {
        new TestGUI();
        //Mainpanel();
    }
}
