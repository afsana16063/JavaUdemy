package Methods;

public class GreatCommonDiviser {
    static int GSD (int m, int n) {
        while (m!=n) {
            if (m>n) m = m-n;
            else n = n-m;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(GSD(45, 18));
    }
}
