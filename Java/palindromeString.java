import java.util.Scanner;

public class palindromeString {

    public static void main(String[] args) {
        String str="sushanttnahsus";
        String copy=str;
        String reverse="";
        int len=str.length();

        for (int i = len-1; i>=0; i--) {
            reverse=reverse+str.charAt(i);

        }
        if (copy.equals(reverse)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

    }
    
}
