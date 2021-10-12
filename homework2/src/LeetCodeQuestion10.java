/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: LeetCodeQuestion10
 * @date 2021/10/3 11:02
 */
public class LeetCodeQuestion10 {
    public static void main(String[] args) {
        LeetCodeQuestion10 solution = new LeetCodeQuestion10();
        System.out.println(solution.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println(solution.compress(new char[]{'a'}));
        System.out.println(solution.compress(new char[]{'a','a','a','a','a','a','a','a','a','a','a','a','b'}));
    }

    // n is the length of input String
    // Time: O(n)
    // Space: O(1)
    public int compress(char[] chars) {
        int left = 0;
        for (int right = 0; right < chars.length; right++) {
            chars[left++] = chars[right];
            int count = 1;
            while (right < chars.length - 1 && chars[right + 1] == chars[right]) {
                count++;
                right++;
            }
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (int index = 0; index < countStr.length(); index++) {
                    chars[left++] = countStr.charAt(index);
                }
            }
        }
        return left;
    }
}
