package FinalProject;

import java.util.ArrayList;
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

public class Municipal extends legislativeBasic{
	
	//population of the municipality.
	public int population = 100000;
	//growthrate for the population.
	public double growthrate;
	
	//MunicipalCouncil with a ArrayList of the MPs for this region.
	//DONT FORGET TO INITIALIZE IT.
	public ArrayList<MP> MunicipalCouncil= new ArrayList<MP>();	
	
	//ArrayList of political parties.
	public ArrayList<String> PParties = new ArrayList<String>();	
	
	//size of the Municipal Council.
	private int size = 10;
	
	//boolean to see if it's gerrymandered
	public boolean gerrymander;
	
	//number of the Municipality -- they exist purely for organization. 
	public int Mnumber;
	
	//the year of the election--used for events
	public int Year;
	
	//if the opposition has taken over and elections will not be held.
	public boolean democracy = true;
	
	public String toappend = "";
	
	//for the News!
	public String news = "";
	
	public Municipal(int P) {
		setPopulation(P);
	}
	
	
	//determines how many seats in the municipality based on population.
	//Every municipality should have the same number of seats. 
	public void muniSize (int p) {
		//size = population / 10000;
	}
	
	//ArrayList that will determine the municipal elections based on a variety of factors.
	//first find out how many seats there are.
	/*next divide it up into "safe" seat distributions and contested ones. 
	 *  - Here's how the system works:
	 *  - political parties will usually form with 2-4 ideologies within them. 
	 *  - Assuming there is 10 seats, so long as a political party can get more than 15% of the vote they are guaranteed 1 seat.
	 *  - Due to the nature of vote distribution the number of seats depends on other factors. 
	 *  - The 'Guaranteed' seats will be distributed first.
	 *  - After that the contested seats will be fought over
	 */
	public void electionUpdate(int year){
		Random rand = new Random();
		MunicipalCouncil.clear();
		System.out.println(MunicipalCouncil.size());
		setYear(year);
		//runs through every seat in the Municipal Council
		for (int i = 0; i <PParties.size();i++) {
			if (getPartyPercentage(PParties.get(i)) >= 10) {
				MunicipalCouncil.add(new MP(PParties.get(i)));
				
				//String printtest = "";
				///for (int j = 0; j < MunicipalCouncil.size();j++) {
					//printtest = printtest + ", " + MunicipalCouncil.get(j).getIdeology();
				//}
				//System.out.println("Current Seats: " + printtest);
			}
			if (getPartyPercentage(PParties.get(i)) >= 20) {
				MunicipalCouncil.add(new MP(PParties.get(i)));
			}
			if (getPartyPercentage(PParties.get(i)) >= 30) {
				MunicipalCouncil.add(new MP(PParties.get(i)));
			}
		}
		//finds out remaining seats.
		int seatsleft = size - MunicipalCouncil.size();
		System.out.println(MunicipalCouncil.size());
		while (seatsleft > 0) {
			//System.out.println(MunicipalCouncil.size());
			//System.out.println("Looping!");
			//System.out.println(MunicipalCouncil.get(0).getIdeology());
			MunicipalCouncil.add(new MP(PParties.get(rand.nextInt(10))));
			seatsleft = size - MunicipalCouncil.size();
		}
	}
	
	
	
