/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question5Solution
 * @date 2021/9/26 11:21
 */
public class Question5Solution {
    public static void main(String[] args) {
        Question5Solution solution = new Question5Solution();
        System.out.println(solution.validString("1A3d4s5t"));
        System.out.println(solution.validString("A2bb2d4"));
    }

    public boolean validString(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        int slow = 0;
        int fast = 1;
        while (fast < s.length() - 1) {
            char l = s.charAt(slow++);
            char r = s.charAt(fast++);
            if (isDigit(l) && isDigit(r) || (isLetter(l) && isLetter(r))) {
                return false;
            }
        }
        return true;
    }

    private boolean isDigit(char c) {
        return c - '0' < 10 && c >= '0';
    }

    private boolean isLetter(char c) {
        return c - 'a' < 26 && c >= 'a' || (c - 'A' < 26 && c >= 'A');
    }
}
