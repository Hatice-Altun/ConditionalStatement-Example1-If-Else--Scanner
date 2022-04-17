package novi.basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a code to get a number from the user and print whether it is positive or negative
        // Test Data - Input number: 35
        // Expected output: Number is positive.

        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int input = in.nextInt();

        if (input > 0) {
            System.out.println("Number is positive!");
        }
        else if (input < 0) {
            System.out.println("Number is negative!");
        }
        else
        {
            System.out.println("Number is 0");
        }
    }
}
