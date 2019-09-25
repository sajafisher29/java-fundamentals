package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
    private Theater ipic;
    private Review newReview;

    @Before
    public void setup() {
        ipic = new Theater("IPIC", "Up, Pets, Whale Rider");
        newReview = new Review("Fun and fancy for a chill movie and dinner.", "Sarah", 4);
    }

    //Test that Shop constructor and toString is behaving reasonably.
    @Test
    public void testTheater_constructorToString() {
        assertEquals("This should build the theater IPIC.",
                "IPIC is showing Up, Pets, Whale Rider.",
                ipic.toString());
    }
    //Test if a shop instance can have reviews added
    @Test public void testShop_addingReview() {
        ipic.addReview(newReview);
        assertTrue(ipic.listOfReviews.contains(newReview));
    }

}