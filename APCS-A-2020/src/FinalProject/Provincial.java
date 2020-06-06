package FinalProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Provincial extends Municipal{
	public Provincial(int P) {
		super(P);
		// TODO Auto-generated constructor stub
	}
	public ArrayList<MP> ProvincialAssembly= new ArrayList<MP>();
	public ArrayList<Municipal> Municipals= new ArrayList<Municipal>();
	
	//the parties of Provincial are composed of the lower level ones.
	//UNDER RECONSTRUCTION.
	
	/*
	public void getPartiesProv(){
		(for M : Municipals)	{
		// add to a total.
			M.getPartyPopularity(M.getPParties());
		}
	
	}	 
	*/
	
	/*
	@Override
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
	
	@Override
	public void writetofile () throws IOException {
	    
	    /*String toappend = "Popularities: ";
	    System.out.println(toappend);
	    //write the party popularities percentages:
	    for (String s : PParties) {
	    	toappend = "\nQ" + getPartyPercentage(s);
	    	//System.out.println(getPartyPercentage(s));
	    }
	    */
		/*
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
	    //toappend = "\nQ" + getCommunist() + "\nQ" + getAnarchistLeft() + "\nQ" + getSocialist() + "\nQ" + getPopulistLeft() + "\nQ" + getGreens() + "\nQ" + getSocialDemocrats() + "\nQ" + 
	    //getProgressives() + "\nQ" + getSocialLiberals() + "\nQ" + getCentrist() + "\nQ" + getMarketLiberal() + "\nQ" + getLibertarian() + "\nQ" + getSocialConservatives() + "\nQ" + 
	    //getTheoConservatism() + "\nQ" + getCorporatism() + "\nQ" + getMonarchist() + "\nQ" + getReactionairy() + "\nQ" + getPopulistRight() + "\nQ" + getFundementalist() + "\nQ" + getFacists();
	     
	    //System.out.println(toappend);
	    //writer.append(toappend);
	    
	    //writer.flush();
	}
	*/
}
