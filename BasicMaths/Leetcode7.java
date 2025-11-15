package BasicMaths;

class Leetcode7 {

    public static int reverse(int x) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        int a = x;
        if (x < 0) {
            a = -1 * a;
        }
        long sum = 0;

        while (a > 0) {
            int b = a % 10;
            sum = sum * 10 + b;
            a = a / 10;
        }
        if (x < 0) {
            sum = -1 * sum;
        }
        if (sum > max || sum < min) {
            sum = 0;
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));      // Output: 321
        System.out.println(reverse(-456));     // Output: -654
        System.out.println(reverse(1534236469)); // Output: 0 (overflow)
    }
}
