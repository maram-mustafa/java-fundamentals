package inheritance;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class RestaurantTest {
    double delta=0.000;

    @Test
    public void testReturnName() {
        Restaurant testRestaurant = new Restaurant("pizza", 1);

        assertEquals("test returnName should return:" ,"pizza" , testRestaurant.getName());
    }

    @Test
    public void testReturnNumOfStars(){
        Restaurant testRestaurant = new Restaurant("pizza", 4);

        assertEquals("test returnName should return:" ,0 , testRestaurant.getNumOfStars(),delta);
    }

    @Test
    public void testReturnPriceCategory() {
        Restaurant testRestaurant = new Restaurant("pizza", 1);

        assertEquals("test returnPriceCategory should return:",1 , testRestaurant.getPriceCategory());
    }

    @Test
    public void testToString(){
        Restaurant res1 = new Restaurant("maram",5);

        // output:
        String output = "Restaurant{name='maram', stars=5, priceCategory=$$$$$, reviews=[Review{author='maram', body='good restaurant', stars=5.0}]}\n";
        assertEquals(output,res1.toString(),"Restaurant{name='maram', stars=0.0, priceCategory=$$$$$, reviews=[]}");

    }


}
