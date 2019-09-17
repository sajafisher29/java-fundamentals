// import java.text.SimpleDateFormat;
// import java.util.Calendar;
import java.util.Random;

public class Basics {

  public static void main(String[] args) {
    // Calendar cal = Calendar.getInstance();
    // System.out.println(new SimpleDateFormat("MMMM").format(cal.getTime()));
    System.out.println(pluralize("dog", 3));
    System.out.println(flipNHeads(4));
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
}