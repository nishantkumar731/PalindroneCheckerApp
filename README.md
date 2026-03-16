#PalindroneCheckerApp
/Palindrome Checker App – UC13
Objective

The objective of Use Case 13 (UC13) is to compare the performance of different palindrome checking algorithms implemented in the Palindrome Checker App. This use case demonstrates how multiple algorithms can be executed and analyzed by measuring their execution time. It helps in understanding which approach performs better under similar conditions.

Running Procedure

Follow the steps below to compile and run the program:

Save the program file as UseCase13PalindromeCheckerApp.java.

Open Command Prompt / Terminal.

Navigate to the directory where the file is stored.

Compile the program using the following command:

javac UseCase13PalindromeCheckerApp.java

Run the program using:

java UseCase13PalindromeCheckerApp

Enter a string when prompted.

The program will execute multiple palindrome algorithms and display their execution times.

Flow of the Project

The program prompts the user to enter a string.

The input string is normalized by removing spaces and converting it to lowercase.

Multiple palindrome checking algorithms are executed sequentially.

For each algorithm:

The start time is captured using System.nanoTime().

The palindrome logic is executed.

The end time is captured using System.nanoTime().

The difference between start and end times is calculated to determine execution time.

The results and performance metrics of each algorithm are displayed.

Topics Covered

This use case demonstrates several important programming concepts:

Java Programming Fundamentals

Algorithm Performance Measurement

System.nanoTime() Method

Palindrome Checking Algorithms

Stack Data Structure

Deque Data Structure

Two-Pointer Technique

Algorithm Comparison

Use Case Covered
UC13 – Performance Comparison

This use case compares the efficiency of different palindrome checking methods by measuring their execution time. It allows developers to analyze the performance differences between algorithms and understand how data structures impact execution speed.

Algorithms Compared:

Two Pointer Method

Stack-Based Method

Deque-Based Method

Conclusion

The Performance Comparison use case highlights how different algorithms can be evaluated using execution time measurements. It provides insight into the efficiency of each approach and helps developers choose the most suitable algorithm for palindrome checking in real-world applications.