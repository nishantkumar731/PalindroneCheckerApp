#PalindroneCheckerApp
/Palindrome Checker App – UC12
Objective

The objective of Use Case 12 (UC12) is to implement a flexible palindrome checking system using the Strategy Design Pattern in Java. This approach allows different palindrome algorithms to be selected dynamically at runtime. It improves the modularity, scalability, and maintainability of the application by separating the algorithm implementations from the main application logic.

Running Procedure

Follow these steps to compile and run the program:

Save the program file as UseCase12PalindromeCheckerApp.java.

Open Command Prompt / Terminal.

Navigate to the directory where the file is saved.

Compile the program using the command:

javac UseCase12PalindromeCheckerApp.java

Run the program using:

java UseCase12PalindromeCheckerApp

Select the palindrome strategy when prompted.

Enter the string to check whether it is a palindrome.

The program will display the result.

Flow of the Project

The program starts and displays available palindrome strategies.

The user selects a strategy (Stack or Deque).

The program asks the user to enter a string.

A PalindromeStrategy interface defines a common method checkPalindrome().

Different classes implement this interface:

StackStrategy

DequeStrategy

Based on the user’s choice, the selected strategy is injected at runtime.

The chosen algorithm processes the string and checks whether it is a palindrome.

The result is displayed to the user.

Topics Covered

This project demonstrates the following programming concepts:

Java Programming Fundamentals

Object-Oriented Programming (OOP)

Interface Implementation

Polymorphism

Strategy Design Pattern

Dynamic Algorithm Selection

Stack Data Structure

Deque Data Structure

Use Case Covered
UC12 – Strategy Pattern for Palindrome Algorithms

This use case demonstrates how multiple palindrome checking algorithms can be implemented using the Strategy Design Pattern. Each algorithm is implemented as a separate strategy class that follows a common interface. The program selects and executes the appropriate algorithm dynamically at runtime.

Strategies Implemented:

Stack Strategy – Uses a stack to reverse characters and compare.

Deque Strategy – Uses a double-ended queue to compare characters from both ends.

Data Structure Used:
Varies depending on the selected strategy (Stack or Deque).

Conclusion

The Strategy Pattern based Palindrome Checker demonstrates how software design patterns can improve flexibility and maintainability. By separating algorithms into individual strategy classes, the program allows easy addition of new palindrome checking methods without modifying the core application logic.