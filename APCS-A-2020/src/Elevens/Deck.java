package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;
	private int deckSize;
	// this variable is equal to cards.size()
	
	//make a Deck constructor
	//refer cards to new ArrayList
	//set top to the top of the deck 51
	   	
	//loop through all suits
	//loop through all faces 1 to 13
	//add a new TwentyOneCard to the deck
	
	//deck for no intial para cards.
	public Deck() {
		//initialize cards
		cards = new ArrayList<Card>();
		top = 51;
		
		//loop suits
		for(int i1 = 0; i1<SUITS.length; i1++) {
			//loop 1-13
			for(int i2 = 1; i2<=13; i2++) {
				//adds new Card, uses the 2 input card parameter.
				cards.add(new Card(SUITS[i1], i2));
			}
		}
		deckSize = cards.size();
		top = deckSize-1;
		
		//shuffle the deck.
		shuffle();
		
	}

	
	//3 para-deck
	public Deck(String[] ranks, String[] suits, int[] pointValues) {
		//initialize cards
		cards = new ArrayList<Card>();				
		
		//loop suits
		for(int i1 = 0; i1 <suits.length; i1++) {
			//loop 1-13
			for(int i2 = 0; i2<ranks.length; i2++) {
				//adds new Card, uses the 3 input card parameter.
				cards.add(new Card(ranks[i2], suits[i1] , pointValues[i2]));
			}
		}
		deckSize = cards.size();
		top = deckSize-1;
		
		//shuffle the deck.
		shuffle();
	}
	 
	 public boolean isEmpty() {
		 if (deckSize == 0) {
			 return true;
		 }
		 return false;
	 }
	//make a dealCard() method that returns the top card
	 //should actually be called deal card but for some reason deck tester calls it deal.
	public Card deal() {
		Card topCard = new Card();
		if( isEmpty() )
			return new Card();
		else {
			if (top >= 0)
				topCard = cards.get(top);
		}
		
		//reduce the deck size after taking one out so next time through it can index properly.
		top -= 1;
		deckSize -= 1;
		return topCard;
	}
	
	//make a dealCard() method that returns the top card, this is NOT THE SAME AS THE DEAL METHOD.
	public Card dealCard(int i) {
		return cards.get(i-1);
	}
	
	public int size() {
		deckSize = cards.size();
		return deckSize;
	}
	
	//write a shuffle() method
   	//use Collections.shuffle
   	//reset the top card
	public void shuffle() {
		//simpler method lol
		Collections.shuffle(cards);
		/* old method doesn't work consistently.
		for (int i = deckSize; i <=1; i--) {
			int randindex = (int)Math.random() * (i);
			//takes a randint in order to reorient the cards.
			if (i >= 0) {
				Collections.swap(cards, randindex, i);
			}
		}
		deckSize = cards.size();
		*/
	}
	
	//toString method
	public String toString() {
		String returnString = "size = " + deckSize + "\nUndealt cards: \n";

		//loops through index to find undealt cards
		for (int i = deckSize - 1; i >= 0; i--) {
			returnString = returnString + cards.get(i);
			if (i != 0) {
				returnString = returnString + ", ";
			}
			else if ((deckSize - i) % 2 == 0) {
				returnString = returnString + "\n";
			}
		}

		//loops through to find dealt cards
		returnString = returnString + "\nDealt cards: \n";
		for (int i = cards.size() - 1; i >= deckSize; i--) {
			returnString = returnString + cards.get(i);
			if (i != deckSize) {
				returnString = returnString + ", ";
			}
			else if ((i - cards.size()) % 2 == 0) {
				returnString = returnString + "\n";
			}
		}
		return returnString;
	}
}
