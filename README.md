# TASK1SIMPLECALCULATORJAVAPROGRAMM
# Internship 1 task is  to create a program that can calculate with the Numbers.
# Simple or Advance program and it is based on console base program in Java
# The program should be able to perform addition, subtraction, multiplication and division of two or multiple numbers.
# simple program written by Mr. Avanish Vishwakarma
<hr>

#  ** Code of Explanation ** 

This Java program is a console-based calculator that performs basic arithmetic operations (addition, subtraction, multiplication, and division) on numbers provided by the user. Let's go through the explanation of the code:
# Steps 
1. The calculate method takes a string input as its parameter, representing the arithmetic expression entered by the user. It splits the input string into tokens using space as the delimiter.

2. The method initializes the result variable with the value of the first number in the input string, which is obtained by parsing the first token as a double.

3. It then iterates through the remaining tokens of the input string, performing the specified arithmetic operation with the next number and updating the result accordingly.

4. If the operator is division (/), it checks if the divisor is not zero before performing the division operation. If the divisor is zero, it prints an error message indicating division by zero.

5. The main method is the entry point of the program. It initializes a Scanner object to read input from the console.

6. Inside the main method, there is a loop that continues to prompt the user for input until the user enters "exit".

7. Within the loop, the program reads the user input, calls the calculate method to evaluate the expression, and prints the result.

8. If an exception occurs during the calculation (e.g., invalid input or division by zero), it catches the exception, prints an error message, and prompts the user to try again.

9. If the user enters "exit", the program exits the loop and terminates.

