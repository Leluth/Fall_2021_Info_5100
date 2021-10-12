/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: LeetCodeQuestion8
 * @date 2021/10/3 11:01
 */
public class LeetCodeQuestion8 {
    public static void main(String[] args) {
        LeetCodeQuestion8 solution = new LeetCodeQuestion8();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome( "race a car"));
    }

    // n is the length of input String
    // Time: O(n)
    // Space: O(1)
    public boolean isPalindrome(String s) {
        for (int left = 0, right = s.length() - 1; left < right; left++, right--) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
        }

        return true;
    }
}
