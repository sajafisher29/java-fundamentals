package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    private Shop woodcraft;
    private Review newReview;

    @Before public void setup() {
        woodcraft = new Shop("Woodcraft", "Woodworking specialty chain selling tools & supplies.", 4);
        newReview = new Review("I get my best tools here.", "Sarah", 4);
    }

//Test that Shop constructor and toString is behaving reasonably.
    @Test public void testShop_constructorToString() {
        assertEquals("This should build the shop Woodcraft.",
                "Woodcraft: Woodworking specialty chain selling tools & supplies. It has $4 price.",
                woodcraft.toString());
    }
    //Test if a shop instance can have reviews added
    @Test public void testShop_addingReview() {
        woodcraft.addReview(newReview);
        assertTrue(woodcraft.listOfReviews.contains(newReview));
    }
}