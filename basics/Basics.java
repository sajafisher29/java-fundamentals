import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

//Lab 1 Java Primitives and Control Flow for Java 401
// Used resources https://docs.oracle.com/javase/8/docs/api/java/util/Random.html and https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
//Focus on Java’s built-in primitive values (ints, floats, doubles, Strings, booleans), for loops, while loops, if statements, functions, parameters and return statements

public class Basics {

  public static void main(String[] args) {
    System.out.println(pluralize("dog", 3));
    System.out.println(flipNHeads(4));
    clock();
  }

  //Write a function called pluralize that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

  public static String pluralize(String word, int number) {
    if (number == 0 || number > 1) {
      return word + "s";
    } else {
      return word;
      }
  }

  //Write a function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.
  
  public static String flipNHeads(int number) {
    Random random = new Random();
    int count = 0;
    int flips = 0;
    do {
      double randomNumber = random.nextDouble();
      if (randomNumber > 0 && randomNumber < .5) {
      System.out.println("tails");
      count = 0;
      flips++;
      System.out.println(randomNumber);
      } else if (randomNumber > .5 && randomNumber < 1){
      System.out.println("heads");
      count++;
      flips++;
      }
    } while (count != number);
    return "It took " + flips + " flips to flip " + count + " heads in a row.";
  }

  //write a method clock that uses Java's built-in LocalDateTime object to constantly print out the current time to the console by second. The program should run until killed with CTRL-C or 'stop' button in IDE. Print once per second. Program should detect time change to print. Use zero-pad single digit numbers so the timestamp characters length stays the same.

  public static String clock() {
    LocalDateTime now = LocalDateTime.now();
    int oldSeconds = now.getSecond();
    String time = now.format(DateTimeFormatter.ofPattern(("HH:mm:ss")));
    int count = 0;
    do {
      now = LocalDateTime.now();
      int newSeconds = now.getSecond();
      count++;
       if (newSeconds != oldSeconds) {
        time = now.format(DateTimeFormatter.ofPattern(("HH:mm:ss")));
        System.out.println(time + " " + (count/1_000) + "kHz");
        oldSeconds = newSeconds;
        count = 0;
       }
    } while (true);
  }

}