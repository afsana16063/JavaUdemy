class Rectangle {
    public double length;
    public double breadth;

    public double area() {
        return 2 * length * breadth;
    }

    public double perimeter() {
        return 2 * length + 2 * breadth;
    }
}

public class Rectangle1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 1.5f;
        r1.breadth = 4;

        System.out.println(r1.area());
        System.out.println(r1.perimeter());

    }
}
