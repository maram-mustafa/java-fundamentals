package inheritance;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ShopsTest {


    @Test
    public void testShopName() {
        Shop testShop = new Shop("Watch", "this shop for watches",2);
        assertEquals("this testShop should return:" ,"Watch" , testShop.getName());
    }

    @Test
    public void testShopDescription() {
        Shop testShop = new Shop("Watch", "this shop for watches",2);
        assertEquals("this testShop should return:" ,"this shop for watches" , testShop.getDescription());
    }

    @Test
    public void testShopDollarSigns() {
        Shop testShop = new Shop("Watch", "this shop for watches",2);
        assertEquals("this testShop should return:" ,2 , testShop.getDollarSigns());
    }

    @Test
    public void testShopToString() {
        Shop testShop = new Shop("Watch", "this shop for watches",2);
        String output="shop{name='Watch', stars=5, dollarSigns=$$, reviews=[Review{author='maram', body='good shop', stars=5}]}";

        assertEquals(output,testShop.toString() ,"shop{name='Watch', stars=0.0, dollarSigns=$$, reviews=[]}");
    }

}
