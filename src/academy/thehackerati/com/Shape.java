package academy.thehackerati.com;

public class Shape {
    public double area() {
        return 0.0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(":\tarea = ");
        sb.append(area());
        return sb.toString();
    }

}
