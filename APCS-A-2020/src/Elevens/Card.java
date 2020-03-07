package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Andrew Tian
import java.util.Random;
import static java.lang.System.*;

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	private int face = 0;
	private String suit = "";
	private int pointValue = 0;
	private String rank = "";
	
	//creates the card
	public Card() {
		//set blank at start
		setSuit("");
		setRank("");
		setFace(0);
		setPointValue(0);
	}
	
	//constructors, has a two vars just to satisfy decktester
	public Card(String cardSuit, int cardFaceValue) {
		suit = cardSuit;
		face = cardFaceValue;
	}
	
  	//constructors, has a third one first just to satisfy the card tester.
	public Card(String cardFace, String cardSuit, int cardFaceValue) {
		rank = cardFace;
		suit = cardSuit;
		face = cardFaceValue;
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
	
	//all the methods that set values for face, suit, pv, and rank
	public void setFace(int face) {
		//adding this turns it into the private instead of the input face value.
		this.face = face;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
		}
	
	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}

//methods to call to get rank, suit, pointvalue, and face
	//actually should have get in front of it but the cardtester doesn't read that.
	public String rank() {
		return rank;
	}
	
	//actually should have get in front of it but the cardtester doesn't read that.
	public String suit() {
		return suit;
	}
	
	//actually should have get in front of it but the cardtester doesn't read that.
	public int pointValue() {
		return pointValue;
	}
	
	//actually should have get in front of it but the cardtester doesn't read that.
	public int face() {
		return face;
	}
	
	//prints out
	public String toString() {
		//if the card is NOT 0 card
		if(pointValue != 0) {
			return rank + " of " + suit + " (point value = " + pointValue + ")";
		}
		else {
			return FACES[face]+ " of " + suit;
		}
	}
}
