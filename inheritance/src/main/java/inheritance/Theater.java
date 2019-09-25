package inheritance;

import java.util.LinkedList;

public class Theater implements ReviewFormat {

    public String name;
    public String movies;
    public LinkedList<Review> listOfReviews;

    public Theater(String name, String movies) {
        this.name = name;
        this.movies = movies;
        this.listOfReviews = new LinkedList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    //Add review to the list of reviews for this theater
    @Override
    public void addReview(Review review) {
        if (listOfReviews.contains(review)) {
            throw new IllegalArgumentException(String.format("A review for %s has already been submitted.", this.name));
        } else {
            listOfReviews.add(review);
        }
    }

    //Add a movie to update list
    public String addMovie() {

    }

    //Remove a movie to update list
    public String removeMovie() {

    }

    @Override
    public String toString() {
        return String.format("%s is showing %s.", this.name, this.movies);
    }
}