public class Circle extends Shape {
    private double radius;

    public Circle(String title, double radius) {
        super(title);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius can't be less or equal to 0");
        }
        this.radius = radius;
    }

        @Override
        double calculateArea () {
            return Math.PI * radius * radius;
        }

        @Override
        double calculatePerimetr () {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
        }
}

