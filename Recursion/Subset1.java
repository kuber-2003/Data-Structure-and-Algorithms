package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Subset1 {
     public static List<Integer> subsetSums(int[] nums) {
        //your code goes here
        int n=nums.length;
        ArrayList<Integer> subset=new ArrayList<>();
        funct(0,0, nums,n,subset);
        Collections.sort(subset);
        return subset;

    }
    private static void funct(int idx,int sum,int[] nums,int n,ArrayList<Integer> subset){
        if(idx==n){
            subset.add(sum);
            return;
        }
        funct(idx+1,sum+nums[idx],nums,n,subset);

        funct(idx+1,sum,nums,n,subset);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.println(subsetSums(nums));


    }
}
