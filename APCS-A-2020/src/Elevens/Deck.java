package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
class Deck{

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;

   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck
	
	public Deck() {
		cards = new ArrayList<Card>();
		top = 51;
		
		for (int s = 0;s<SUITS.length;s++) {
			for (int f = 1; f<=13; f++) {
				//adding new cards with new suits and new faces in order
				cards.add(new Card(SUITS[s],null, f));
			}
		}
	}
	
//make a dealCard() method that returns the top card
   
	public Deck(String[]ranks, String[]suits, int[]pointValues) {
		cards = new ArrayList<Card>();
		
	}
	
	public boolean isEmpty() {
		if (SUITS.length==0)
			return true;
		return false;
	}

	//method to deal Cards
	public Card<?> dealCard() {
		Card<?> topCard;
		if(!isEmpty()) {
			topCard = cards.get(top);
			return topCard;
		}
			//put something here if the length of the deck is 0, so probably do nothing
		return null;
	}
	
	//write a shuffle() method
   	//use Collections.shuffle
   	//reset the top card 
}