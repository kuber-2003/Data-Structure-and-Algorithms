package Arrays;

public class Leetcode152 {

    public static int maxProduct(int[] arr) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;

        for (int i = 0; i < n; i++) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix *= arr[i];
            suffix *= arr[n - i - 1];
            maxi = Math.max(maxi, Math.max(prefix, suffix));
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum product subarray: " + maxProduct(nums));
    }
}
