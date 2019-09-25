package inheritance;

public interface ReviewFormat {
    //Interface defines that a Shop or Restaurant has a method to add associated reviews to itself
    String getName();

    void addReview(Review review);
}
