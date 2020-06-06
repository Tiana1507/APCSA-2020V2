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

public class National extends Provincial{
	public National(int P) {
		super(P);
		// TODO Auto-generated constructor stub
	}
	public ArrayList<MP> Parliament= new ArrayList<MP>();
	public ArrayList<Provincial> Provinces= new ArrayList<Provincial>();
	
	/*
	public void getPartiesMuni(){
		(for P : Provinces)	{
		// add to a total.
			P.getPartyPopularity(P.getPartiesProv());
		}
	
	}	
	
	@Override
	public void electionUpdate(){
		Random rand = new Random();
		.clear();
		System.out.println(Parliament.size());
		setYear(getYear()); //connect this to another.
		//runs through every seat in the Parliament
		for (int i = 0; i <PParties.size();i++) {
			if (getPartyPercentage(PParties.get(i)) >= 10) {
				Parliament.add(new MP(PParties.get(i)));
				
				//String printtest = "";
				///for (int j = 0; j < Parliament.size();j++) {
					//printtest = printtest + ", " + Parliament.get(j).getIdeology();
				//}
				//System.out.println("Current Seats: " + printtest);
			}
			if (getPartyPercentage(PParties.get(i)) >= 20) {
				Parliament.add(new MP(PParties.get(i)));
			}
			if (getPartyPercentage(PParties.get(i)) >= 30) {
				Parliament.add(new MP(PParties.get(i)));
			}
		}
		//finds out remaining seats.
		int seatsleft = size - Parliament.size();
		System.out.println(Parliament.size());
		while (seatsleft > 0) {
			//System.out.println(Parliament.size());
			//System.out.println("Looping!");
			//System.out.println(Parliament.get(0).getIdeology());
			Parliament.add(new MP(PParties.get(rand.nextInt(10))));
			seatsleft = size - Parliament.size();
		}
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	*/
	
	
}
