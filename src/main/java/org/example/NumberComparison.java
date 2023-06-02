package org.example;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int userInt1 = getUserInput();
        System.out.println("Enter another number:");
        int userInt2 = getUserInput();
        System.out.println(numberComparison(userInt1, userInt2));
    }
    public static String numberComparison(int num1, int num2){
        if (num1 == num2){
            return "Numbers are the same";
        } else if (num1 > num2) {
            return "The first number was larger than the second";
        } else if (num2 > num1) {
            return "The second number was larger than the first";
        } else {
            return "Error";
        }
    }
    public static int getUserInput(){
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        return num;
    }
}