import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Multiplication Table");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(num + " * " + i + " = " + num * i );
        }
        
        sc.close();
    }
}
