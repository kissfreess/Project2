import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    private static Square square;

    @BeforeClass
    public static void createNewSquare(){
        square = new Square("Квадрат", 10);
    }

    @Test
    public void calculateArea() {
        double expectedArea = 10 * 10;
        double actualArea = square.calculateArea();
        Assert.assertEquals(expectedArea, actualArea, 1e-9);
    }

    @Test
    public void calculatePerimetr() {
        double expectedPerimetr = 10 * 4;
        double actualPerimetr = square.calculatePerimetr();
        Assert.assertEquals(expectedPerimetr, actualPerimetr, 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeAndZeroSideShouldThrowException(){
        new Square("Квадрат", 0);
    }
}