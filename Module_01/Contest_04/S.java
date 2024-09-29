import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();  
        }
        long[] B = A.clone(); 
        Arrays.sort(B);   
        
        long[] s = new long[N + 1]; 
        s[0] = 0;
        for (int i = 1; i <= N; i++) {
            s[i] = s[i - 1] + B[i - 1]; 
        }
        
        for (int i = 0; i < N; i++) {
            int upperIndex = upperBound(B, A[i]);
            System.out.print(s[N] - s[upperIndex] + " ");
        }
        System.out.println(); 
    }
    public static int upperBound(long[] B, long key) {
        int low = 0, high = B.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (B[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

