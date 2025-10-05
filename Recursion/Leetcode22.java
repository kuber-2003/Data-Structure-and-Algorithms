package Recursion;

import java.util.*;

public class Leetcode22 {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate("", 0, 0, n, ans);
        return ans;
    }

    private static void generate(String s, int opencount, int closecount, int n, List<String> ans) {
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }
        if (opencount < n)
            generate(s + "(", opencount + 1, closecount, n, ans);
        if (closecount < opencount)
            generate(s + ")", opencount, closecount + 1, n, ans);
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(generateParenthesis(n));
    }
}
