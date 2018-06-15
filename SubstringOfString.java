package stringhandlng;

//import java.util.Scanner;

public class SubstringOfString {
	
    static void substrings(String str){
    	int i,j;
        int n = str.length();
        for(i=1;i<=n;i++)
            for(j=0;j<n-i+1;j++)
                System.out.println(str.substring(j,j+i));
    }
    public static void main(String args[]){
    	
    	
    	//System.out.println("Enter a string to find all substrings");
        //Scanner sl = new Scanner(System.in);
        //String str = sl.nextLine();
        
    	String str = "xyz";
        substrings(str);
        //sl.close();
    }

}
