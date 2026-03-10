# PalindroneCheckerApp
//running procedure
//flow of project
//objective
//what are topics its will be covered
//which usecase

1.Objective

The objective of this use case is to develop a console-based Java application that checks whether a given string is a palindrome by using both Queue and Stack data structures.
This implementation helps demonstrate the difference between FIFO (First In First Out) and LIFO (Last In First Out) operations while validating palindrome logic.

2.Running Procedure

Save the Java file as
UseCase6PalindromeCheckerApp.java

Open Command Prompt / Terminal in the project directory.

Compile the program using:

javac UseCase6PalindromeCheckerApp.java

Run the program using:

java UseCase6PalindromeCheckerApp

Enter a string when prompted, and the program will display whether the string is a Palindrome or Not.

3.Flow of the Project

The program asks the user to enter a string.

Each character of the string is:

Enqueued into a Queue (FIFO)

Pushed into a Stack (LIFO)

The program then:

Dequeues a character from the Queue

Pops a character from the Stack

Both characters are compared.

If all characters match during the comparison, the string is a Palindrome.

If any mismatch occurs, the string is Not a Palindrome.

Topics Covered

This project covers the following programming and data structure concepts:

Java Programming Basics

Console Input and Output

String Handling

Data Structures

Stack (LIFO Principle)

Queue (FIFO Principle)

Push Operation

Pop Operation

Enqueue Operation

Dequeue Operation

Conditional Statements (if-else)

Loops (for loop)

Use Case Implemented
UC6: Queue + Stack Based Palindrome Check

4.Goal:
To demonstrate the difference between Stack (LIFO) and Queue (FIFO) while checking if a string is a palindrome.

Process:

Enqueue characters into a Queue.

Push characters into a Stack.

Compare dequeue (queue) output with pop (stack) output.

If both outputs match for all characters, the string is a Palindrome.

5.Data Structures Used:

Queue

Stack