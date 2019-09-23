package basiclibrary;

public class Linter {

    //Write a method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.
    //After the IntStream didn't work I found https://introcs.cs.princeton.edu/java/13flow/RollDie.java.html and modified my code to use Math.Random.

    public static int[] roll(int nRolls) {
        int[] rollsArr = new int[nRolls];
        int i = 0;
        int diceSides = 6;

        while (i < nRolls) {
            int randomRoll = (int) (Math.random() * diceSides) + 1;
            rollsArr[i] = randomRoll;
            i++;
        }
        return rollsArr;
    }

    //Write a method called containsDuplicates that returns true or false depending on whether the array contains duplicate values.
    public static boolean containsDuplicates(int[] testArr) {
        boolean duplicates = true;
        for (int i = 0; i < testArr.length; i++) {
            for (int j = i + 1; j < testArr.length; j++) {
                if (testArr[i] == (testArr[j])) {
                    duplicates = true;
                } else {
                    duplicates = false;
                }
                ;
            }
        }
        return duplicates;
    }

    //Write a method that accepts an array of integers and calculates and returns the average of all the values in the array.
    public static double calculatingAverage(int[] testAverageArr) {
        int totalOfArr = 0;
        double averageOfArr = 0;

        for (int value : testAverageArr) {
            totalOfArr += value;
        }
        averageOfArr = (double) totalOfArr / testAverageArr.length;

        return averageOfArr;
    }

    //Given an array of arrays calculate the average value for each array and return the array with the lowest average.
    //Thank you to James for helping me get out of my head and simplify the thought process!
    public static int[] lowestAverageArr(int[][] arrOfArrs) {
        int lowestAverageIndex = 0;
        double lowestAverage = calculatingAverage(arrOfArrs[lowestAverageIndex]);

        for (int i = 1; i < arrOfArrs.length; i++) {
            double tempAverage = calculatingAverage(arrOfArrs[i]);
            if (tempAverage < lowestAverage) {
                lowestAverage = tempAverage;
                lowestAverageIndex = i;
            }
        }
        return arrOfArrs[lowestAverageIndex];
    }

//Start of Lab 03 work

    //Analyzing Weather Data: Using the October Seattle weather data below, iterate through all of the data to find the min and max values. Use a HashSet of type Integer to keep track of all the unique temperatures seen. Iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String.

    //Data: Daily average temperatures for Seattle, October 1-28 2017
    //int[][] weeklyMonthTemperatures = {
    //  {66, 64, 58, 65, 71, 57, 60},
    //  {57, 65, 65, 70, 72, 65, 51},
    //  {55, 54, 60, 53, 59, 57, 61},
    //  {65, 56, 55, 52, 55, 62, 57}
    //};

    //Expected output:
    //High: 72
    //Low: 51
    //Never saw temperature: 63
    //Never saw temperature: 67
    //Never saw temperature: 68
    //Never saw temperature: 69

    //Iterate through the data to find the min and max values
    //Use an int HashSet to track all unique temperatures in the data set
    //Iterate from the min to max temp and create a String containing any temperature not seen during the month

    public static String analyzeWeatherData(int[][] weeklyMonthTemperatures){
        int minTemperature = Integer.MAX_VALUE;
        int maxTemperature = Integer.MIN_VALUE;
        StringBuilder returnDataString = new StringBuilder();

        HashSet<Integer> trackWeatherData = new HashSet<>();

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
    //Within main method include
    //List<String> votes = new ArrayList<>();
    //votes.add("Bush");
    //votes.add("Bush");
    //votes.add("Bush");
    //votes.add("Shrub");
    //votes.add("Hedge");
    //votes.add("Shrub");
    //votes.add("Bush");
    //votes.add("Hedge");
    //votes.add("Bush");
    //String winner = tally(votes);
    //System.out.println(winner + " received the most votes!");

    public static String tally(List<String> votesList) {
        votesList = new ArrayList<>();
        votesList.add("Bush");
        votesList.add("Bush");
        votesList.add("Bush");
        votesList.add("Shrub");
        votesList.add("Hedge");
        votesList.add("Shrub");
        votesList.add("Bush");
        votesList.add("Hedge");
        votesList.add("Bush");
        String winner = tally(votesList);
//        return winner + " received the most votes!";

//        HashMap<String, Integer> tally = new HashMap<>();
//
//        for (String vote : votesList) {
//            if (votesList.containsKey(vote)) {
//                int previousVotes = votesList.get(vote);
//                votesList.put(vote, previousVotes + 1);
//            } else {
//                votesList.put(vote, 1);
//            }
//        }
//        String winnerVote = votes.get(0);
//        for (String vote : votesList.keySet()) {
//            if(votesList.get(vote) > votesList.get(winnerVote)) {
//                winnerVote = vote;
//            }
//        }
//        return winnerVote;
    }
}
}
