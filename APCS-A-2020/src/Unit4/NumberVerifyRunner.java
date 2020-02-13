package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew Tian
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		System.out.println("115 is odd :: " + NumberVerify.isOdd(115));
		System.out.println("115 is even :: " + NumberVerify.isEven(115));
		
		System.out.println("22 is odd :: " + NumberVerify.isOdd(22));
		System.out.println("22 is even :: " + NumberVerify.isEven(22));
		
		System.out.println("0 is odd :: " + NumberVerify.isOdd(0));
		System.out.println("0 is even :: " + NumberVerify.isEven(0));
		
		/*
		 * 5 is odd :: true
		5 is even :: false
		115 is odd :: true
		115 is even :: false
		22 is odd :: false
		22 is even :: true
		0 is odd :: false
		0 is even :: true
		 */
	}
}