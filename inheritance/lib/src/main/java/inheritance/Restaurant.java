package inheritance;


import java.util.LinkedList;

public class Restaurant {

    //fields for restaurant
    private String name;
    private double numOfStars = 0.0;
    private int priceCategory;
    public int star;
    public LinkedList<Review> reviews = new LinkedList<Review>();

    public Restaurant(String name, int priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfStars(double numOfStars) {
        this.numOfStars = numOfStars;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public double getNumOfStars() {
        return numOfStars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "name='" + name + '\'' + ", stars=" + star + ", priceCategory=" +  ", " +
                "reviews=" + reviews + '}';
    }


    public void addReview(Review review) {
        if(!reviews.contains(review)) { // prevent duplicates
            star += review.star;
            reviews.add(review);
        }
    }

}

