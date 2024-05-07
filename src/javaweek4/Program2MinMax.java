package javaweek4;

import java.util.Scanner;

public class Program2MinMax {

    public static void main(String[] args) {

        int num = 0;
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do {
            System.out.println("Type a number");

            num = sc.nextInt();
//            boolean isNumber = sc.hasNextInt();

            if(num == -1) {
                break;
            }

            if (num < min){
                min = num;
            }

            if(num > max){
                max = num;
            }
        } while (true);

        System.out.println("maximum was : " + max);
        System.out.println("minimum was : " + min);

    }

}
