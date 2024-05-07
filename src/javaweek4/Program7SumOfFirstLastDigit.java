package javaweek4;

import java.util.Scanner;

/**
 * First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * Example input/output
 * * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 */

public class Program7SumOfFirstLastDigit {

    public static int sumFirstAndLastDigit(int number) {                  //Method
        int sum = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number != 0) {
                int lastDigit = number % 10;                                        //Getting last digit
                int digits = (int) Math.log10(number);                              //Finding how many times we can divide by 10
                int firstDigit = (int) (number / Math.pow(10, digits));             //Dividing number accordingly to find first digit
                sum = lastDigit + firstDigit;                                       //Sum of both numbers
                break;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println(sumFirstAndLastDigit(number));
        scanner.close();

    }
}
