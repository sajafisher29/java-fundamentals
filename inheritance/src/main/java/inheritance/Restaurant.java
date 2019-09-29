/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import java.util.LinkedList;
import java.util.StringJoiner;

//Create class representing Restaurant(name, number of stars between 0 and 5, price category (i.e. number of dollar signs)).
public class Restaurant implements ReviewFormat{
    private String name;
    private double stars;
    private int price;
    private LinkedList<Review> listOfReviews = new LinkedList<>();

//Implement Restaurant constructor.
    public Restaurant(String name, int price){
        this.name = name;
        this.price = price;
    }

//Update the Restaurant's rating based on reviews
    public double updateStarsRating() {
        if (listOfReviews.isEmpty()) {
            return 5.0;
        }

        int countOfReviews = 1;
        double sum = 5;

        // Add up the review ratings
        for (Review review : this.listOfReviews) {
            countOfReviews++;
            sum += review.stars;
        }

        // divide the number of stars by the number of reviews
        return sum / this.listOfReviews.size();
    }

    @Override
    public String getName() {
        return this.name;
    }

//Linked List containing the Restaurant's reviews
    public void addReview(Review review) {
        if (listOfReviews.contains(review)) {
            throw new IllegalArgumentException(String.format("A review for %s has already been submitted.", this.name));
        } else {
            listOfReviews.add(review);
        }
        updateStarsRating();
    }

//Need to update toString and constructor to reflect inheritance relationship
    @Override public String toString() {
        double currentStarsRating = updateStarsRating();
        return String.format("%s has %s stars and $%s price.", this.name, currentStarsRating, this.price);
    }

}