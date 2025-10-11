package ex2;
import java.util.Scanner;

public class exercise2 {

    //check to see ifstring is a palindrome using recursion
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        else
            return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String s = sc.nextLine();

        if (isPalindrome(s))
            System.out.println(s + " is a palindrome.");
        else
            System.out.println(s + " is not a palindrome.");

        sc.close();
    }
}
