package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -  andrew tian

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Rock Paper Scissors!");
		String response = "y";
  while (response.equals("y"))
    {
	  Scanner keyboard = new Scanner(in);
	  RockPaperScissors game = new RockPaperScissors();	
	  
	  out.print("Pick Your Weapon [R,P,S] :: ");
	  		String player = keyboard.nextLine();
	  		game.setPlayers(player);
	  		System.out.println(game.returnString());
	  		
	  	System.out.println("Would you like to play again? [y/n] ::");
	  	response = keyboard.nextLine();
	  	System.out.println("Bye");
    }
}
}