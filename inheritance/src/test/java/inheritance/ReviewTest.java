package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    //Test that your Review constructor is behaving reasonably.
    @Test public void testReviewNirmals() {
        Review nirmals = new Review("Nirmals is an up and coming Indian restaurant.", Marc, "$$$");
        assertEquals();
    }

    //Write a test to create an instance of Review and ensure that its toString is working properly.
    @Test public void testReviewWoodblock() {
        Review woodblock = new Review();
        assertEquals("Woodblock is my favorite place to go for a nice meal or a fun happy hour! This review was written by Divya who gave it 5 stars in the review.", )
    }
}