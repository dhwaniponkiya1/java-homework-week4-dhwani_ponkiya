package javaweek4;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class Program8TrianglePattern {

    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {              //Nested for loops
            for (int j = 1; j <= i; j++) {          //Print colume
                System.out.print("@ ");
            }
            System.out.println(" ");                //Print to new line
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        scanner.close();
        triangle(number);
    }
}
