/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    //Test that your Restaurant constructor is behaving reasonably.
    @Test public String testRestaurantNirmals() {
        Restaurant nirmals = new Restaurant("Nirmals", 5, "$$");
        assertEquals("Nirmals is a restaurant with a five star rating and price of $$");
    }

    //Write a test to create an instance of Restaurant and ensure that its toString is working properly.
    @Test public void testRestaurantWoodblock() {
        Restaurant woodblock = new Restaurant("Woodblock", 5, "$$");
        assertEquals("Woodblock is a restaurant with 5 stars and is in the $$ price category.");
    }
}
