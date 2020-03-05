package Elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

public class Card<instance>
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		private int face;
		private String suit;
		private int rank;
		private int pointValue;

  	//constructors
	public Card (String stringcardvalue, String suit, int cardFaceValue) {
		this.suit = suit;
		setFace(cardFaceValue);
		suit();
		rank();
		pointValue();
		toString();
	}

	// modifiers
		//set methods
	
	public void setAll(String stringcardvalue, String suit, int cardFaceValue) {
		this.suit = suit;
		setFace(cardFaceValue);
		suit();
		rank();
		pointValue();
	}
	
	public void setFace (int cardFaceValue) {
		face = cardFaceValue;
		pointValue = cardFaceValue;
	}

  	//accessors
		//get methods
	public String rank () {
		for (int i = 0; i < FACES.length;i++) {
			if (i==face) {
				rank = i;
				return FACES[i];
			}
		}
		return "";
	}

	public String suit () {
		return suit;
	}
	
	public int pointValue () {
		return pointValue;
	}
	
	//equals other card
	public boolean matches(Object cardcompare) {
		System.out.println(cardcompare.toString());
		System.out.println(toString());
		if (cardcompare.toString().equals(toString())) {
			return true;
		}
		return false;
	}
	
  	//toString
	public String toString() {
		String returnstring = rank() + " of " + suit + " (point value = " + pointValue + ")";
		return returnstring;
	}


}

/*
 * //(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package elevens;
import java.util.Random;
import static java.lang.System.*;

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	private int faceNum = 0;
	private String suitName = "";
	private String faceName = "";
	private String rankName = "";
	
	public Card(String suit, int face) {
		makeCard(suit,face);
		toString();
	}
//card constructor with only 2 parameters
	
	public Card(String suit, String rank, int face) {
		makeCustomCard(suit, rank, face);
	}
//card constructor with 3 parameters
	
	public void makeCustomCard(String suit, String rank, int face) {
		setFace(face);
		setSuit(suit);
		setRank(rank);
	}
//makes a card given three parameters
	
	public void makeCard(String suit, int face) {
		setFace(face);
		setSuit(suit);
		toString();
	}
//makes a card given two parameters
	
	public String setRank(String rank) {
		rankName = rank;
		return  rankName;
	}
// all the methods that set values
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
	
//tostring, obviously
	public String toString() {
		return (FACES[faceNum] + " of " + suitName + " , point value is " + faceNum );
	}
}
 
 */