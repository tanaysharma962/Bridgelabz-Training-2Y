package com.gla.arrays.Level2;
import java.util.*;
public class DigitFrequency {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            System.out.print("Enter a number: ");
            long number = sc.nextLong();

            long temp = number;


            int count = 0;
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }


            int[] digits = new int[count];
            temp = number;
            int index = 0;

            while (temp > 0) {
                digits[index] = (int)(temp % 10);
                index++;
                temp = temp / 10;
            }


            int[] frequency = new int[10];

            for (int i = 0; i < digits.length; i++) {
                frequency[digits[i]]++;
            }


            System.out.println("\nDigit Frequencies:");

            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
                }
            }

            sc.close();
        }
    }


