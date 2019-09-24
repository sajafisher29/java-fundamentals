package Linter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class App {

    //Analyzing Weather Data: Using the October Seattle weather data below, iterate through all of the data to find the min and max values. Use a HashSet of type Integer to keep track of all the unique temperatures seen. Iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String.

    //Iterate through the data to find the min and max values
    //Use an int HashSet to track all unique temperatures in the data set
    //Iterate from the min to max temp and create a String containing any temperature not seen during the month

    public static String analyzeWeatherData(int[][] weeklyMonthTemperatures){
        HashSet<Integer> trackWeatherData = new HashSet<>();
        int minTemperature = Integer.MAX_VALUE;
        int maxTemperature = Integer.MIN_VALUE;
        StringBuilder returnDataString = new StringBuilder();

        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            for (int j = 0; j < weeklyMonthTemperatures[i].length; j++) {
                trackWeatherData.add(weeklyMonthTemperatures[i][j]);
                if ( weeklyMonthTemperatures[i][j] < minTemperature) {
                    minTemperature = weeklyMonthTemperatures[i][j];
                }
                if ( weeklyMonthTemperatures[i][j] > maxTemperature) {
                    maxTemperature = weeklyMonthTemperatures[i][j];
                }
            }
        }

        returnDataString.append("\n" + "High: ").append(maxTemperature);
        returnDataString.append("\n" + "Low: ").append(minTemperature);

        for (int i = minTemperature + 1; i < maxTemperature; i++) {
            if (!trackWeatherData.contains(i)) {
                returnDataString.append("\n" + "Never saw temperature: ").append(i);
            }
        }
        return returnDataString.toString();
    }

    //Tallying Election: Write a function called tally that accepts a List of Strings representing votes and returns one string to show what got the most votes.

    public static String tally(List<String> votesList) {
        HashMap<String, Integer> voteCount = new HashMap<>();

        //If there are no votes
        if (votesList.size() == 0) {
            return "There were no votes recorded.";
        }

        //Tally the votes per candidate and store totals in voteCount
        for (String vote : votesList) {
            if (voteCount.containsKey(vote)) {
                voteCount.replace(vote, voteCount.get(vote) + 1);
            } else {
                voteCount.put(vote, 1);
            }
        }

        //Identify who has the highest vote tally and story name in electionWinner
        //For a tie, concat the winners
        int highestTally = 0;
        String electionWinner = "";

        for (String vote : voteCount.keySet()) {
            if (voteCount.get(vote) > highestTally) {
                electionWinner = vote;
                highestTally = voteCount.get(vote);
            } else if (voteCount.get(vote) == highestTally) {
                electionWinner = electionWinner + " and " + vote;
            }
        }
        return electionWinner;
    }
}
