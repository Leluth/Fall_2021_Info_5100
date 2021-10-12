/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: LeetCodeQuestion7
 * @date 2021/10/3 11:01
 */
public class LeetCodeQuestion7 {
    public static void main(String[] args) {
        LeetCodeQuestion7 solution = new LeetCodeQuestion7();
        System.out.println(solution.addStrings("11", "123"));
        System.out.println(solution.addStrings("0", "0"));
    }

    // m is the length of num1, n is the length of num1
    // Time: O(max(m, n))
    // Space: O(max(m, n))
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        while (len1 >= 0 || len2 >= 0 || carry != 0) {
            int value1 = len1 >= 0 ? num1.charAt(len1) - '0' : 0;
            int value2 = len2 >= 0 ? num2.charAt(len2) - '0' : 0;
            int value = (value1 + value2 + carry) % 10;
            carry = (value1 + value2 + carry) / 10;
            sb.append(value);
            len1--;
            len2--;
        }
        return sb.reverse().toString();
    }
}
