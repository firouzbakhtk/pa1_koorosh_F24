# Programming Assignment 1

## Logistics

In this assignment you are to write programs to solve the following problems. As with all assignments, remember the
following submission steps:

- Add Javadoc code documentation to each class and method
- Save, commit, and push all code changes
- Make sure your code passes at least all the provided JUnit tests
- Confirm the latest code is visible in the repository website (github.com)
- Submit the worksheet to me
- Upload the two screenshots to Brightspace

## Problem a (PA1a.java)

Write a program to help carpenters. Sometimes measurements are given in terms of yards, feet, and inches. Your program
will convert these three numbers into a total number of inches. When running, it will prompt the user first for the
number of yards, then the number of feet, and finally the number of inches. Assume all numbers are whole (integers).
Your program must compute the total number of inches by converting each of the three inputs into inches and summing them
all together. Finally, print out the total length in inches. Recall that 1 yard = 3 feet, and 1 foot = 12 inches.

The following represents a sample run of the program.

The user is first prompted for the number of yards:

    Enter number of yards: 

At this point, the user inputs "1" and hits enter:

    Enter number of yards: 1

Then, the user is prompted for the number of feet:

    Enter number of yards: 

and the user inputs "2" and hits enter:

    Enter number of yards: 2

Lastly, the user is prompted for the number of inches to which the user inputs "3":

    Enter number of inches: 3

Afterwards, the program outputs 63 total inches.

    Total number of inches: 63

At the end of the program, use should get this output:

    Enter number of yards: 1
    Enter number of feet: 2
    Enter number of inches: 3
    Total number of inches: 63

To make sure you wrote the program correctly, there will be JUnit test cases provided. Consult the slides for more
details.

Note that the JUnit tests, will be *very picky* about exact spacing, spelling, and capitalization (i.e. an extra space
fails the test).

First add "Javadoc" documentation to all your code. Once you verify all code works, commit PA1a.java with the message
"Completed Part A" or similar.

## Problem b (PA1b.java)

Write a program to do the reverse of Problem a. It prompts the user for a length in inches, then converts that total
number of inches into yards, feet, and inches. Note that you do not convert the number of inches separately into yards,
then feet, then inches.  Instead, the program must calculate how many yards there are in the given number of inches,
then convert the remaining inches into feet, and finally have the left over inches directly. For example, if the user
enters 50 for the total number of inches, your program should compute that that is equal to 1 yard, 1 foot, and 2
inches.

The following represents a run of the program using this sample input (again, pay very careful attention to spacing,
spelling, and capitalization).

    Enter number of inches: 50
    Yards: 1
    Feet: 1
    Inches: 2

