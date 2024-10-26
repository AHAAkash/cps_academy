import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }

        // horizontally adjacent  Condition:  1->Be consecutive.  2->Lie in the same row.
        if ((B - A == 1) && ((A - 1) / 3 == (B - 1) / 3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
