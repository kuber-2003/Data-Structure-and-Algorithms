package Recursion;

import java.util.*;

public class Leetcode78 {
   
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

   
    public static void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); 
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);                 
            backtrack(i + 1, nums, current, result); 
            current.remove(current.size() - 1); 
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
       String[] parts = sc.nextLine().split(" "); 

        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);  
        }

        System.out.println(subsets(nums));
        
     }
}
