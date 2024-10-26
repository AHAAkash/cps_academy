import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[] clmSum = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                clmSum[j]+=arr[i][j];
            }
        }
        for(int sum : clmSum){
            System.out.println(sum);
        }
    }
}
