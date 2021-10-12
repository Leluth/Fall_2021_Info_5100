import java.util.Arrays;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: LeetCodeQuestion1
 * @date 2021/10/3 10:56
 */
public class LeetCodeQuestion1 {
    public static void main(String[] args) {
        LeetCodeQuestion1 solution = new LeetCodeQuestion1();
        System.out.println(Arrays.deepToString(solution.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
        System.out.println(Arrays.deepToString(solution.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}})));
    }

    // m is the length of rows of input matrix, n is the length of columns of input matrix
    // Time: O(m * n)
    // Space: O(1)
    public int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return null;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] res = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
