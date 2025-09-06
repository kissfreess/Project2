public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String title, double length, double width) {
        super(title);
        if (length <=0 || width <=0){
            throw new IllegalArgumentException("length and width can't be less or equal to 0");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimetr() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
