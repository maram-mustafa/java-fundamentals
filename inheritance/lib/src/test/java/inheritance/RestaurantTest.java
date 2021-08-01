package inheritance;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class RestaurantTest {

    @Test
    public void testReturnName() {
        Restaurant testRestaurant = new Restaurant("pizza", 1);

        assertEquals("test returnName should return:" ,"pizza" , testRestaurant.getName());
    }

    @Test
    public void testReturnNumOfStars(){
        Restaurant testRestaurant = new Restaurant("pizza", 1);

        assertEquals("test returnStars should return:", 0.0 , testRestaurant.getNumOfStars());
    }

    @Test
    public void testReturnPriceCategory() {
        Restaurant testRestaurant = new Restaurant("pizza", 1);

        assertEquals("test returnPriceCategory should return:",1 , testRestaurant.getPriceCategory());
    }

    @Test
    public void testToString(){
        Restaurant testRestaurant = new Restaurant("pizza", 1);

        Restaurant res1 = new Restaurant("maram",5);
        Review rev1 = new Review("Ali","good restaurant",5);

        res1.addReview(rev1);
        // output must be :
        String out =  "Restaurant{name='maram', stars=0, priceCategory=, reviews=[Review{author='Ali', body='good restaurant', stars=5.0}]}\n";

        assertEquals(out,res1.toString(),"call addReview, the association is created between the Restaurant and the " +
                "Review");

    }


}
