# PalindroneCheckerApp
//running procedure
//flow of project
//objective
//what are topics its will be covered
//which usecase

1Palindrome Checker App – UC10
Objective

The objective of the Palindrome Checker App (UC10) is to design and implement a console-based Java program that checks whether a given string is a palindrome while ignoring spaces and letter case. This use case demonstrates the importance of string preprocessing techniques such as normalization and the use of regular expressions before applying palindrome logic.

Running Procedure

Follow the steps below to compile and run the program:

Save the program file as UseCase10PalindromeCheckerApp.java.

Open Command Prompt / Terminal.

Navigate to the folder where the file is stored.

Compile the program using the following command:

javac UseCase10PalindromeCheckerApp.java

Run the program using:

java UseCase10PalindromeCheckerApp

Enter a string when prompted.

The program will display whether the string is Palindrome or Not a Palindrome.

Flow of the Project

The program starts and asks the user to enter a string.

The input string is normalized by:

Removing spaces using regular expressions.

Converting all characters to lowercase.

Two pointers are used to compare characters from the beginning and end of the string.

If the characters match, the pointers move toward the center.

If any mismatch occurs, the string is declared Not a Palindrome.

If all characters match, the string is declared a Palindrome.

Topics Covered

This project covers the following programming concepts:

Java Programming Basics

String Processing in Java

Case-Insensitive String Comparison

Regular Expressions in Java

Two-Pointer Technique

Palindrome Checking Logic

Console-Based User Input

Use Case Covered
UC10 – Case-Insensitive & Space-Ignored Palindrome Checker

This use case checks whether a string is a palindrome by ignoring spaces and letter case differences. The program first preprocesses the string using regular expressions and string normalization, and then applies palindrome checking logic.

Data Structure Used:
String / Character Array

Conclusion

The Case-Insensitive and Space-Ignored Palindrome Checker demonstrates how string preprocessing techniques can improve algorithm accuracy. By removing unnecessary characters and standardizing the input format, the program ensures reliable palindrome validation for real-world text inputs.