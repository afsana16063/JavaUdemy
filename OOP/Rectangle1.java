class Rectangle {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setLength(double l) {
        length = l;
    }
    public void setBreadth(double b) {
        breadth = b;
    }
 
    public double area() {
        return length * breadth;
    }
    public double perimeter() {
        return 2*length + 2*breadth;
    }
    public boolean isSquare() {
        return length == breadth;
    }
}

public class Rectangle1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(10.5);
        r1.setBreadth(5.5);

        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());
    }
    
}
