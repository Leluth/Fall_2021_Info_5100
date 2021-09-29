import java.util.HashMap;
import java.util.Map;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question1Solution
 * @date 2021/9/26 11:16
 */
public class Question1Solution {
    public static void main(String[] args) {
        Question1Solution solution = new Question1Solution();
        System.out.println(solution.sumOfUnique(new int[]{1,2,3,2}));
        System.out.println(solution.sumOfUnique(new int[]{1,1,1,1}));
    }

    // n is the length of nums
    // Time: O(n)
    // Space: O(n)
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        if (nums == null || nums.length == 0) {
            return sum;
        }
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            Boolean visitedTwice = map.get(num);
            if (visitedTwice != null) {
                if (!visitedTwice) {
                    sum -= num;
                    map.put(num, true);
                }
                continue;
            }
            sum += num;
            map.put(num, false);
        }
        return sum;
    }
}
