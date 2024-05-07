package javaweek4;

import java.util.Scanner;

public class Program3VowelConsonant {
    static int length;

    public static void isVowelOrConsonant(String s) {
        boolean uppercase = s.charAt(0) >= 65 && s.charAt(0) <= 90;
        boolean lowercase = s.charAt(0) >= 97 && s.charAt(0) <= 122;


        if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u") || s.equals("A") || s.equals("E") || s.equals("I")
                || s.equals("O") || s.equals("U"))
            System.out.println("It is a Vowel.");
        else if(s.length() > 1)
            System.out.println("Not a single character");
        else if(!(uppercase || lowercase))
            System.out.println("Not a letter");
        else
            System.out.println("It is a Consonant.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        String s = sc.next();
        isVowelOrConsonant(s);
    }
}
