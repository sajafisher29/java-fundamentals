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

    //Write second constructor with movie title

    //Implement a reasonable toString method for Reviews.
    public String toString() {
        //Add if no movie else movie
        return String.format("%s writes: %s They give %d stars.", this.author, this.body, this.stars);
    }
}


