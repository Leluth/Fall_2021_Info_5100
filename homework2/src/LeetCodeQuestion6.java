import java.util.HashMap;
import java.util.Map;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: LeetCodeQuestion6
 * @date 2021/10/3 11:00
 */
public class LeetCodeQuestion6 {
    public static void main(String[] args) {
        LeetCodeQuestion6 solution = new LeetCodeQuestion6();
        System.out.println(solution.isIsomorphic("egg", "add"));
        System.out.println(solution.isIsomorphic("abcdefghijklmnopqrstuvwxyzva", "abcdefghijklmnopqrstuvwxyzck"));
    }

    // n is the length of input String
    // Time: O(n)
    // Space: O(n)
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() != t.length()) {
            return false;
        }
        return transform(s).equals(transform(t));
    }

    private String transform(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            if (!map.containsKey(c1)) {
                map.put(c1, i);
            }
            sb.append(map.get(c1));
            sb.append(" ");
        }
        return sb.toString();
    }
}
