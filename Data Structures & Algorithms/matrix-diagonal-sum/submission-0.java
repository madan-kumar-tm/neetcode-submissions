public class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        return helper(mat) + helper(mat) - (n % 2 == 1 ? mat[n / 2][n / 2] : 0);
    }

    int helper(int[][] matrix) {
        int res = 0, n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    res += matrix[i][j];
                }
            }
            reverse(matrix[i]);
        }
        return res;
    }

    void reverse(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left++] = row[right];
            row[right--] = temp;
        }
    }
}