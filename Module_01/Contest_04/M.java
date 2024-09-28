import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int tc = sc.nextInt();  
      
      while (tc-- > 0) {
         int n = sc.nextInt();  
         int[] arr = new int[n];

         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
         }

         int minIndex = 0;
         for (int i = 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
               minIndex = i;
            }
         }
         arr[minIndex]++;
         
         int product = 1;
         for (int i = 0; i < n; i++) {
            product *= arr[i];
         }
         System.out.println(product);
      }
   }
}
