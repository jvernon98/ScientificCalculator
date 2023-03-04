package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
import java.lang.Math;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        boolean exit = false;
        double currentValue = 0.0;
        while (!exit) {
            System.out.println("Select an option:");
                System.out.println("Current value: ");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Sine");
                System.out.println("6. Cosine");
                System.out.println("7. Tangent");
                System.out.println("8. Clear Display");
                System.out.println("9. Change number on Display");
                System.out.println("0. Exit");

                int choice =scanner.nextInt();
                switch (choice) {

                    case 1:
                        System.out.println("Enter the number to add");
                        double num1 = scanner.nextDouble();
                        currentValue += num1;
                        System.out.println("Result:" + currentValue);
                        break;

                    case 2:
                        System.out.println("Enter the number to subtract: ");
                        num1 = scanner.nextDouble();
                        currentValue -= num1;
                        System.out.println("Result:" + currentValue);
                        break;

                    case 3:
                        System.out.println("Enter the number to multiply: ");
                        num1 = scanner.nextDouble();
                        currentValue *= num1;
                        System.out.println("Result:" + currentValue);
                        break;

                    case 4:
                        System.out.println("Enter the number to divide: ");
                        num1 = scanner.nextDouble();
                        if (num1 == 0.0){
                        System.out.println("Error: Division by Zero");
                        currentValue = Double.NaN;
                    } else {
                            currentValue /=num1;
                            System.out.println("Result: " + currentValue);
                    }
                        break;
                    case 5:
                        System.out.println("Enter the angle in degrees: ");
                        double angle =
                                scanner.nextDouble();
                                double sinValue =
                                        Math.sin(Math.toRadians(angle));
                                        if (Double.isNaN(sinValue)) {
                                            System.out.println("Error: Invalid Input");
                                            currentValue = Double.NaN;
                                        } else {
                                            currentValue = sinValue;
                                            System.out.println("Result: " + currentValue);
                                        }
                                            break;
                    case 6:
                        System.out.println("Enter the angle in degrees: ");
                        angle = scanner.nextDouble();
                        double cosValue =
                                Math.cos(Math.toRadians(angle));
                                if (Double.isNaN(cosValue)) {
                                    System.out.println("Error: Invalid Input");
                                    currentValue = Double.NaN;
                                } else {
                                    currentValue = cosValue;
                                    System.out.println("Result: " + currentValue);
                                } break;
                    case 7:
                        System.out.println("Enter the angle in degrees: ");
                        angle = scanner.nextDouble();
                        double tanValue =
                                Math.tan(Math.toRadians(angle));
                                if (Double.isNaN(tanValue)) {
                                    System.out.println("Error: Invalid Input");
                                    currentValue = Double.NaN;
                                } else {
                                    currentValue = tanValue;
                                    System.out.println("Result: " + currentValue);
                                } break;
                    case 8:
                        currentValue = 0.0;
                        System.out.println("Display cleared");
                        break;

                    case 9:
                        System.out.println("Enter the new number to display: ");
                        currentValue = scanner.nextDouble();
                        System.out.println("New number displayed: " + currentValue);
                        break;

                    case 0:
                        exit = true;
                        break;
                }
        }
    }
}
