package com.gla.arrays.Level1;
import java.util.*;
public class FizzBuzzArray {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a positive number: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            // Create String array
            String[] result = new String[n];

            // Store values
            for (int i = 1; i <= n; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    result[i - 1] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    result[i - 1] = "Fizz";
                } else if (i % 5 == 0) {
                    result[i - 1] = "Buzz";
                } else {
                    result[i - 1] = String.valueOf(i);
                }
            }

            // Display results
            System.out.println("\nResults:");
            for (int i = 0; i < n; i++) {
                System.out.println("Position " + (i + 1) + " = " + result[i]);
            }

            sc.close();
        }
    }


