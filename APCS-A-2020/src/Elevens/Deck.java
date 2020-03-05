package Elevens;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {

	public static final int NUMCARDS = 52;
	public static String SUIT[] = {"CLUBS", "HEARTS", "DIAMONDS", "SPADES"};
	
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
	
	//deck for no intial para cards. This is for the deckrunner.
	public Deck() {
		//loops through each card in deck
		for (int count = 1; count <= NUMCARDS; count++) {
			//loops through each suit
			for (int suit = 1; suit <= 4; suit++) {
				//loops through each face
				for (int face = 1; face <= 13; face ++) {
					Card printCard = new Card(SUIT[suit], face);
					printCard.set2Card(SUIT[suit], face);
					cards.add(printCard);
				}
			}
		}
		shuffle();
	}

	
	//deck for 3 var cards
	 public Deck(int[] vals, String[] suits, String[] ranks) {
		//loops through each card in deck
		for (int count = 0; count < vals.length; count++) {
			//loops through each suit
			for (int suit = 0; suit < suits.length; suit++) {
				//loops through each face
				for (int face = 0; face < ranks.length; face ++) {
					Card printCard = new Card(suits[suit], ranks[face], vals[count]);
					printCard.set3Card(suits[suit], ranks[face], vals[count]);
					cards.add(printCard);
				}
			}
		}
		shuffle();
	}
	 
	 public boolean isEmpty() {
		 if (deckSize == 0) {
			 return true;
		 }
		 return false;
	 }
	//make a dealCard() method that returns the top card
	public Card dealCard(int index) {
		return cards.get(index);
	}
	
	public int size() {
		deckSize = cards.size();
		return deckSize;
	}
	//method to deal Cards
	public Card deal() {
		if (isEmpty()) {
			return null;
		}
		for (int i = deckSize; i > 0; i--) {
			dealCard(i);
			deckSize = deckSize - 1;
			top = i+1;
		}
		return cards.get(0);
	}
	//write a shuffle() method
   	//use Collections.shuffle
   	//reset the top card
	public void shuffle() {
		for (int i = deckSize; i <=1; i--) {
			int randindex = (int)Math.random()*(i);
			Collections.swap(cards,  randindex,  i);
		}
		deckSize = cards.size();
	}
}