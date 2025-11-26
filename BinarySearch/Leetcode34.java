package BinarySearch;

class Leetcode34 {

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start = -1;
        int end = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                start = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == target) {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
