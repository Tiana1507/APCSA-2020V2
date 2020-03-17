package DataLab;

import java.util.ArrayList;
import java.util.Scanner;

import core.data.DataSource;

public class CerealRunner {

	public static void main(String[] args) {
		//INCOMPLETE WITHOUT CEREAL DATA SET.
		
		//note to self, find cereal data source later. 
		DataSource cereals = DataSource.connect("").load();

		cereals.printUsageString();

		//note to self, find cereal data source later. Don't currently have one.
    //itll come in the format of find the names first, then the carbs, then the proteins from whatever format the XML file has.
		ArrayList<Cereal> allcereals = cereals.fetchList(Cereal.class, "");
		System.out.println("Total Number of Cereals: " + allcereals.size());
		
		//look for highest protein
		int highprot = 0;
		String highprotcer = "";
		//look for lowest carbs
		int lowcarbs = 100000000;
		String lowcarbcer = "";
		
		for (Cereal c : allcereals) {
			if (c.getCarbs() < lowcarbs) {
				lowcarbs = c.getCarbs();
				lowcarbcer = c.getName();
			}
			if (c.getProtein() > highprot) {
				highprot = c.getProtein();
				highprotcer = c.getName();
			}
		}

		System.out.println("The Cereal with the most protein: " + highprotcer + " and the one with the least carbs is: " + lowcarbcer);

	}

}
