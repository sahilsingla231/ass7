package stringhandlng;

import java.util.Scanner;


public class VowelsRemove {

    public static void main(String a[]) {
       System.out.println("Enter a string to remove vowels");
       Scanner sl = new Scanner(System.in);
       String str = sl.nextLine();
                 
       removevowels(str);
       sl.close();
 }
 static void removevowels(String st) {
	 			char ch;
	 			String text="";
                 for(int i=0;i<st.length();i++)
                { ch=st.charAt(i);
                  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                continue;
                  text+=ch;
                }
      System.out.println(text);
                 
 }
	
}
