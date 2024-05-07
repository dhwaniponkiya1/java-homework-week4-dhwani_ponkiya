package javaweek4;

import java.util.Scanner;

public class Program5Palindrome {
    /**
     * 5. Palindrome Number
     * Write a method called isPalindrome with one int parameter called number.
     * The method needs to return a boolean.
     * It should return true if the number is a palindrome number otherwise it should return false.
     * Check the tips below for more info about palindromes.
     * Example Input/Output
     * isPalindrome(-1221); → should return true
     * isPalindrome(707); → should return true
     * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
     * 11212.
     */

    public static boolean isPalindrome(int number) {
        boolean num;
        int lastDigit, reverse = 0, temp;
        temp = number;                                    //Assigning value to temp variable

        while (number != 0) {                                   //While loop to reverse the number
            lastDigit = number % 10;                            //getting remainder
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        if (temp == reverse) {
            num = true;
            return num;
        } else {
            num = false;
            return num;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println(isPalindrome(number));
        scanner.close();
    }
}
