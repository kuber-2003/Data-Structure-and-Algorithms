package Arrays;
import java.util.*;

public class Leetcode56 {
    public static int[][] merge(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(new int[] { arr[i][0], arr[i][1] });
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], arr[i][1]);
            }
        }
        
        return ans.toArray(new int[ans.size()][]);
    }

    // ✅ Minimal main method
    public static void main(String[] args) {
        
        int[][] arr = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        int[][] res = merge(arr);

        for (int[] interval : res) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
