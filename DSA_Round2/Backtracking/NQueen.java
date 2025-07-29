package DSA_Round2.Backtracking;

import java.util.Arrays;

public class NQueen {
    static int n = 4;

    public static boolean isSafe(char[][] board, int row, int col) {
        // column check
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // row check
        for (int i = 0; i < n; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        // both diagonal check
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static void queen(char[][] board, int row) {
        if (row == n) {
            display(board);

        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';// adding the queen
                queen(board, row + 1);// after adding moving to next row
                board[row][col] = '.'; // reseting the value after unsuccessful placement
            }
        }
    }

    public static void display(char[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        // given the size of board n and m which should be same
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], '.');
        }
        queen(arr, 0);

    }

}
