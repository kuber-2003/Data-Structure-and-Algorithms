package Arrays;

class Leetcode26 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int length = removeDuplicates(nums);
        System.out.println("Length after removing duplicates: " + length);
        System.out.print("Array after removing duplicates: ");
        for (int k = 0; k < length; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
