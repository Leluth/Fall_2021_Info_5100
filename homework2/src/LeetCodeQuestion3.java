import java.util.Arrays;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: LeetCodeQuestion3
 * @date 2021/10/3 10:58
 */
public class LeetCodeQuestion3 {
    public static void main(String[] args) {
        LeetCodeQuestion3 solution = new LeetCodeQuestion3();
        int[] data = new int[]{0,1,0,3,12};
        solution.moveZeroes(data);
        System.out.println(Arrays.toString(data));
        data = new int[]{0};
        solution.moveZeroes(data);
        System.out.println(Arrays.toString(data));
    }

    // n is the length of nums
    // Time: O(n)
    // Space: O(1)
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int left = 0;
        int right = 0;
        while (left < nums.length) {
            if (right < nums.length) {
                if (nums[right] != 0) {
                    nums[left] = nums[right];
                    left++;
                }
                right++;
            } else {
                nums[left] = 0;
                left++;
            }
        }
    }
}
