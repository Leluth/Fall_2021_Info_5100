import java.util.HashSet;
import java.util.Set;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question4Solution
 * @date 2021/10/26 19:16
 */
public class Question4Solution {
    public static void main(String[] args) {
        Question4Solution question4Solution = new Question4Solution();
        System.out.println(question4Solution.longestSubStringWithoutDuplicateChars("abcabcbb"));
        System.out.println(question4Solution.longestSubStringWithoutDuplicateChars("aaaaa"));
        System.out.println(question4Solution.longestSubStringWithoutDuplicateChars("aaaab"));
        System.out.println(question4Solution.longestSubStringWithoutDuplicateChars("abcddefghijk"));
    }

    private String longestSubStringWithoutDuplicateChars(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int globalLeft = 0;
        int globalRight = 0;
        int curLeft = 0;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(curLeft));
        for (int curRight = 1; curRight < s.length(); curRight++) {
            char cur = s.charAt(curRight);
            if (set.contains(cur)) {
                do {
                    set.remove(s.charAt(curLeft++));
                } while (s.charAt(curLeft - 1) != cur);
            }
            set.add(cur);
            if ((curRight - curLeft) > (globalRight - globalLeft)) {
                globalLeft = curLeft;
                globalRight = curRight;
            }
        }
        return s.substring(globalLeft, globalRight + 1);
    }
}
