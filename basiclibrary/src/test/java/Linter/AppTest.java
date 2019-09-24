package Linter;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class AppTest {

    @Test public void testAnalyzeWeatherData_correctStrings() {
        String expected = "High: 72\n" +
            "Low: 51\n" +
            "Never saw temperature: 63\n" +
            "Never saw temperature: 67\n" +
            "Never saw temperature: 68\n" +
            "Never saw temperature: 69";
        assertEquals(
            "This code finds and returns the correct strings.",
            expected,
            Linter.App.analyzeWeatherData(new int[][]{
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}})
        );
    }

    //Add test for a 2D array with only one number ex.{{66}}

    //Tallying Election: Write a function called tally that accepts a List of Strings representing votes and returns one string to show what got the most votes.

    @Test public void testTally_correctString() {
        String expected = "Bush received the most votes!";
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        assertEquals(
            "This code finds and returns the correct string with the correct winner.",
            expected,
            Linter.App.tally(votes));
    }
}