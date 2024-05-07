package javaweek4;

import java.util.Scanner;

public class Program4SumOfDigit {

    public static int sumDigits(int number) {
        int sum = 0;
        int length = String.valueOf(number).length();
        if (length == 1)
            return -1;
        else {
            while(number>0){

                int digit = number % 10;
                sum += digit;
                number = number / 10;
            }
            return sum;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(sumDigits(number));
    }
}
