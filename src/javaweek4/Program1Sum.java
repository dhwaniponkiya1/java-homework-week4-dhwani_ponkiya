package javaweek4;

import java.util.Scanner;

public class Program1Sum {
    public static void main(String[] args) {
        int counter = 1, sum = 0;
        Scanner scanner = new Scanner(System.in);


        while (counter <= 10) {
            System.out.println("Enter number");
            boolean valid = scanner.hasNextInt();
            if (valid) {
                int n = scanner.nextInt();
                sum += n;
                counter++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }

        System.out.println("Sum: " + sum);
        scanner.close();

    }
}
