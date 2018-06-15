package stringhandlng;

import java.util.Scanner;

public class ReverseString {
	
	static String reverse(String str){
        int start=0, stop,i;
        String rev = "";
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==' ' || i==str.length()-1){
                stop = i+1;
                rev = str.substring(start,stop) + rev;
                start = i+1;
                if(i!=str.length()-1)
                    rev = " " + rev;
            }
        }
        return rev;
    }
    public static void main(String args[]){
    	
    	System.out.println("Enter a string to reverse");
         Scanner sl = new Scanner(System.in);
         String str = sl.nextLine();
       // String str = "I am Sahil Singla";
        System.out.println(reverse(str));
        sl.close();
    }

}
