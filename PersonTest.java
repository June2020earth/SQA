import static org.junit.Assert.*;
import org.junit.Test;
public class PersonTest {
    @Test
    public void testGetLeftEdge(){
        ShopOwner rectangle = new ShopOwner(10.00, 15.00,10.00,3.00);
        assertEquals(10.00,rectangle.getLeftEdge());
    }
    @Test
    public void testGetRightEdge(){
        Rectangle rectangle = new Rectangle(10.00, 15.00,10.00,3.00);
        assertEquals(10.00,rectangle.getRightEdge());
    }
    @Test
    public void testGetTopEdge(){
        Rectangle rectangle = new Rectangle(10.00, 15.00,10.00,3.00);
        assertEquals(15.00,rectangle.getTopEdge());
    }
    @Test
    public void testGetBottomEdge(){
        Rectangle rectangle = new Rectangle(10.00, 15.00,10.00,3.00);
        assertEquals(3.00,rectangle.getLeftEdge(),0.02);
    }
}

