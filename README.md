# Java Utility Program

## Overview
This Java application provides multiple utility functions, including payback calculation, prime number generation, and checking if a number is odd or even. The program demonstrates fundamental concepts of Java programming such as loops, conditional statements, and basic arithmetic operations.

## Features
- **Payback Calculation**: Given a payment amount and a price, calculates the change to be returned in various bill denominations.
- **Prime Number Generation**: Generates and prints prime numbers from 2 to 100.
- **Odd/Even Check**: Determines whether a given number is odd or even using the modulus operator.

## Running the Program
To run this Java utility program, follow these steps:

1. **Compile the Java Program**:
   - Ensure Java is installed on your system.
   - Navigate to the directory containing `Main.java`.
   - Compile the program using `javac Main.java`.

2. **Execute the Program**:
   - Run the compiled program with `java Main`.
   - Observe the output in the console, which will include payback calculations, a list of prime numbers, and an odd/even check (if `modulus` method is called in `main`).

## Program Structure
- The `Main` class contains the `main` method where the utility methods are called.
- The `payback` method calculates the change to be given back for a transaction.
- The prime number generator is part of the `main` method but can be refactored into a separate method for modularity.
- The `modulus` method checks if a number is odd or even.

## Note
- The payback calculation assumes the availability of $100, $50, $20, $10, $5, and $1 bills.
- The prime number generator has a hardcoded limit of 100 but can be modified to accept dynamic ranges.
- The modulus method currently checks the parity of a hardcoded number; it can be modified to accept dynamic input.

## Contribution
Contributions to enhance and improve this utility program are welcome. Whether it's optimizing the existing features, extending functionality, or fixing bugs, feel free to fork this repository and submit your improvements.

## License
Free To Use.
