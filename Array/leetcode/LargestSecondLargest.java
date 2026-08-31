package com.gla.arrays.Level2;
import java.util.*;
public class LargestSecondLargest {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            long number = sc.nextLong();

            int maxDigit = 10;                 // initial size
            int[] digits = new int[maxDigit];
            int index = 0;

            // Extract digits and store dynamically
            while (number > 0) {

                // Hint f modification: increase array size if full
                if (index == maxDigit) {

                    maxDigit = maxDigit + 10;          // increase size by 10
                    int[] temp = new int[maxDigit];   // create temp array

                    // copy old data
                    for (int i = 0; i < digits.length; i++) {
                        temp[i] = digits[i];
                    }

                    digits = temp;    // assign back
                }

                digits[index] = (int)(number % 10);
                index++;
                number = number / 10;
            }

            // Find largest and second largest
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < index; i++) {

                if (digits[i] > largest) {
                    secondLargest = largest;
                    largest = digits[i];
                }
                else if (digits[i] > secondLargest && digits[i] != largest) {
                    secondLargest = digits[i];
                }
            }

            System.out.println("\nLargest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);

            sc.close();
        }
    }


