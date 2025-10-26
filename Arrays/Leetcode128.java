package Arrays;

import java.util.*;  // Required for Set and HashSet

class Leetcode128 {

    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int it : set) {
            if (!set.contains(it - 1)) {  // Start of a new sequence
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x++;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + longestConsecutive(nums));
    }
}
