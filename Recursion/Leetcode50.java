package Recursion;
import java.util.*;

public class Leetcode50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();

        System.out.println(myPow(x, n));
    }
    public static double myPow(double x, int n) {
        double ans = 1.0;
        long num = n;

        if (num < 0) num = -1 * num;
        while (num > 0) {
            if (num % 2 == 1) {
                ans = ans * x;
                num = num - 1;
            } else {
                x = x * x;
                num = num / 2;
            }
        }
        if (n < 0) ans = 1.0 / ans;
        return ans;
    }

}
