class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // First pass: Identify rows and columns to be zeroed
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, n, m, i);
                    markColumn(matrix, n, m, j);
                }
            }
        }

        // Second pass: Mark all -1 as 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1234) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Helper method to mark an entire row with -1 (except 0s)
    private void markRow(int[][] matrix, int n, int m, int row) {
        for (int j = 0; j < m; j++) {
            if (matrix[row][j] != 0) {
                matrix[row][j] = -1234;
            }
        }
    }

    // Helper method to mark an entire column with -1 (except 0s)
    private void markColumn(int[][] matrix, int n, int m, int col) {
        for (int i = 0; i < n; i++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = -1234;
            }
        }
    }
}
