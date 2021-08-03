package com.srihita.prework;

import java.util.Scanner;

public class Assessment {
    public static void main(String[] args) {
        Assessment assessmentObj = new Assessment();
        int choice;
        Scanner scanInput = new Scanner(System.in);
        do {
            System.out.println("Enter your choice from below list.\n"
                    + "1. Find palindrome of number.\n"
                    + "2. Print Pattern for a given no.\n"
                    + "3. Check whether the no is a  prime number.\n"
                    + "4. Print Fibonacci series.\n"
                    + "--> Enter 0 to Exit.\n");
            System.out.println();
            choice = scanInput.nextInt();
            switch (choice) {
                case 0:
                    choice = 0;
                    break;
                case 1: {
                    System.out.println("Please enter a number");
                    String inputNumber = scanInput.next();
                    assessmentObj.checkPalindrome(inputNumber);
                }
                break;
                case 2: {
                    System.out.println("Please enter a number");
                    int inputNumber = scanInput.nextInt();
                    assessmentObj.printPattern(inputNumber);
                }
                break;
                case 3: {
                    System.out.println("Please enter a number");
                    int inputNumber = scanInput.nextInt();
                    assessmentObj.checkPrimeNumber(inputNumber);
                }
                break;
                case 4: {
                    System.out.println("Please enter a number");
                    int inputNumber = scanInput.nextInt();
                    assessmentObj.printFibonacciSeries(inputNumber);
                }
                break;
                default:
                    System.out.println("Invalid choice. Enter a number from choices below\n");
            }

        } while (choice != 0);
        System.out.println("Exited Successfully!!!");
        scanInput.close();
    }

    public void checkPalindrome(String inputNumber) {
        char[] charArray = inputNumber.toCharArray();
        String reverseNumber = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reverseNumber = reverseNumber + charArray[i];
        }
        if (reverseNumber.equals(inputNumber)) {
            System.out.println(inputNumber + " is a Palindrome");
        } else {
            System.out.println(inputNumber + " is NOT a Palindrome");
        }
    }

    public void printPattern(int starCount) {
        for (int j = starCount; j >= 1; j--) {
            String starLine = "";
            for (int i = 1; i <= j; i++) {
                starLine = starLine + "*";
            }
            System.out.println(starLine);
        }
    }

    public void checkPrimeNumber(int inputNumber) {
        boolean isPrimenumber = true;
        for (int i = 2; i < inputNumber; i++) {
            if (inputNumber % i == 0) {
                System.out.println(inputNumber + " is not a prime number");
                isPrimenumber = false;
                break;
            }
        }
        if (isPrimenumber) {
            System.out.println(inputNumber + " is a prime number");
        }
    }

    public void printFibonacciSeries(int inputNumber) {
        int first = 0;
        int second = 1;
        int sum;
        int counter = 0;
        String output = "0,1";
        while (counter < inputNumber) {
            sum = first + second;
            output = output + "," + sum;
            first = second;
            second = sum;
            counter++;
        }
        System.out.println("Fibonacci series is " + output);
    }
}
