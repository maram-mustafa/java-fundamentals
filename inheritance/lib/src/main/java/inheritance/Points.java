package inheritance;

import java.util.ArrayList;

public abstract class Points{

    public String name;
    public double stars;
    private ArrayList<Review> reviews = new ArrayList<>();

    public void addReview(Review review) {
        if(!reviews.contains(review)) {
            reviews.add(review);
        }
        int sum =0;
        for (Review reviewNum : reviews) {
            sum += reviewNum.stars;
        }
        stars = sum / reviews.size();
        }
    }


