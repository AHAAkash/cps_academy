import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // Use to prevent mismatch in data types

        int cnt = 0;

        for(int i=0;i<n;i++){
            String row = sc.nextLine();
            for(int j=0;j<m;j++){
                if (row.charAt(j) == '#') { 
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
