//Internship 1 task is  to create a program that can calculate with the Numbers.
//Simple or Advance program and it is based on console base program in Java
// The program should be able to perform addition, subtraction, multiplication and division of two or multiple numbers.
//simple program written by Mr. Avanish Vishwakarma

import java.util.Scanner;

public class Main {
    public static double calculate(String input) {
        String[] temp = input.split(" ");
        double result = Double.parseDouble(temp[0]);

        for (int i = 1; i < temp.length; i += 2) {
            String operator = temp[i];
            double value = Double.parseDouble(temp[i + 1]);

            switch (operator) {
                case "+":
                    result = result + value;
                    break;
                case "-":
                    result = result - value;
                    break;
                case "*":
                    result = result * value;
                    break;
                case "/":
                    if (value != 0) {
                        result = result / value;
                    } else {
                        System.out.println("Error! Division by zero.");
                    }
                    break;
                default:
                    System.out.println("Operator Error! : " + operator);
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Advanced Console BAsed Calculator");

        while (true) {
            System.out.println("Enter Your Input (e.g. ,  2 + 4 - 5 * 6), or 'Exit'");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Program...");
                break;

            } else {
                try {
                    double result = calculate(input);
                    System.out.println("Result : " + result);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Invalid Input . Please try again. ");
                }
            }

        }

    }
}