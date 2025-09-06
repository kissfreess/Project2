import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    private static Rectangle rectangle;

    @BeforeClass
    public static void createNewRectangle(){
        rectangle = new Rectangle("Прямоугольник", 4, 2);
    }

    @Test
    public void calculateArea() {
        double expectedArea = 4 * 2;
        double actualArea = rectangle.calculateArea();
        Assert.assertEquals(expectedArea, actualArea, 1e-9);
    }

    @Test
    public void calculatePerimetr() {
        double expectedPerimetr = (4 + 2) * 2;
        double actualPerimetr = rectangle.calculatePerimetr();
        Assert.assertEquals(expectedPerimetr, actualPerimetr, 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeAndZeroLengthAndWidthShouldThrowException(){
        new Rectangle("Прямоугольник", 5, 0);
    }


}