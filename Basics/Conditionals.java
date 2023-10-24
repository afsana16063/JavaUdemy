import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("====");
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mul");
        System.out.println("Div");

        System.out.println("Enter 2 numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option in words");
        String str = sc.nextLine();

        switch(str) {
            case("Add"): 
                System.out.println(x + y);
                break;
            
            case("Sub"):
                System.out.println(x - y);
                break;

            case("Mul"):
                System.out.println(x * y);
                break;

            case("Div"):
                System.out.println(x * 1.0 / (y * 1.0));
                break;

            default: System.out.println("Invalid operation");
        }



        sc.close();
    }
}
