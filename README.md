# Java Fundamentals

This repo contains the Java Fundamentals work for Java 401

## Problem Domain

### Lab 1: Java Primitives and Control Flow
This lab is dedicated to practicing Java fundamentals. These problems will challenge your understanding of Java’s built-in primitive values (ints, floats, doubles, booleans), Strings, for loops, while loops, if statements, functions, parameters and return statements. 

Write a function called pluralize that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

Write a function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.

Write a method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes. Zero-pad single digit numbers as strings so the timestamp is always the same number of characters.

Upgrade the command line clock to show how fast the program is processing itself between time updates. Display the speed in hertz, kilohertz, megahertz, or gigahertz (Hz, kHz, MHz, GHz). A hertz is defined as “one cycle per second.” A computer that executes one operation per second is a 1 Hz computer.

### Lab 2: Arrays, Loops, Imports, ArrayLists
This lab is dedicated to creating, interacting with and manipulating arrays in Java. Arrays in Java have a fixed size. Arrays are created with a certain size and they never shrink or grow. Java arrays are typed. You can have an array of integers, or an array of strings, but not an array mixed with integers and strings.

Write a method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

Write a method called containsDuplicates that returns true or false depending on whether the array contains duplicate values.

Write a method that accepts an array of integers and calculates and returns the average of all the values in the array.

Given an array of arrays calculate the average value for each array and return the array with the lowest average.

### Lab 3: Maps, File I/O, and Testing
Use the October Seattle weather data above. Iterate through all of the data to find the min and max values. Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String.

Write a function called tally that accepts a List of Strings representing votes and returns one string to show what got the most votes.

Write a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

Read through the file line by line. Create a string that contains a message such as "Line 3: Missing semicolon." if a line is missing a semicolon.

Don’t show an error if the line is empty.
Don’t show an error if the line ends with an opening curly brace {
Don’t show an error if the line ends with an closing curly brace }
Don’t show an error if the line contains if or else

Implement another simple lint rule to the linter. (For example, make sure that the file uses only single quotes, not double quotes.)

Allow the user to specify the file to lint from the command line when they run the application. (Gradle allows passing command line args through to the app with a flag.)

### Lab 6: Composition and Inheritance, Part 1
1) Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs). Implement a Restaurant constructor. Test that your Restaurant constructor is behaving reasonably. Implement a reasonable toString method for Restaurants. Write a test to create an instance of Restaurant and ensure that its toString is working properly.

2) Create a class to represent a Review. Each Review should have a body, an author, and a number of stars. Write a Review constructor. Test that your constructor is working reasonably. Implement a reasonable toString method for Reviews. Write a test to create an instance of Review and ensure that its toString is working properly.

3) A Review should be about a single Restaurant. Choose an implementation for this, and implement it. Some considerations: Should a Review know which Restaurant it is about? Should a Restaurant know which Reviews are about it? Is a Restaurant a special type of Review? Is a Review a special type of Restaurant? Is there common functionality that unites them? Update your toString and constructor methods appropriately, and also update your testing code to test this new functionality.

4) Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant. The specific methodology for this will vary, depending on the implementation you chose above. Add tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.

5)When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately, and add tests. (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)

* Some Restaurants are part of a chain, and it would be nice to capture, for example, that all of the McDonald’s locations are McDonaldses. Choose an implementation for this, and implement it. Add tests for this functionality.
* Add an updateStars method to the Review class. This method should update the stars for that review, and, if the review is associated with a restaurant, also update the number of stars for that restaurant.
* Refactor: keeping track of stars for restaurants is getting complicated. Get rid of that instance variable, and instead make this an instance method that calculates a restaurant’s star rating on the fly when it’s called.
* Create another class for a User, so that we know which reviews were written by the same User. Ensure that a single User can’t submit multiple Reviews for the same Restaurant.

### Lab 7: Composition and Inheritance, Part 2
Our website, Zelp, is growing like crazy! Users are no longer satisfied with only reviewing restaurants: they also want to review shops, movie theaters, and museums. In today’s lab, you’ll create classes and interfaces to allow reviewing non-restaurant things, while ensuring some common functionality.

1) The users want shops! Create a Shop class; a Shop should have a name, description, and number of dollar signs. Implement a constructor for a Shop. Implement a reasonable toString method for Shops. Add tests for the basics of your Shop class.
2) The users also want to review shops! It would be great if a Review could be about either a Shop or a Restaurant. Choose an implementation, and make this possible. Ensure that your Shop class has an instance method to add a review about that shop, and that it works just as well as the Restaurant instance method with the same purpose. Write tests for this functionality.
3) The users want theaters! Create a Theater class; a Theater should have a name and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.) Implement a constructor for a Theater. Write addMovie and removeMovie instance methods that allow the theater to update which movies are being shown. Implement a reasonable toString method for Theaters. Test your Theater functionality.
4) Review all the things! Ensure that your Theater is just as reviewable as your Restaurant and your Shop. Test this functionality.
5) Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a Theater, they also want to specify which movie they saw. Some reviews should now have a String movie instance variable, to hold which movie that reviewer is referencing. Make sure that someone reviewing a Restaurant or a Shop doesn’t have to include which movie they saw! It’s also okay if someone doesn’t want to include the movie they saw when they’re reviewing a theater (maybe they just went in for the popcorn). Add testing for any new functionality you’ve created.

* Add an updateStars method to the Review class. This method should update the stars for that review, and, if the review is associated with a restaurant (or other reviewable thing!), also update the number of stars for that reviewable thing.
* Refactor: keeping track of stars is getting complicated. Get rid of that instance variable, and instead make this an instance method that calculates a reviewable’s star rating on the fly when that instance method is called.
* Create another class for a User, so that we know which reviews were written by the same User. Ensure that a single User can’t submit multiple Reviews for the same reviewable.

### Project Organization
├── .idea
├── .vscode
|   └──launch.json
├── basiclibrary
|   ├── .gradle
|   ├── .idea
|   ├── .settings
|   ├── bin
|   ├── build
|   ├── gradle
|   └── src
|       ├── main
|       |    └── java
|       |        └── basiclibrary
|       |            ├── library.java
|       |            └── linter.java
|       └── test
├── basics
|   ├── Basics.class
|   └── Basics.java
├── inheritance
|   ├── .gradle
|   ├── .idea
|   ├── .settings
|   ├── bin
|   ├── build
|   ├── gradle
|   └── src
├── .gitignore
└── README.md

## Code style
Code style is Java

## Tests
Tests can be found in the src/test directories.

## Credits
* Code Fellows Java 401 class repo and instructional team

## License
MIT © Code Fellows
![CF](https://i.imgur.com/7v5ASc8.png)
