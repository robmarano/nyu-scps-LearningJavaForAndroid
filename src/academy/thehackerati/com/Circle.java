package academy.thehackerati.com;

public class Circle extends Shape {
    public double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2.0);
    }
}
