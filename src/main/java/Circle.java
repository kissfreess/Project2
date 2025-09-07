import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}

