package Unit0;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew Tian
//Date - 2/2/2020
//Class - AP CSA
//Lab  -

public class AsciiBox
{
	public static void main(String[] args)
	{
		System.out.println("Andrew Tian \t  1/30/2020 \n\n" );
		String str1 = "+++++++++++++++++++++++++";
		String str2 = "AAAAAAAAAAAAAAAAAAAAAAAAA";
		for (int i = 0; i <= 6; i++) {
			//String Repeat works like this within Java 11, check if this is indeed Java 11, if not just use the more classic method
			if (i % 2 == 0) {
				System.out.println(str1);
				System.out.println(str1);
				System.out.println(str1);
			}
			else {
				System.out.println(str2);
				System.out.println(str2);
			}
			
			
		}

	}
}