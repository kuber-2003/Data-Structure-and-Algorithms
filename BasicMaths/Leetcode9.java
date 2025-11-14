package BasicMaths;

public class Leetcode9 {

    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int original = x;

        while (x > 0) {
            int last = x % 10;
            reverse = reverse * 10 + last;
            x = x / 10;
        }

        return reverse == original;
    }

    public static void main(String[] args) {
        int num = 121;  // test input
        System.out.println(isPalindrome(num));  // prints true
    }
}
