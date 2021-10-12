/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: LeetCodeQuestion9
 * @date 2021/10/3 11:02
 */
public class LeetCodeQuestion9 {
    public static void main(String[] args) {
        LeetCodeQuestion9 solution = new LeetCodeQuestion9();
        System.out.println(solution.reverseWords("    string      ssss     12     "));
        System.out.println(solution.reverseWords( "a good   example"));
    }

    // n is the length of input String
    // Time: O(n)
    // Space: O(n)
    public String reverseWords(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        char[] array = s.toCharArray();
        int left = 0;
        int right = array.length - 1;
        while (left < right && !Character.isLetterOrDigit(array[left])) {
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(array[right])) {
            right--;
        }
        reverse(array, left, right);

        StringBuilder sb = new StringBuilder();
        while (left <= right) {
            int curRight = left;
            while (curRight <= right && Character.isLetterOrDigit(array[curRight])) {
                curRight++;
            }
            reverse(array, left, curRight - 1);
            sb.append(array, left, curRight - left);
            sb.append(" ");
            left = curRight;
            while (left <= right && !Character.isLetterOrDigit(array[left])) {
                left++;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private void reverse(char[] array, int left, int right) {
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
