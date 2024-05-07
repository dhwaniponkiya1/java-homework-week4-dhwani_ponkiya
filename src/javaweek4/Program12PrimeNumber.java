package javaweek4;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

public class Program12PrimeNumber {
    public static void isPrime(int number) {

        int i=2;
        boolean flag = false;
        while (i <= number / 2) {
            if (number % i == 0) {  // condition for nonprime number
                flag = true;
                break;
            }
            ++i;
        }

        if (!flag)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        scanner.close();
        isPrime(number);
    }
}
