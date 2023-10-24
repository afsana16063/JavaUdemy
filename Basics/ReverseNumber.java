import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int digit = 0;
        int newNum = 0;

        while (n > 0) {
            digit = n % 10;
            n = n / 10;
            newNum = newNum * 10 + digit;

        }
        
        System.out.println(newNum);


        sc.close();
    }
}
