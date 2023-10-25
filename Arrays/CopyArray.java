package Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int A[] = {8,6,10,9,2,15,7,13,14,11};
        int B[] = new int[A.length];

        for (int i=0; i < A.length; i++) {
            B[i] = A[i];
        }
        for (int x:A) System.out.print(x + ", ");
        System.out.println("");

        for (int i=0; i < B.length; i++) {
            System.out.print(B[i] + ", ");
        };
        
    }
}
