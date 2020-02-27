package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -  Andrew tian

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

  public void RockPaperScissors()
  {
  }
  
	public void setPlayers(String player)
	{
		playChoice = player;
		//note to self, breaks in code mean they just directly stop it, useful!
		int num = (int)((Math.random())*(3-1) + 1);
		switch (num) {
		case 1: compChoice = "R";
		break;
		case 2 : compChoice = "P";
		break;
		case 3: compChoice = "S";
		break;
		}
	}

	public String determineWinner()
	{
		if (playChoice.equals(compChoice))
		{
			return "Nobody Won../";
		}
	    if (playChoice.equals("R")) {
				if (compChoice.equals("P")) {
					return "Computer Won!";
				}
				else if (compChoice.equals("S")) {
					return "Player Won!";
				}
			}
	    else if (playChoice.equals("P")) {
				if (compChoice.equals("R")) {
					return "Player Won!";
				}
				else if (compChoice.equals("S")) {
					return "Computer Won!";
				}
			}
	    else if (playChoice.equals("S")) {
				if (compChoice.equals("R")) {
					return "Computer Won!";
				}
				else if (compChoice.equals("P")) {
					return "Player Won!";
				}
	    }
	    return "Nobody Won...";
	}
	public String returnString()
	{
		return "Player: " + playChoice + "\nComputer: " + compChoice + "\n" + determineWinner();
	}
}