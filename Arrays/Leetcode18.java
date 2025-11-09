package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode18 {

    public static List<List<Integer>> fourSum(int[] a, int target) {
        int n = a.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue;

            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && a[j] == a[j - 1]) continue;

                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    long sum = (long) a[i] + a[j] + a[k] + a[l];

                    if (sum == target) {
                        ans.add(Arrays.asList(a[i], a[j], a[k], a[l]));
                        k++;
                        l--;
                        while (k < l && a[k] == a[k - 1]) k++;
                        while (k < l && a[l] == a[l + 1]) l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = fourSum(nums, target);
        System.out.println(result);
    }
}