	//updates the popularities of the different ideologies and then corresponds them to parties. 
	public void popularityUpdate() {
		Random rand = new Random();
		//regular change functions
		setCommunist (getCommunist()+rand.nextInt(100)*((Year-1900)/5));
		setAnarchistLeft (getAnarchistLeft()+rand.nextInt(100)*((Year-1900)/5));
		setSocialist(getSocialist()+rand.nextInt(100)*((Year-1900)/5));
		//Left
		setPopulistLeft (getPopulistLeft()+rand.nextInt(100)*((Year-1900)/5));
		setGreens (getGreens()+rand.nextInt(150)*((Year-1900)/5));
		setSocialDemocrats (getSocialDemocrats()+rand.nextInt(150)*((Year-1900)/5));
		//Moderate Left
		setProgressives (getProgressives()+rand.nextInt(150)*((Year-1900)/5));
		setSocialLiberals (getSocialLiberals()+rand.nextInt(150)*((Year-1900)/5));
		//Centrist
		setCentrist (getCentrist()+rand.nextInt(160)*((Year-1900)/5));
		//Moderate Right
		setMarketLiberal (getMarketLiberal()+rand.nextInt(150)*((Year-1900)/5));
		setLibertarian (getLibertarian()+rand.nextInt(150)*((Year-1900)/5));
		setSocialConservatives (getSocialConservatives()+rand.nextInt(150)*((Year-1900)/5));
		//Right
		setTheoConservatism (getTheoConservatism()+rand.nextInt(150)*((Year-1900)/5));
		setPopulistRight (getPopulistRight()+rand.nextInt(100)*((Year-1900)/5));
		setCorporatism (getCorporatism()+rand.nextInt(100)*((Year-1900)/5));
		//Far-Right
		setReactionairy (getReactionairy()+rand.nextInt(100)*((Year-1900)/5));
		setFundementalist (getFundementalist()+rand.nextInt(100)*((Year-1900)/5));
		setMonarchist (getMonarchist()+rand.nextInt(100)*((Year-1900)/5));
		setFacist (getFacists()+rand.nextInt(100)*((Year-1900)/5));
		
		
		//Special Event Years
		//First World War and aftermath
		if (Year <= 1920 && Year >= 1914) {
			//decline of Monarchy in the face of WW1
			//Facism also doesn't exist in force
			setMonarchist((int) (getMonarchist()*0.25));
			setCommunist((int) (getCommunist()*1.5));
			setSocialist((int) (getSocialist()*1.15));
			setAnarchistLeft((int) (getAnarchistLeft()*1.25));
			setFacist((int) (getFacists()*0.5));
			news = "First World War: Monarchism Dead, Communism and Facism on the Rise!";
		}
		//Roaring 20's
		//boom time for bussiness interests...
		else if (Year >= 1921 && Year <= 1929) {
			setMarketLiberal(getMarketLiberal()*2);
			setSocialConservatives((int) (getSocialConservatives()*1.25));
			setCorporatism((int) (getCorporatism()*1.5));
			setLibertarian((int) (getLibertarian()*1.5));
			setMonarchist((int) (getMonarchist()*0.25));
			news = "The Roaring 20s: Free-Markets, Corporations and Conservatives Dominate!";
		}
		//GREAT DEPRESSION, communism and facism rises.
		else if (Year >= 1930 && Year <= 1942) {
			setCommunist(getCommunist()*2);
			setSocialist((int) (getSocialist()*1.5));
			setAnarchistLeft((int) (getAnarchistLeft()*1.25));
			setMarketLiberal((int) (getMarketLiberal()*0.6));
			setCorporatism((int) (getCorporatism()*0.85));
			setFacist((int) (getFacists()*2.2));
			setMonarchist((int) (getMonarchist()*1.5));
			setLibertarian((int) (getLibertarian()*0.5));
			setCentrist ((int) (getCentrist()*0.8));
			setSocialDemocrats((int) (getSocialDemocrats()*1.75));
			news = "The Great Depression: Extremism is on the rise!";
		}
		//end of the second world war and Postwar boom
		//support for left wing and liberal ideologies
		else if (Year >= 1945 && Year <= 55) {
			setCommunist((int) (getCommunist()*1.2));
			setSocialist((int) (getSocialist()*1.1));
			setAnarchistLeft((int) (getAnarchistLeft()*1.1));
			setMarketLiberal((int) (getMarketLiberal()*1.1));
			setSocialLiberals((int) (getSocialLiberals()*2));
			setSocialConservatives((int) (getSocialConservatives()*1.5));
			setTheoConservatism((int) (getTheoConservatism()*1.5));
			setSocialDemocrats((int) (getSocialDemocrats()*1.1));
			setCorporatism((int) (getCorporatism()*0.8));
			setFacist((int) (getFacists()*0.1));
			setMonarchist((int) (getMonarchist()*0.2));
			news = "Post WW2 Economic Boom: American and Communist Ideologies compete!";
		}
		//height of the cold war -- soviet and American influence.
		else if (Year >= 1956 && Year <= 1980) {
			setCommunist((int) (getCommunist()*1.25));
			setSocialist((int) (getSocialist()*1.1));
			setAnarchistLeft((int) (getAnarchistLeft()*1.1));
			setMarketLiberal((int) (getMarketLiberal()*1.1));
			setSocialLiberals((int) (getSocialLiberals()*1.1));
			setSocialConservatives((int) (getSocialConservatives()*1.3));
			setSocialDemocrats((int) (getSocialDemocrats()*1.1));
			setCorporatism((int) (getCorporatism()*1.3));
			setLibertarian((int) (getLibertarian()*1.1));
			setCentrist ((int) (getCentrist()*1.1));
			news = "The Cold War: American and Soviet Influence Expanding!";
		}
		//Reagan--Breznev era Aggressive Influence
		//middle of the line parties get destroyed by these 
		else if (Year >= 1980 && Year <= 1991) {
			setCommunist((int) (getCommunist()*1.5));
			setSocialist((int) (getSocialist()*1.5));
			setPopulistLeft((int) (getPopulistLeft()*1.1));
			setSocialConservatives((int) (getSocialConservatives()*2));
			setSocialDemocrats((int) (getSocialDemocrats()*0.9));
			setSocialLiberals((int) (getSocialLiberals()*0.9));
			setCorporatism((int) (getCorporatism()*2));
			setTheoConservatism((int) (getTheoConservatism()*2));
			setFundementalist((int) (getFundementalist()*2.1));
			setLibertarian((int) (getLibertarian()*2));
			setCentrist ((int) (getCentrist()*0.5));
			setFacist((int) (getFacists()*2));
			setMonarchist((int) (getMonarchist()*2));
			news = "Reagan and Brezhnev: Extreme American and Soviet Intervention!";
		}
		//Fall of the soviet Union-90s Boom
		//rise of the Third Way as well as climate awareness
		else if (Year >= 1991 && Year <= 2001) {
			setCommunist((int) (getCommunist()*0.1));
			setSocialist((int) (getSocialist()*0.1));
			setAnarchistLeft((int) (getAnarchistLeft()*0.1));
			setSocialDemocrats((int) (getSocialDemocrats()*2));
			setGreens(getGreens()*2);
			setProgressives((int) (getProgressives()*1.25));
			setSocialLiberals((int) (getSocialLiberals()*1.5));
			setMarketLiberal((int) (getMarketLiberal()*1.85));
			setLibertarian((int) (getLibertarian()*1.25));
			setCentrist ((int) (getCentrist()*3));
			setMonarchist((int) (getMonarchist()*0.5));
			setFacist((int) (getFacists()*0.85));
			setSocialConservatives((int) (getSocialConservatives()*1.25));
			news = "The 90s: Rise of Centrism and the Fall of Communism";
		}
		// 9/11 and Pink Tide
		else if (Year >= 2002 && Year <= 2008) {
			setCommunist((int) (getCommunist()*0.1));
			setSocialist((int) (getSocialist()*0.1));
			setAnarchistLeft((int) (getAnarchistLeft()*0.1));
			setSocialDemocrats((int) (getSocialDemocrats()*2));
			setGreens((int) (getGreens()*2.5));
			setProgressives((int) (getProgressives()*1.25));
			setPopulistLeft((int) (getPopulistLeft()*2));
			setSocialLiberals((int) (getSocialLiberals()*1.5));
			setMarketLiberal((int) (getMarketLiberal()*1.85));
			setLibertarian((int) (getLibertarian()*1.25));
			setCentrist ((int) (getCentrist()*3));
			setMonarchist((int) (getMonarchist()*0.5));
			setFacist((int) (getFacists()*1.5));
			setPopulistRight((int) (getPopulistRight()*3.5));
			setReactionairy(getReactionairy()*3);
			setFundementalist(getFundementalist()*3);
			setSocialConservatives((int) (getSocialConservatives()*2));
			news = "September 11th and the Pink Tide (Left Wing Expansion)";
		}
		//2008 Crash and Beyond
		else if (Year >= 2009 && Year <= 2020) {
			setCommunist((int) (getCommunist()*1.5));
			setSocialist((int) (getSocialist()*1.5));
			setAnarchistLeft((int) (getAnarchistLeft()*2));
			setSocialDemocrats((int) (getSocialDemocrats()*2));
			setProgressives((int) (getProgressives()*2));
			setPopulistLeft((int) (getPopulistLeft()*5));
			setGreens((int) (getGreens()*1.5));
			setPopulistRight((int) (getPopulistRight()*5));
			setReactionairy(getReactionairy()*3);
			setSocialLiberals((int) (getSocialLiberals()*0.9));
			setMarketLiberal((int) (getMarketLiberal()*0.5));
			setTheoConservatism((int) (getTheoConservatism()*1.7));
			setLibertarian((int) (getLibertarian()*1.5));
			setCentrist ((int) (getCentrist()*0.8));
			setMonarchist((int) (getMonarchist()*0.1));
			setFacist((int) (getFacists()*1.1));
			setFundementalist((int) (getFundementalist()*1.5));
			news = "2008 Financial Crisis: Rise of Extremism once again!";
		}
		else {
			news = "";
		}
		
		if (Year >= 2020) {
			news = "Democracy... has Survived! Congrats!";
		}
		
		//checks to see if opposition has taken over.
		//if the democracy protecting parties have less than 40% of the voting block.
		if ((getSocialDemocrats() + getProgressives() + getGreens()+ getSocialLiberals()+getCentrist()+getLibertarian()+getMarketLiberal()+getSocialConservatives()+getTheoConservatism()) < (popularitySum()*0.4)) {
			democracy = false;
			news = "Democracy... has fallen.";
			if(getPartyPercentage("The People's Party") >= 20) {
				news += "With Democracy weak, the Communist People's Party begins an Uprising and seizes Power... in the name of the 'proletariat' of course!";
			}
			else if(getPartyPercentage("The Worker's Federation") >= 20) {
				news += "With Democracy unstable, the Socialist Worker's Federation cripples the country with strikes and takes Power... in the name of 'the people' of course!";
			}
			else if(getPartyPercentage("The Popular Front") >= 20) {
				news += "With Democracy still leaving many without a voice, the Left-Populist Popular Front sweeps into power and begins dismanteling the opposition... for the 'disenfranchised' of course!";
			}
			else if(getPartyPercentage("The Imperial Restoration Cliquen") >= 20) {
				news += "With Democracy collapsing, the Royal Family is invited to take up Emergency Powers... I'm sure they will only be 'Temporary'!";
			}
			else if(getPartyPercentage("The National Front") >= 20) {
				news += "With Democracy still leaving many without a voice, the Right-Populist Popular Front sweeps into power and begins dismanteling the opposition... for the 'Rightful Peoples' of course!";
			}
			else if(getPartyPercentage("The Spiritual Revival Association") >= 20) {
				news += "With Democracy and its openness, the Fundementalist SRA refuses to tolerate such 'moral decay' any further and encourages an uprising... for 'morality' of Course!";
			}
			else if(getPartyPercentage("National Harmony Party") >= 20) {
				news += "With Democracy and it weakness, the Facist National Harmony Party promises to return strength and duty... to all the 'Right People' of course!";
			}
			else {
				news += "The Parties fall into infighting--the Government collapses... and the civil war begins...";
			}
			
			System.out.println("So this is how the republic dies... with thundering applause!");
		}
	}
	
