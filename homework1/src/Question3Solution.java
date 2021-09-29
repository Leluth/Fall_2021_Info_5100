import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question3Solution
 * @date 2021/9/26 11:20
 */
public class Question3Solution {
    public static void main(String[] args) {
        Question3Solution solution = new Question3Solution();
        System.out.println(solution.findFirstNonRepeatedInteger(new int[]{2,3,4,2,2,3,5,7}));
        System.out.println(solution.findFirstNonRepeatedInteger(new int[]{1}));
    }

    // n is the length of nums
    // Time: O(n)
    // Space: O(n)
    public int findFirstNonRepeatedInteger(int[] array) {
        Map<Integer, Boolean> repeatedMap = new HashMap<>();
        for (int i : array) {
            Boolean repeated = repeatedMap.get(i);
            if (repeated == null) {
                repeatedMap.put(i, false);
            } else {
                repeatedMap.put(i, true);
            }
        }
        for (int i : array) {
            if (!repeatedMap.get(i)) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
}
