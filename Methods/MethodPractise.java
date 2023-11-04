package Methods;

public class MethodPractise {
    int max(int x, int y) {
        if (x > y ) return x;
        else return y;
    }
    public static void main(String[] args) {
        int a=10, b=15;

        MethodPractise mp = new MethodPractise();
        System.out.println(mp.max(a,b));
        
    }
}
