package com.gla.arrays.Level2;
import java.util.*;
public class StudentMarks {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            System.out.print("Enter number of students: ");
            int number = sc.nextInt();


            double[][] studentMarks = new double[number][3]; // Physics, Chemistry, Maths
            double[] percentage = new double[number];
            String[] grade = new String[number];


            for (int i = 0; i < number; i++) {

                System.out.println("\nStudent " + (i + 1));


                do {
                    System.out.print("Enter Physics marks: ");
                    studentMarks[i][0] = sc.nextDouble();
                } while (studentMarks[i][0] < 0 || studentMarks[i][0] > 100);

                do {
                    System.out.print("Enter Chemistry marks: ");
                    studentMarks[i][1] = sc.nextDouble();
                } while (studentMarks[i][1] < 0 || studentMarks[i][1] > 100);


                do {
                    System.out.print("Enter Maths marks: ");
                    studentMarks[i][2] = sc.nextDouble();
                } while (studentMarks[i][2] < 0 || studentMarks[i][2] > 100);


                percentage[i] = (studentMarks[i][0] +
                        studentMarks[i][1] +
                        studentMarks[i][2]) / 3;


                if (percentage[i] >= 90) {
                    grade[i] = "A";
                } else if (percentage[i] >= 75) {
                    grade[i] = "B";
                } else if (percentage[i] >= 60) {
                    grade[i] = "C";
                } else if (percentage[i] >= 40) {
                    grade[i] = "D";
                } else {
                    grade[i] = "Fail";
                }
            }


            System.out.println("\n--- Student Results ---");
            for (int i = 0; i < number; i++) {

                System.out.println("Student " + (i + 1));
                System.out.println("Physics: " + studentMarks[i][0]);
                System.out.println("Chemistry: " + studentMarks[i][1]);
                System.out.println("Maths: " + studentMarks[i][2]);
                System.out.printf("Percentage: %.2f%%\n", percentage[i]);
                System.out.println("Grade: " + grade[i]);
                System.out.println();
            }

            sc.close();
        }
    }
