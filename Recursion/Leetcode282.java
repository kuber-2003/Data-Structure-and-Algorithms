package Recursion;
import java.util.*;

class Leetcode282 {
    public static List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        if (num == null || num.length() == 0) return result;
        helper(result, "", num, target, 0, 0, 0);
        return result;
    }

    private static void helper(List<String> res, String path, String num, int target, int pos, long eval, long multed) {
        if (pos == num.length()) {
            if (eval == target) res.add(path);
            return;
        }

        for (int i = pos; i < num.length(); i++) {
            if (i != pos && num.charAt(pos) == '0') break;

            String currStr = num.substring(pos, i + 1);
            long curr = Long.parseLong(currStr);

            if (pos == 0) {
                helper(res, path + currStr, num, target, i + 1, curr, curr);
            } else {
                helper(res, path + "+" + currStr, num, target, i + 1, eval + curr, curr);
                helper(res, path + "-" + currStr, num, target, i + 1, eval - curr, -curr);
                helper(res, path + "*" + currStr, num, target, i + 1, eval - multed + multed * curr, multed * curr);
            }
        }
    }

    public static void main(String[] args) {
        String num = "123";
        int target = 6;
        System.out.println(addOperators(num, target));
    }
}
