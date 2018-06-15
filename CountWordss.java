package stringhandlng;

public class CountWordss {
    static int wordsNumber(String str){
        int count=0;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)==' ' || i==str.length()-1)
                count++;
        return count;
    }
    public static void main(String args[]){
        String str = "i am sahil";
        System.out.println(wordsNumber(str));
    }

}
