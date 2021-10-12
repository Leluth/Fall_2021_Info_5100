import java.util.Arrays;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: LeetCodeQuestion4
 * @date 2021/10/3 10:59
 */
public class LeetCodeQuestion4 {
    public static void main(String[] args) {
        LeetCodeQuestion4 solution = new LeetCodeQuestion4();
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        solution.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
        matrix = new int[][]{{1,2},{3,4}};
        solution.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    // n is the length of input matrix
    // Time: O(n ^ 2)
    // Space: O(1)
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            return;
        }
        int len = matrix.length;
        int end = len / 2 - 1;
        for (int row = 0; row <= end; row++) {
            for (int col = row; col < len - 1 - row; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[len - 1 - col][row];
                matrix[len - 1 - col][row] = matrix[len - 1 - row][len - 1 - col];
                matrix[len - 1 - row][len - 1 - col] = matrix[col][len - 1 - row];
                matrix[col][len - 1 - row] = temp;
            }
        }
    }
}
