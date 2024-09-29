import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n + 1];  
        boolean[] b = new boolean[n + 1]; 

        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            if (!b[i]) {
                b[a[i]] = true;
            }
        }
        int k = 0;
        for (int i = 1; i <= n; i++) {
            if (!b[i]) {
                k++;
            }
        }
        System.out.println(k);
        for (int i = 1; i <= n; i++) {
            if (!b[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
