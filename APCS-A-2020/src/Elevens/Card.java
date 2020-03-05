package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Andrew Tian
import java.util.Random;
import static java.lang.System.*;

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	private int faceNum = 0;
	private String suitName = "";
	private String faceName = "";
	private String rankName = "";
	
	//creates a card with 2 paras. This one is for the deckrunner.
	public Card(String suit, int face) {
		set2Card(suit,face);
		toString();
	}
	
	//creates a card with 3 paras. This one is for cardtester
	public Card(String suit, String rank, int face) {
		set3Card(suit, rank, face);
	}
	
	//sets the 3 arg card
	public void set3Card(String rank, String suit, int face) {
		setFace(face);
		setSuit(suit);
		setRank(rank);
	}
	
	//sets the 2 arg card
	public void set2Card(String suit, int face) {
		setFace(face);
		setSuit(suit);
		toString();
	}
//makes a card given two parameters (for the decks)
	
	public String setRank(String rank) {
		rankName = rank;
		return  rankName;
	}
//all the methods that set values
	public String setFace(int face) {
		faceNum = face;
		faceName =  FACES[faceNum];
		return  faceName;
	}
	
	public String setSuit(String suit) {
		suitName = suit;
		return suitName;
		}

//methods to call to get rank, suit, and face
	public String rank() {
		return rankName;
	}
	
	public String suit() {
		return suitName;
	}
	
	public int pointValue() {
		return faceNum;
	}
	
	//prints out
	public String toString() {
		return (FACES[faceNum] + " of " + suitName + ", point value is " + faceNum );
	}
 
	//matching function, check if they are the same or not.
 	public boolean matches(Object cardcompare) {
		System.out.println(cardcompare.toString());
		System.out.println(toString());
		if (cardcompare.toString().equals(toString())) {
			return true;
		}
		return false;
	}
}