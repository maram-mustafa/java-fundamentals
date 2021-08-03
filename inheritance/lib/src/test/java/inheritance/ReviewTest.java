package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {

    @Test
    public void testReturnBody() {
        Review review = new Review("This restaurant good", "ahmad", 4);

        assertEquals("testGetBody should return: ", "This restaurant good", review.getBody());
    }


    @Test
    public void testReturnAuthor(){
        Review review = new Review("This restaurant  good", "ahmad", 4);

        assertEquals("testGetAuthor should return: ", "ahmad", review.getAuthor());
    }



    @Test
    public void testReturnStars() {
        Review review = new Review("This restaurant good", "ahmad", 4);

        assertEquals("test returnPriceCategory should return:",4.0 , review.getStars());
    }

    @Test
    public void testToString(){
        Review review = new Review("good restaurant", "maram", 5);

        String outPut ="Review{author='maram', body='good restaurant', stars=5.0}";
        assertEquals(outPut,review.toString(),"Review{author='maram', body='good restaurant', stars=5.0}");
    }

}
