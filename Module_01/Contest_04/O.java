import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> result = new ArrayList<>(arr);

        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < result.size() - 1; i++) {
                int dis = Math.abs(result.get(i) - result.get(i + 1));
                if (dis > 1) {
                    changed = true;
                    if (result.get(i) < result.get(i + 1)) {
                        for (int j = result.get(i) + 1; j < result.get(i + 1); j++) {
                            result.add(i + 1, j);  
                            i++;  
                        }
                    } 
                    else {
                        for (int j = result.get(i) - 1; j > result.get(i + 1); j--) {
                            result.add(i + 1, j);  
                            i++;  
                        }
                    }
                }
            }
        }
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
