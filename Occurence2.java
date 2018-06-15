package stringhandlng;

import java.util.Scanner;

public class Occurence2 {

	public static void main(String[] args) {
		Scanner sl=new Scanner(System.in);
		String word,sub;
		System.out.println("Enter a main string");
		word=sl.nextLine();
		System.out.println("Enter a sub string to check occurence");
		sub=sl.nextLine();
		sl.close();
		if(word.contains(sub)==true) //Using built in method...
			System.out.println("Substring is present in string");
		else
			System.out.println("Substring is not present in string");
	}

}

