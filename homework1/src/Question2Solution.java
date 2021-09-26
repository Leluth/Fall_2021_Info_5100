import java.util.Arrays;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question2Solution
 * @date 2021/9/26 11:20
 */
public class Question2Solution {
    public static void main(String[] args) {
        Question2Solution solution = new Question2Solution();
        System.out.println(Arrays.toString(solution.sortedSquares(new int[]{-4,-1,0,3,10})));
        System.out.println(Arrays.toString(solution.sortedSquares(new int[]{16,1,0,9,100})));
    }

    public int[] sortedSquares(int[] nums) {
        if (nums == null || nums.length < 1) {
            return nums;
        }
        int[] res = new int[nums.length];
        int index = res.length - 1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            res[index--] = Math.abs(nums[left]) > Math.abs(nums[right]) ? nums[left] * nums[left++] : nums[right] * nums[right--];
        }
        return res;
    }
}
