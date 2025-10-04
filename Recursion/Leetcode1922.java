package Recursion;
import java.util.Scanner;

public class Leetcode1922 {
    private static final long MOD = 1_000_000_007; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); 

        System.out.println(countGoodNumbers(n)); 
    }

    public static int countGoodNumbers(long n) {
        long even = (n + 1) / 2; 
        long odd = n / 2;        

        long first = pow(5, even) % MOD;
        long second = pow(4, odd) % MOD;

        return (int) ((first * second) % MOD);
    }

    private static long pow(long x, long n) {
        if (n == 0) return 1;

        long temp = pow(x, n / 2);

        if (n % 2 == 0) {
            return (temp * temp) % MOD;
        } else {
            return (x * temp % MOD * temp) % MOD;
        }
    }
}


