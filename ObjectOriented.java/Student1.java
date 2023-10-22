class Student {
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public double average() {
        return total() / 3; 
    }

    public void grade() {
        if ( average() >= 70 ) return A;
        else if ( average() < 70 && average() >= 60 ) return B;
        else if ( average() > 50 && average() < 60 )

    }

}


public class Student1 {
    public static void main(String[] args) {
        
    }
}
