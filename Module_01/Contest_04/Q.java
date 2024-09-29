import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int l = sc.nextInt();
      int r = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
      }
      int[] ar = new int[n];
      for(int i=0;i<n;i++){
         if (arr[i] < l) {
            ar[i] = l;  
         } else if (arr[i] > r) {
            ar[i] = r; 
         } else {
            ar[i] = arr[i];  
         }
      }
      for (int i = 0; i < n ;i++) {
         System.out.print(ar[i] + " ");
      }
   }
}
