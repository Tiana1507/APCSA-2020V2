package FinalProject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Object;

public class testingFile extends legislativeBasic{

	
	public static ArrayList<String> PParties;
	
	//this file is just to test the different classes and see of they work
	public static void main (String args[]) throws IOException {
		
		//testing legistlativeBasic
		legislativeBasic boomer = new legislativeBasic();
		
		boomer.setPopulistLeft(5);
		boomer.setAnarchistLeft(100);
		int newboomer = boomer.popularitySum();
		//System.out.println(newboomer);
		
		
		/* try {
			//C:\Users\andre\Desktop\partylist.txt
			//Scanner input = new Scanner(new File((System.getProperty("user.dir") + "/partylist")));
			PParties = new ArrayList<String>();
			Scanner input = new Scanner(new File("C:\\Users\\andre\\Desktop\\partylist.txt"));
			while (input.hasNextLine()) {
				// Temp string to store the input
				String temp = input.nextLine().trim();
				
				//for formatting
				//if (!temp.equals("105")) {
					//System.out.println(temp);
				//}
				
				if (temp.contains("Party-")) {
					temp = temp.substring(6);
					//System.out.println(temp);
					//add the party into the List. We now have our list of Parties!
					PParties.add(temp);
				}
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Can't find PartyList! " + e);
		} */
	 
		//works!
		Municipal Muni1 = new Municipal(10000000);
		Muni1.getParties();
		//for (String s : PParties) {
			//System.out.println(s);
		//}
		
		//test Scenario
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
		
		for (int i = 0; i < 31; i++) {
			if (Muni1.getDemocracy()) {
				Muni1.setYear(i * 4 + 1900);
				Muni1.electionUpdate(i * 4 + 1900);
				System.out.println(Muni1.toString());
				Muni1.popularityUpdate();
				Muni1.writetofile();
				//System.out.println("TEST CASE");
				Muni1.dataUpdate();
				Muni1.toString();
			}
		}
		//party popularity works!
		//System.out.println(Muni1.getPartyPopularity("Popular Front"));
		//System.out.println(Muni1.popularitySum());
	}
}
