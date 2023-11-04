class Cylinder {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI * radius * radius;
    }
    public double totalSurfaceArea() {
        return 2 * lidArea() + 2 * Math.PI * radius * height;
    }
    public double volume() {
        return lidArea() * height;
    }
}

public class Cylinder1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.radius = 7;
        c1.height = 10;
        

        System.out.println(c1.lidArea());
        System.out.println(c1.totalSurfaceArea());
        System.out.println(c1.volume());
    }
}
