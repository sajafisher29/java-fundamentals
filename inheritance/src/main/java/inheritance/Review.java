package inheritance;

//Create class to represent Review(body, author, a number of stars).
public class Review {
    String body;
    String author;
    int stars;

    //Write Review constructor.
    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    //Implement a reasonable toString method for Reviews.
    public String toString() {
        String completeReview = body + " This review was written by " + author + " who gave it " + stars + " stars in the review.";
        return completeReview;
    }

    //Need to update toString and constructor to reflect inheritance relationship
    //Need to add each review to the LinkedList in Restaurant - reviews

}


