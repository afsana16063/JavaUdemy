import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the intial value, d and the number of serie");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(a + ", ");
            a+=d;
        }

        sc.close();
    }
    
}
