package inheritance;

//Create class to represent Review(body, author, a number of stars).
public class Review{
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
        return String.format("%s writes: %s They give %d stars.", this.author, this.body, this.stars);
    }
}


