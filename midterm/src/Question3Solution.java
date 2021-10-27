import java.util.HashMap;
import java.util.Map;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question3Solution
 * @date 2021/10/26 19:09
 */
public class Question3Solution {
    public static void main(String[] args) {
        Question3Solution question3Solution = new Question3Solution();
        int[] array = new int[]{1,3,-1,3,4,-1};
        System.out.println(question3Solution.sumOfRepeatedNumbers(array));
        array = new int[]{1,1,1,1,1};
        System.out.println(question3Solution.sumOfRepeatedNumbers(array));
        array = new int[]{1,2};
        System.out.println(question3Solution.sumOfRepeatedNumbers(array));
        array = new int[]{1};
        System.out.println(question3Solution.sumOfRepeatedNumbers(array));
    }

    private int sumOfRepeatedNumbers(int[] array) {
        int res = 0;
        if (array == null || array.length <= 1) {
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                res += key;
            }
        }
        return res;
    }
}
