package stringhandlng;

import java.util.Scanner;

public class CountWords {
	
	public static void main(String args[])
	{ 
                             
		System.out.println("Enter a sentence to count words present in it");
		//not null
        Scanner sl=new Scanner (System.in);
        String str=sl.nextLine();
		int count = 1;
		sl.close();
		for (int i = 0; i < str.length() - 1; i++)
		{
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) 
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in sentence = " + count);
	}

}
