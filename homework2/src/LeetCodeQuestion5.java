import java.util.ArrayList;
import java.util.List;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: LeetCodeQuestion5
 * @date 2021/10/3 11:00
 */
public class LeetCodeQuestion5 {
    public static void main(String[] args) {
        LeetCodeQuestion5 solution = new LeetCodeQuestion5();
        System.out.println(solution.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        System.out.println(solution.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
        System.out.println(solution.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}}));
    }

    // m = matrix.length, n = matrix[0].length;
    // Time: O(m * n)
    // Space: O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        while (m > 0 && n > 0) {
            int leftUpRow = (matrix.length - m) / 2;
            int leftUpCol = (matrix[0].length - n) / 2;
            int rightDownRow = leftUpRow + m - 1;
            int rightDownCol = leftUpCol + n - 1;
            if (m == 1) {
                for (int col = leftUpCol; col <= rightDownCol; col++) {
                    res.add(matrix[leftUpRow][col]);
                }
                break;
            }  else if (n == 1) {
                for (int row = leftUpRow; row <= rightDownRow; row++) {
                    res.add(matrix[row][leftUpCol]);
                }
                break;
            }
            for (int col = leftUpCol; col < rightDownCol; col++) {
                res.add(matrix[leftUpRow][col]);
            }
            for (int row = leftUpRow; row < rightDownRow; row++) {
                res.add(matrix[row][rightDownCol]);
            }
            for (int col = rightDownCol; col > leftUpCol; col--) {
                res.add(matrix[rightDownRow][col]);
            }
            for (int row = rightDownRow; row > leftUpRow; row--) {
                res.add(matrix[row][leftUpCol]);
            }
            m -= 2;
            n-=2;
        }
        return res;
    }
}
