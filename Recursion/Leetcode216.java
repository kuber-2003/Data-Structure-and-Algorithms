package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Leetcode216 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(1,k,n,new ArrayList<>(),ans);
        return ans;
    }
    private static void backtrack(int start,int k,int target,List<Integer> curr, List<List<Integer>> ans){
        if(curr.size()==k && target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(curr.size()>k || target<0) return;

        for(int i=start;i<=9;i++){
            curr.add(i);
            backtrack(i+1,k, target-i,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        int k = 3, n = 9;
        System.out.println(combinationSum3(k, n));
    }

}
