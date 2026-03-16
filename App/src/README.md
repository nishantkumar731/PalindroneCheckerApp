Palindrome Checker App – UC9
Objective

The objective of the Palindrome Checker App (UC9) is to design and implement a console-based Java program that checks whether a given string is a palindrome using recursion. This use case helps in understanding how recursive functions work by repeatedly comparing characters from the beginning and end of the string until a base condition is reached.

Running Procedure

Follow these steps to compile and run the program:

Save the file as UseCase9PalindromeCheckerApp.java.

Open Command Prompt / Terminal.

Navigate to the directory where the file is stored.

Compile the program using the following command:

javac UseCase9PalindromeCheckerApp.java

Run the program using:

java UseCase9PalindromeCheckerApp

Enter a string when prompted.

The program will display whether the string is a Palindrome or Not a Palindrome.

Flow of the Project

The program starts and prompts the user to enter a string.

The input string is processed by removing spaces and converting it to lowercase.

A recursive function is called with the start index and end index of the string.

The function compares the characters at the start and end positions.

If they match, the function calls itself with updated indices (start + 1, end - 1).

The recursion continues until the base condition is reached.

If all characters match, the string is declared a Palindrome; otherwise, it is Not a Palindrome.

Topics Covered

This project covers the following programming concepts:

Java Programming Fundamentals

String Handling in Java

Recursion in Java

Base Condition in Recursive Functions

Call Stack Concept

Palindrome Checking Logic

Console-Based User Input

Use Case Covered
UC9 – Recursive Palindrome Checker

This use case checks whether a string is a palindrome using a recursive method. The function compares characters from the start and end of the string and repeatedly calls itself until the base condition is reached.

Data Structure Used:
Call Stack (used internally during recursion)

Conclusion

The Recursive Palindrome Checker demonstrates how recursion can be used to solve problems by breaking them into smaller subproblems. It also helps in understanding the role of the call stack, base conditions, and recursive logic in algorithm design.