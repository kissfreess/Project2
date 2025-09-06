public class ShapeUtil {

    Circle createRandomCircle(){
        return new Circle("Случайный круг", (Math.random() * 10) + 1);
    }

    Square createRandomSquare(){
        return new Square("Случайный квадрат", (Math.random() * 10) + 2);
    }

    Rectangle createRandomRectangle(){
        return new Rectangle("Случайный прямоугольник", (Math.random() * 10) + 2, (Math.random() * 10) + 2);
    }

    Shape createRandomShape(){
        int randomShapeNumber = (int) (Math.random() * 3);
            return switch (randomShapeNumber) {
            case 0 -> createRandomCircle();
            case 1 -> createRandomSquare();
            case 2 -> createRandomRectangle();
            default -> throw new IllegalStateException("Unexpected value: " + randomShapeNumber);
        };
    }

    double calculateArea(Shape[] shapes){
        double totalArea = 0;
        if (shapes == null){
            return totalArea;
        }
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

}
