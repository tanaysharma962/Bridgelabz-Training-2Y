package com.gla.arrays.Level2;
import java.util.*;
public class FriendsInfo {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String[] names = {"Amar", "Akbar", "Anthony"};
            int[] age = new int[3];
            float[] height = new float[3];

            // Taking input
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter age of " + names[i] + ": ");
                age[i] = sc.nextInt();

                System.out.print("Enter height of " + names[i] + ": ");
                height[i] = sc.nextFloat();
            }

            // Assume first friend is youngest and tallest initially
            int youngestIndex = 0;
            int tallestIndex = 0;

            // Finding youngest and tallest
            for (int i = 1; i < 3; i++) {

                if (age[i] < age[youngestIndex]) {
                    youngestIndex = i;
                }

                if (height[i] > height[tallestIndex]) {
                    tallestIndex = i;
                }
            }

            // Displaying result
            System.out.println("\nYoungest friend: " + names[youngestIndex]);
            System.out.println("Tallest friend: " + names[tallestIndex]);

            sc.close();
        }
    }

