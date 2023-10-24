import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int digit = 0;
        int newNum = 0;
        int oldNum = n;



        while (n > 0) {
            digit = n % 10;
            n = n / 10;
            newNum = newNum * 10 + digit;
            System.out.println(newNum);
        }

        if (oldNum == newNum) System.out.println("The number is palindrome");
        else System.out.println("The number is not palindrome");

        sc.close();
    }
}
