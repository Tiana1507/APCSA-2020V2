package ConsumerLab;
import java.io.File;
import java.util.Scanner;
import java.lang.*;

class Main {
  public static void main(String[] args) {
	//test reading from files
	//read in the positive adjectives in postiveAdjectives.txt
	  
	  System.out.println("Sentiment Value of negAdj: " + Review.totalSentiment("src/ConsumerLab/negativeAdjectives.txt"));
	  System.out.println("Star Rating of posAdj: " + Review.starRating("src/ConsumerLab/positiveAdjectives.txt"));
	  System.out.println("Fake Review: " + Review.fakeReview("src/ConsumerLab/simpleReview.txt"));
	  System.out.println("Fake Positive Review: " + Review.negativefakeReview("src/ConsumerLab/simpleReview.txt"));
	  System.out.println("Fake Negative Review: " + Review.positivefakeReview("src/ConsumerLab/simpleReview.txt"));
	  
	/*try {
		Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
		while(input.hasNextLine()){
			String temp = input.nextLine().trim();
			System.out.println(temp);

		}
		input.close();
	}
	catch(Exception e){
		System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		*/
	}   
}