import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Basics {

  public static void main(String[] args) {
    System.out.println(pluralize("dog", 3));
    System.out.println(flipNHeads(4));
    clock();
  }

  public static String pluralize(String word, int number) {
    if (number == 0 || number > 1) {
      return word + "s";
    } else {
      return word;
      }
  }

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