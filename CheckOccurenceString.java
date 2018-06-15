package stringhandlng;

import java.util.Scanner;

public class CheckOccurenceString {
	
	public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.println("Enter a String ");
        String s1 = sl.nextLine();
        System.out.println("Enter a second String to check occurrence ");
        String s2 = sl.nextLine();

    char str[]=s1.toCharArray();
    char search[]=s2.toCharArray();
    sl.close();

    int count1=s1.length();
    int count2=s2.length();
    int i=0;
    int j=0;
    int flag=0;
   for (i = 0; i <= count1 - count2; i++)
    {
        for (j = i; j < i + count2; j++)
        {
            flag = 1;
            if (str[j] != search[j - i])
            {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
            break;
    }
    if (flag == 1)
     System.out.println("Yes string is present");
    else
       System.out.println("No string is not present");
    }

	

}
