package Recursion;

import java.util.*;

public class Leetcode40 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findComb(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findComb(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;
            ds.add(arr[i]);
            findComb(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();              
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();  
        int target = sc.nextInt();       
        System.out.println(combinationSum2(arr, target));

    }
}