	//finds the number of seats each party has.
	/*public <Int>ArrayList partySeats(){
		ArrayList<Int> temp = new ArrayList<Int>();	
		
		//loops through to 
		for (int i = 0; i < PParties.size(); i++) {
			
		}
		
		return MunicipalCouncil;
		
	}
   */
	
	
	
	//Setter and Getter Methods for size
	public void setSize(int s) {
		size = s;
	}
	
	public int getSize() {
		return size;
	}
	
	
	
	//Setter and Getter Methods for Population
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int p) {
		population = p;
	}
	
	
	public ArrayList<String> getParties() {
		//public void getParties() {
				//initialize the party list.
				
				try {
					//empty the ArrayList ahead of time.
					//if (!PParties.isEmpty()) {
						//PParties.clear();
					//}
					//C:\Users\andre\Desktop\partyArrayList.txt
					//Scanner input = new Scanner(new File((System.getProperty("user.dir") + "/partyArrayList")));
					Scanner input = new Scanner(new File("C:\\Users\\andre\\Desktop\\partyList.txt"));
					while (input.hasNextLine()) {
						// Temp string to store the input
						String temp = input.nextLine().trim();
						//for formatting
						//f (!temp.equals("105")) {
							//System.out.println(temp);
						//}
						
						//finds out the parties in the list and then filters then out.
						if (temp.contains("Party-")) {
							temp = temp.substring(6);
							//System.out.println(temp);
							//add the party into the ArrayList. We now have our ArrayList of Parties!
							PParties.add(temp);
						}
					}
					input.close();
				} catch (Exception e) {
					System.out.println("Can't find PartyList! OR your code is bad Andrew, stop talking in the Third Person and fix it! " + e);
				}
				return PParties;
	}
	
	//function to get the partypopularity.
	//How it works is it will go into the file where the parties are stored and finds the party name, underneath will be a list of the ideologies that correspond to the Party.
	//From there we call out the functions to get the popularity associated with each ideology, add them up, then return it.
	public int getPartyPopularity(String partyname) {
		//reads the file.
		
		//integer to store the popularity
		int popularity = 0;
		
		//boolean used to make sure its the right lines that are being read.
		boolean usebool = false;
		
		try {
			//C:\Users\andre\Desktop\partyArrayList.txt
			//Scanner input = new Scanner(new File((System.getProperty("user.dir") + "/partyArrayList")));
			Scanner input = new Scanner(new File("C:\\Users\\andre\\Desktop\\partyList.txt"));
			while (input.hasNextLine()) {
				// Temp string to store the input
				String temp = input.nextLine().trim();
				if (usebool && temp.contains("Party-")) {
					usebool = false;
				}
				//reads the line and compares to which ideology;
				if (usebool) {
					//looks through all the name possibilities. 
					switch (temp) {
					case "COM":
						popularity+=getCommunist();
						break;
					case "ANL":
						popularity+=getAnarchistLeft();
						break;
					case "SOC":
						popularity+=getSocialist();
						break;
					case "PPL":
						popularity+=getPopulistLeft();
						break;
					case "GRE":
						popularity+=getGreens();
						break;
					case "SCD":
						popularity+=getSocialDemocrats();
						break;
					case "PRG":
						popularity+=getProgressives();
						break;
					case "SCL":
						popularity+=getSocialLiberals();
						break;
					case "CEN":
						popularity+=getCentrist();
						break;
					case "MKL":
						popularity+=getMarketLiberal();
						break;
					case "LIB":
						popularity+=getLibertarian();
						break;
					case "SCC":
						popularity+=getSocialConservatives();
						break;
					case "THC":
						popularity+=getTheoConservatism();
						break;
					case "PPR":
						popularity+=getPopulistRight();
						break;
					case "COR":
						popularity+=getCorporatism();
						break;
					case "REA":
						popularity+=getReactionairy();
						break;
					case "FUN":
						popularity+=getFundementalist();
						break;
					case "MON":
						popularity+=getMonarchist();
						break;
					case "FAS":
						popularity+=getFacists();
						break;
					//default:
						//System.out.println("You messed up Andrew!");
					}
				}
				//finds the right one.
				if (temp.contains(partyname)) {
					usebool = true;
				}
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Can't find PartyList! OR your code is bad Andrew, stop talking in the Third Person and fix it! " + e);
		}
		return popularity;
	}
	
	
	//function to get the partypopularity in terms of percentage overall rounded to the nearest number
	public int getPartyPercentage(String partyname) {
		double percentstorage = (double) ((double) getPartyPopularity(partyname) / (double) popularitySum());
		return (int) (percentstorage * 100);
	}
	
	
	
	//getter and setter methods for the municipal numbers
	public int getMuniNumber(){
		return Mnumber;
	}
	public void setMuniNumber(int mn) {
		Mnumber = mn;
	}
	
	//getter and setter methods for the years
	public int getYear() {
		return Year;
	}
	public void setYear(int y) {
		Year = y;
	}
	
	
	//getter and setter methods for democratic.
	public boolean getDemocracy() {
		return democracy;
	}
	public void setDemocracy(boolean y) {
		democracy = y;
	}
	
	//reads the data in the file and updates it
	public void dataUpdate() {
		int ideocount = 1; 
		boolean startcount = false;
		for (int i = 0; i < ideocount;i++) {
			
		}
		try {
			//C:\Users\andre\Desktop\partyList.txt
			//Scanner input = new Scanner(new File((System.getProperty("user.dir") + "/partyList")));
			Scanner input = new Scanner(new File("C:\\Users\\andre\\Desktop\\partyList.txt"));
			while (input.hasNextLine()) {
				// Temp string to store the input
				String temp = input.nextLine().trim();
				if (temp.contains("Q")) {
					startcount = true;
				}
				if (startcount) {
					//cuts out the hastags
					temp = temp.substring(1);
					//System.out.println("clear temp: " + temp);
					switch (ideocount) {
					case 1:
						setCommunist(Integer.parseInt(temp));
						break;
					case 2:
						setAnarchistLeft(Integer.parseInt(temp));
						break;
					case 3:
						setSocialist(Integer.parseInt(temp));
						break;
					case 4:
						setPopulistLeft(Integer.parseInt(temp));
						break;
					case 5:
						setGreens(Integer.parseInt(temp));
						break;
					case 6:
						setSocialDemocrats(Integer.parseInt(temp));
						break;
					case 7:
						setProgressives(Integer.parseInt(temp));
						break;
					case 8:
						setSocialLiberals(Integer.parseInt(temp));
						break;
					case 9:
						setCentrist(Integer.parseInt(temp));
						break;
					case 10:
						setMarketLiberal(Integer.parseInt(temp));
						break;
					case 11:
						setLibertarian(Integer.parseInt(temp));
						break;
					case 12:
						setSocialConservatives(Integer.parseInt(temp));
						break;
					case 13:
						setTheoConservatism(Integer.parseInt(temp));
						break;
					case 14:
						setCorporatism(Integer.parseInt(temp));
						break;
					case 15:
						setMonarchist(Integer.parseInt(temp));
						break;
					case 16:
						setReactionairy(Integer.parseInt(temp));
						break;
					case 17:
						setPopulistRight(Integer.parseInt(temp));
						break;
					case 18:
						setFundementalist(Integer.parseInt(temp));
						break;
					case 19:
						setFacist(Integer.parseInt(temp));
						break;
					//default:
						//System.out.println("You messed up Andrew!");
					}
					ideocount += 1;
				}
			}
			getParties();
			input.close();
		} catch (Exception e) {
			System.out.println("Can't find PartyList! OR your code is bad Andrew, stop talking in the Third Person and fix it! " + e);
		}
	}
	
	public void writetofile () throws IOException {
	    
	    /*String toappend = "Popularities: ";
	    System.out.println(toappend);
	    //write the party popularities percentages:
	    for (String s : PParties) {
	    	toappend = "\nQ" + getPartyPercentage(s);
	    	//System.out.println(getPartyPercentage(s));
	    }
	    */
		
		FileWriter writer = new FileWriter("C:\\Users\\andre\\Desktop\\partyList.txt");
	    
		 writer.append("Party-The People's Party\r\n" + 
		    		"COM\r\n" + 
		    		"Party-The Worker's Federation\r\n" + 
		    		"ANL\r\n" + 
		    		"SOC\r\n" + 
		    		"Party-The Popular Front\r\n" + 
		    		"PPL\r\n" + 
		    		"GRE\r\n" + 
		    		"Party-Labour Party\r\n" + 
		    		"SCD\r\n" + 
		    		"PRG\r\n" + 
		    		"Party-Liberal Democratic Party\r\n" + 
		    		"SCL\r\n" + 
		    		"CEN\r\n" + 
		    		"MKL\r\n" + 
		    		"Party-The Libertarian Party\r\n" + 
		    		"LIB\r\n" + 
		    		"Party-Constitutionalist Conservative Party\r\n" + 
		    		"SCC\r\n" + 
		    		"THC\r\n" + 
		    		"Party-The Imperial Restoration Clique\r\n" + 
		    		"COR\r\n" + 
		    		"MON\r\n" + 
		    		"Party-The National Front\r\n" + 
		    		"REA\r\n" + 
		    		"PPR\r\n" + 
		    		"Party-The Spiritual Revival Association\r\n" + 
		    		"FUN\r\n" + 
		    		"Party-National Harmony Party\r\n" + 
		    		"FAS");
		/* 
		Party-The People's Party  
 		COM  
 		Party-The Worker's Federation  
 		ANL  
 		SOC  
 		Party-The Popular Front  
 		PPL  
 		GRE  
 		Party-Labour Party  
 		SCD  
 		PRG  
 		Party-Liberal Democratic Party  
 		SCL  
 		CEN  
 		MKL  
 		Party-The Libertarian Party  
 		LIB  
 		Party-Constitutionalist Conservative Party  
 		SCC  
 		THC  
 		Party-The Imperial Restoration Clique  
 		COR  
 		MON  
 		Party-The National Front  
 		REA  
 		PPR  
 		Party-The Spiritual Revival Association  
 		FUN  
 		Party-National Harmony Party  
 		FAS
 		*/
		
	    toappend = "\nQ" + getCommunist() + "\nQ" + getAnarchistLeft() + "\nQ" + getSocialist() + "\nQ" + getPopulistLeft() + "\nQ" + getGreens() + "\nQ" + getSocialDemocrats() + "\nQ" + 
	    getProgressives() + "\nQ" + getSocialLiberals() + "\nQ" + getCentrist() + "\nQ" + getMarketLiberal() + "\nQ" + getLibertarian() + "\nQ" + getSocialConservatives() + "\nQ" + 
	    getTheoConservatism() + "\nQ" + getCorporatism() + "\nQ" + getMonarchist() + "\nQ" + getReactionairy() + "\nQ" + getPopulistRight() + "\nQ" + getFundementalist() + "\nQ" + getFacists();
	     
	    //System.out.println(toappend);
	    writer.append(toappend);
	    
	    writer.flush();
	}
	
	//clears the file. 
	public void clearfile () throws IOException {
		//first removes the previous data there:
	    FileWriter fw = new FileWriter("C:\\Users\\andre\\Desktop\\partyList.txt",false);
	    
	    //writes it to the file without the new stuff.
	    FileWriter writer = new FileWriter("C:\\Users\\andre\\Desktop\\partyList.txt");
	    writer.append("Party-The People's Party\r\n" + 
	    		"COM\r\n" + 
	    		"Party-The Worker's Federation\r\n" + 
	    		"ANL\r\n" + 
	    		"SOC\r\n" + 
	    		"Party-The Popular Front\r\n" + 
	    		"PPL\r\n" + 
	    		"GRE\r\n" + 
	    		"Party-Labour Party\r\n" + 
	    		"SCD\r\n" + 
	    		"PRG\r\n" + 
	    		"Party-Liberal Democratic Party\r\n" + 
	    		"SCL\r\n" + 
	    		"CEN\r\n" + 
	    		"MKL\r\n" + 
	    		"Party-The Libertarian Party\r\n" + 
	    		"LIB\r\n" + 
	    		"Party-Constitutionalist Conservative Party\r\n" + 
	    		"SCC\r\n" + 
	    		"THC\r\n" + 
	    		"Party-The Imperial Restoration Clique\r\n" + 
	    		"COR\r\n" + 
	    		"MON\r\n" + 
	    		"Party-The National Front\r\n" + 
	    		"REA\r\n" + 
	    		"PPR\r\n" + 
	    		"Party-The Spiritual Revival Association\r\n" + 
	    		"FUN\r\n" + 
	    		"Party-National Harmony Party\r\n" + 
	    		"FAS");
	    writer.flush();
	}
	
	public ArrayList<String> giveList() {
		return PParties;
	}
	
	
	public String getNews() {
		return news;
	}
	
	//will output the string stuff (this is for testing and ease of viewing)
	public String toString() {
		String pList = "";
		for (String s : PParties) {
			pList = pList + s + " (" + getPartyPopularity(s) + ", ~" + getPartyPercentage(s) + "%)" + "\n";
		}
		//String aList = "";
		//for (String s : PParties) {
			//aList = aList + "\nQ" + getPartyPercentage(s);
		//}
		//toappend = aList;
		String council = "";
		for (MP mp : MunicipalCouncil) {
			council += mp.getIdeology() + "\n";
		}
		return "Population: " + population + "\nYear: " + Year + "\nPolitical Parties:\n" + pList + "\nCouncil Makeup:\n" + council;
	}
}
