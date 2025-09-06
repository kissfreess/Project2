import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    private static Circle circle;

    @BeforeClass
    public static void createNewCircle(){
        circle = new Circle("Круг", 5);
    }

    @Test
    public void calculateArea() {
        double expectedArea = Math.PI * 5 * 5;
        double actualArea = circle.calculateArea();
        Assert.assertEquals(expectedArea, actualArea, 1e-9);
    }

    @Test
    public void calculatePerimetr() {
        double expectedPerimetr = Math.PI * 2 * 5;
        double actualPerimetr = circle.calculatePerimetr();
        Assert.assertEquals(expectedPerimetr, actualPerimetr, 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeAndZeroRadiusShouldThrowException(){
        new Circle("Круг", -7);
    }
}