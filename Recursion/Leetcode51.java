package Recursion;
import java.util.*;

public class Leetcode51 {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) Arrays.fill(board[i], '.');
        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n];
        boolean[] diag2 = new boolean[2 * n];
        backtrack(0, board, result, cols, diag1, diag2, n);
        return result;
    }

    private static void backtrack(int row, char[][] board, List<List<String>> result,
                                  boolean[] cols, boolean[] diag1, boolean[] diag2, int n) {
        if (row == n) {
            result.add(construct(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            int d1 = row + col, d2 = row - col + n;
            if (cols[col] || diag1[d1] || diag2[d2]) continue;
            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;
            backtrack(row + 1, board, result, cols, diag1, diag2, n);
            board[row][col] = '.';
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }

    private static List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();
        for (char[] row : board) path.add(new String(row));
        return path;
    }

    public static void main(String[] args) {
        for (List<String> b : solveNQueens(4)) {
            b.forEach(System.out::println);
            System.out.println();
        }
    }
}
