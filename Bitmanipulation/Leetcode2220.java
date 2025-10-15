package Bitmanipulation;

class Leetcode2220 {
    public static int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int count = 0;
        while (xor > 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minBitFlips(10, 7));  // Output: 3
        System.out.println(minBitFlips(3, 4));   // Output: 3
        System.out.println(minBitFlips(5, 5));   // Output: 0
    }
}
