import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int tc = sc.nextInt();
      while (tc-->0) {
         int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }

         int res=-1;

         int[] freq = new int[n+1];
         for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;

            if(freq[arr[i]]>=3){
               res=arr[i];
               break;
            }
         }
         System.out.println(res);
      }
   }
}
