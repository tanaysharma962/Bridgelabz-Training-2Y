package com.gla.arrays.Level2;
import java.util.*;
public class BMIMultiArray {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // a. Number of persons
            System.out.print("Enter number of persons: ");
            int number = sc.nextInt();

            // b. Create arrays
            double[][] personData = new double[number][3]; // weight, height, BMI
            String[] weightStatus = new String[number];

            // c. Input height & weight
            for (int i = 0; i < number; i++) {

                System.out.println("\nPerson " + (i + 1));

                // Weight
                do {
                    System.out.print("Enter weight (kg): ");
                    personData[i][0] = sc.nextDouble();
                } while (personData[i][0] <= 0);

                // Height
                do {
                    System.out.print("Enter height (meters): ");
                    personData[i][1] = sc.nextDouble();
                } while (personData[i][1] <= 0);

                // d. Calculate BMI
                personData[i][2] = personData[i][0] /
                        (personData[i][1] * personData[i][1]);

                double bmi = personData[i][2];

                // Find weight status
                if (bmi < 18.5) {
                    weightStatus[i] = "Underweight";
                } else if (bmi < 25) {
                    weightStatus[i] = "Normal";
                } else if (bmi < 30) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obese";
                }
            }

            // e. Display results
            System.out.println("\n--- Person Details ---");
            for (int i = 0; i < number; i++) {

                System.out.println("Person " + (i + 1));
                System.out.println("Weight: " + personData[i][0] + " kg");
                System.out.println("Height: " + personData[i][1] + " m");
                System.out.printf("BMI: %.2f\n", personData[i][2]);
                System.out.println("Status: " + weightStatus[i]);
                System.out.println();
            }

            sc.close();
        }
    }


