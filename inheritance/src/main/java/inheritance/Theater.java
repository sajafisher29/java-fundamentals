package inheritance;

import java.util.LinkedList;
import java.util.StringJoiner;

public class Theater implements ReviewFormat {

    public String name;
    public LinkedList<String> listOfMovies;
    public LinkedList<Review> listOfReviews;

    public Theater(String name) {
        this.name = name;
        this.listOfMovies = new LinkedList<>();
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
    public void addMovie(String movie) {
        if (listOfMovies == null) {
            listOfMovies = new LinkedList<>();
        }
        this.listOfMovies.add(movie);
    }

    //Remove a movie to update list
    public void removeMovie(String movie) {
        if (listOfMovies == null) {
            System.out.println("There are no movies stored.");
        } else {
            this.listOfMovies.remove(movie);
        }
    }

//    //Create head of LinkedList to hold movie titles
//    Node head = null;
//
//    class Node {
//        String title;
//        Node next;
//
//        Node(String title) {
//            this(title, null);
//        }
//
//        Node(String title, Node next) {
//            this.title = title;
//            this.next = next;
//        }
//    }

    //Method to print the listOfMovies
    public String printMovies() {
        StringJoiner movieList = new StringJoiner(", ");

        // Traverse through the list
        for (String title : listOfMovies) {
            movieList.add(title);
        }
        return movieList.toString();
    }

    @Override
    public String toString() {
        return String.format("%s is showing %s.", this.name, printMovies());
    }
}