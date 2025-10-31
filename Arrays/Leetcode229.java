package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Leetcode229 {

    public static List<Integer> majorityElement(int[] v) {

        int n = v.length;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            if (ans.size() == 0 || ans.get(0) != v[i]) {
                for (int j = 0; j < n; j++) {
                    if (v[j] == v[i]) {
                        cnt++;
                    }
                }
                if (cnt > (n / 3)) {
                    ans.add(v[i]);
                }
            }
            if (ans.size() == 2) {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2, 2, 1, 1};
        List<Integer> result = majorityElement(nums);
        System.out.println(result);
    }
}
