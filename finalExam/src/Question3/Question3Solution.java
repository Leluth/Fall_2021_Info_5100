package Question3;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question3Solution
 * @date 2021/12/14 19:36
 */
public class Question3Solution {
    public static void main(String[] args) {
        Question3Solution solution = new Question3Solution();
        System.out.println(solution.countSubArraysSumToK(new int[]{1, 1, 1}, 2));

        System.out.println(solution.countSubArraysSumToK(new int[]{1, 2, 3}, 3));

        System.out.println(solution.countSubArraysSumToK(new int[]{1, 2, 3}, 4));

        System.out.println(solution.countSubArraysSumToK(new int[]{1,3,-1, 1, 1}, 4));

        System.out.println(solution.countSubArraysSumToK(new int[]{1}, 1));

        System.out.println(solution.countSubArraysSumToK(new int[]{}, 4));
    }

    public int countSubArraysSumToK(int[] nums, int k) {
        int res = 0;
        if (nums == null || nums.length == 0) {
            return res;
        }
        for (int i = 0; i < nums.length; i++) {
            int cur = 0;
            for (int j = i; j < nums.length; j++) {
                cur += nums[j];
                if (cur == k) {
                    res++;
                }
            }
        }
        return res;
    }
}
