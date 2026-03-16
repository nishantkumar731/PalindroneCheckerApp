#PalindroneCheckerApp
/Palindrome Checker App – UC11
Objective

The objective of the Palindrome Checker App (UC11) is to implement a palindrome validation system using Object-Oriented Programming (OOP) principles in Java. In this use case, the palindrome checking logic is encapsulated inside a dedicated class, making the program more modular, reusable, and easier to maintain.

Running Procedure

Follow the steps below to compile and run the program:

Save the program file as UseCase11PalindromeCheckerApp.java.

Open Command Prompt / Terminal.

Navigate to the directory where the file is stored.

Compile the program using the following command:

javac UseCase11PalindromeCheckerApp.java

Run the program using:

java UseCase11PalindromeCheckerApp

Enter a string when prompted.

The program will display whether the given string is Palindrome or Not a Palindrome.

Flow of the Project

The program starts and prompts the user to enter a string.

A PalindromeChecker class is created to handle palindrome validation.

The main program creates an object of the PalindromeChecker class.

The checkPalindrome() method is called using the object.

The method processes the string by normalizing it (removing spaces and converting to lowercase).

Characters from the start and end of the string are compared.

If all characters match, the string is declared a Palindrome; otherwise, it is Not a Palindrome.

Topics Covered

This project covers the following programming concepts:

Java Programming Fundamentals

Object-Oriented Programming (OOP)

Encapsulation

Single Responsibility Principle

Class and Object Creation

Method Design and Reusability

String Processing

Palindrome Checking Algorithm

Use Case Covered
UC11 – Object-Oriented Palindrome Service

This use case demonstrates how palindrome logic can be encapsulated inside a dedicated service class. The class exposes a method called checkPalindrome() that can be reused by other parts of the program. This approach improves code organization and follows the Single Responsibility Principle.

Data Structure Used:
Internal structures such as Array or Stack may be used inside the service class for palindrome checking.

Conclusion

The Object-Oriented Palindrome Service demonstrates how OOP principles can be applied to structure a program effectively. By separating the palindrome logic into a dedicated class, the code becomes more modular, reusable, and maintainable, which is an important practice in professional software development.