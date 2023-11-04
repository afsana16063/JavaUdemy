package Methods;

public class MaxVaragrs {

    static double discount(double ...P ) {
        double sum = 0;
        for (int i=0; i<P.length; i++) {
            sum+=P[i];
        }
        if (sum < 500) return sum * 0.10;
        else if (sum >=500 && sum <1000) return sum*0.15;
        else return sum*0.20; 
    }

    static int sum(int ...A) {
        int s = 0;
        for (int i=0; i<A.length; i++) {
            s = s + A[i];
        }
        return s;
    }


    static int max(int ...A) {
        if (A.length == 0) return Integer.MIN_VALUE;
        int max = A[0];
        for (int i = 1; i<A.length; i++) {
            if (A[i] > max) max = A[i];
        }

        return max;
        }

    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10,20));
        System.out.println(max(10,20,30));
        System.out.println("----------");


        System.out.println(sum());
        System.out.println(sum(10));
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println("----------");

        System.out.println(discount());
        System.out.println(discount(100));
        System.out.println(discount(100,200, 300));
        System.out.println(discount(1000,20,30));
        System.out.println("----------");
    }
}
