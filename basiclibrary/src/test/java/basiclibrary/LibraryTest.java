/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

//Use JUnit to write at least one test for each of the Feature Tasks. Your tests should ensure that each of your methods work correctly.

    //Write a method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.
    @Test
    public void testRoll_correctArr() {
        assertEquals(
                "This array contains the correct number of roll values within the dice number options.",
                5,
                Library.roll(5).length
        );
    }

    //Write a method called containsDuplicates that returns true or false depending on whether the array contains duplicate values.
    @Test
    public void testContainsDuplicates_true() {
        assertEquals(
                "This array contains duplicate values and returns true",
                true,
                Library.containsDuplicates(new int[]{3, 2, 90, 49, 2})
        );
    }

    //Write a method that accepts an array of integers and calculates and returns the average of all the values in the array.
    @Test
    public void testCalculatingAverage_correctAverage() {
        assertEquals(
                "This is the correct average for the array values.",
                34.0,
                Library.calculatingAverage(new int[]{5, 90, 7}),
                0.001
        );
    }

    //Given an array of arrays calculate the average value for each array and return the array with the lowest average.
    @Test
    public void testLowestAverageArr_correctArr() {
        int[] expected = {3, 9, 7};
        assertArrayEquals(
                "This is the correct array with the lowest average.",
                expected,
                Library.lowestAverageArr(new int[][]{{4, 16, 52}, {3, 9, 7}, {17, 41, 1}})
        );
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

    @Test public void testanalyzeWeatherData_correctStrings() {
        String expected = "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69";
        assertArrayEquals(
                "This code finds and returns the correct strings.",
                expected,
                Library.weeklyMonthTemperatures(new int[][]{
                        {66, 64, 58, 65, 71, 57, 60},
                        {57, 65, 65, 70, 72, 65, 51},
                        {55, 54, 60, 53, 59, 57, 61},
                        {65, 56, 55, 52, 55, 62, 57}})
        );
    }

}