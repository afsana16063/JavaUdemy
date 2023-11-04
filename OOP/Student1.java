class Student {
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total() {
        return m1+m2+m3;
    }
    public float average(){
        return (float)total() / 3;
    }
    public char grade() {
        if (average() >= 60) return 'A';
        else return 'B';
    }
    public String toString() {
        return "Roll No:" + roll + "\n" + "Name:" +name + "\n" + "Course:" +course +"\n";
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "John";
        s1.course = "CS";
        s1.m1 = 70;
        s1.m2 = 80;
        s1.m3 = 65;

        System.out.println(s1.total());
        System.out.println(s1.average());
        System.out.println(s1.grade());
        System.out.println(s1);
    }
}
