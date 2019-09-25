package inheritance;

import java.util.LinkedList;

public class Shop implements ReviewFormat{
    public String name;
    public String description;
    public int price;
    public LinkedList<Review> listOfReviews;

    public Shop(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.listOfReviews = new LinkedList<>();
    }

    @Override public String getName() {
        return this.name;
    }

    //Add review to the list of reviews for this shop
    @Override public void addReview(Review review) {
        if (listOfReviews.contains(review)) {
            throw new IllegalArgumentException(String.format("A review for %s has already been submitted.", this.name));
        } else {
            listOfReviews.add(review);
        }
    }

    @Override public String toString() {
        return String.format("%s: %s It has $%s price.", this.name, this.description, this.price);
    }
}
