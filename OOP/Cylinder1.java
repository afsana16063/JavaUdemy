class Cylinder {
    private double radius;
    private double height;

    public Cylinder() {
        radius=height=1;
    }
    public Cylinder(double r, double h) {
        height = h;
        radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }

    public void setRadius(double r) {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }
    public void setHeight(int h)
    {
        if(h>=0)
            height=h;
        else
            height=0;
    }

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
        c1.setRadius(7);
        c1.setHeight(10);
        

        System.out.println(c1.lidArea());
        System.out.println(c1.totalSurfaceArea());
        System.out.println(c1.volume());
    }
}
