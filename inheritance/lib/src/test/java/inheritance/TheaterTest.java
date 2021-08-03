package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterTest {

    @Test
    public void testTheaterName() {
        Theater theater1 = new Theater("rainbow theater");
        assertEquals("this testShop should return:" ,"rainbow theater" , theater1.getName());
    }

    @Test
    public void testTheaterToString() {
        Theater theater1 = new Theater("rainbow theater");
        String output="shop{name='Watch', stars=5, dollarSigns=$$, reviews=[Review{author='maram', body='good shop', stars=5}]}";

        assertEquals(output,theater1.toString() ,"shop{name='Watch', stars=0, dollarSigns=$$, reviews=[]}");
    }


    @Test
    public void testTheaterAddMovie() {
        Theater theater2 = new Theater("rainbow theater");
        theater2.addMovie("shutter Island");
        theater2.addMovie("the silence of the lambs");
        theater2.addMovie("the god father");

         String output="Theater{name='rainbow theater', reviews=[], movies=[shutter Island, the silence of the lambs, the god father]}";

        assertEquals("test add movie should return: ",output,theater2.toString());
    }

    @Test
    public void testTheaterRemoveMovie() {
        Theater theater1 = new Theater("rainbow theater");
        theater1.addMovie("shutter Island");
        theater1.addMovie("the silence of the lambs");
        theater1.addMovie("the god father");
        theater1.removeMovie("the god father");
        String output="Theater{name='rainbow theater', reviews=[], movies=[shutter Island, the silence of the lambs]}";

        assertEquals("test add movie should return: ",output,theater1.toString());
    }

    @Test
    public void testReviewTheater() {
        Theater theater1 = new Theater("rainbow theater");
        Review review = new Review("good","maram",5);

        theater1.addReview(review);

        String output="Theater{name='rainbow theater', reviews=[Review{author='maram', body='good', stars=5.0}], movies=[]}";

        assertEquals("test add movie should return: ",output,theater1.toString());
    }

    @Test
    public void testReviewTheaterMovie() {
        Theater theater1 = new Theater("rainbow theater");
        Review review = new Review("good","maram",5);


        theater1.addReview(review);

        String output="Theater{name='rainbow theater', reviews=[Review{author='maram', body='good', stars=5.0}], movies=[]}";

        assertEquals("test add movie should return: ",output,theater1.toString());
    }






}
