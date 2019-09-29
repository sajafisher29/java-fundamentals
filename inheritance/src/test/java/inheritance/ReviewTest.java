package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    Review review;
    @Before public void setup() {
        review = new Review("Love this local joint, and locally owned!","Steve", 5);
    }

    //Write a test to create an instance of Review and ensure that its toString is working properly.
    @Test public void testReviewWoodblock() {
        assertEquals("This should return Steve's review of Woodblock.",
                "Steve writes: Love this local joint, and locally owned! They give 5 stars.",
                review.toString());
    }

    //Test to make sure calling addReview doesn't change the Restaurant rating if they are already associated
}