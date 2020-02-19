package ConsumerLab;
import java.io.File;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	//test reading from files
	//read in the positive adjectives in postiveAdjectives.txt
	  
	  System.out.println("Sentiment Value: " + Review.totalSentiment("src/ConsumerLab/positiveAdjectives.txt"));
	  System.out.println("Star Rating: " + Review.starRating("src/ConsumerLab/positiveAdjectives.txt"));
	  
	try {
		Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
		while(input.hasNextLine()){
			String temp = input.nextLine().trim();
			System.out.println(temp);

		}
		input.close();
	}
	catch(Exception e){
		System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
	}   
  }
}