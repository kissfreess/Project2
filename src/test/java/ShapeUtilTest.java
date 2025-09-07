import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeUtilTest {
    private ShapeUtil shapeUtil;
    private Shape[] shapes;

    @Before
    public void createShapeUtilAndShapeArrray(){
        shapeUtil = new ShapeUtil();
        shapes = new Shape[]{
                new Circle("A", 4.0),
                new Square("B", 2.0),
                new Rectangle("C", 2.0, 3.0)
        };
    }

    @Test
    public void testCalculateArea() {
        double expectedArea = Math.PI * 4.0 * 4.0 + 2.0 * 2.0 + 2.0 * 3.0;
        double actualArea = shapeUtil.calculateArea(shapes);
        Assert.assertEquals(expectedArea, actualArea, 1e-9);
    }

    @Test
    public void testCalculatePerimeter() {
        double expectedPerimetr = 2 * Math.PI * 4.0 + 2.0 * 4.0 + (2.0 + 3.0) * 2;
        double actualPerimetr = shapeUtil.calculatePerimeter(shapes);
        Assert.assertEquals(expectedPerimetr, actualPerimetr, 1e-9);
    }
}