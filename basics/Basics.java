// import java.text.SimpleDateFormat;
// import java.util.Calendar;

public class Basics {

  public static void main(String[] args) {
    // Calendar cal = Calendar.getInstance();
    // System.out.println(new SimpleDateFormat("MMMM").format(cal.getTime()));
    System.out.println(pluralize("dog", 3));
  }

  public static String pluralize(String word, int number) {
    if (number == 0 || number > 1) {
      return word + "s";
    } else {
      return word;
      }
  }

}