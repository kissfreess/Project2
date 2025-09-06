public class Square extends Shape{
    private double side;

    Square(String title, double side) {
        super(title);
        if (side <= 0){
            throw new IllegalArgumentException("Side can't be less or equal to 0");
        }
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimetr() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
