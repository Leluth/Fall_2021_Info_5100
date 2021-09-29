import java.util.HashMap;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question4Solution
 * @date 2021/9/26 11:21
 */
public class Question4Solution {
    public static void main(String[] args) {
        Question4Solution solution = new Question4Solution();
        System.out.println(solution.canConstruct("a", "b"));
        System.out.println(solution.canConstruct("aa", "aab"));
    }

    // m is the length of ransomNote, n is the length of magazine
    // Time: O(m + n)
    // Space: O(m)
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null || ransomNote.length() > magazine.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            int newF = map.getOrDefault(c, 0) + 1;
            map.put(c, newF);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (map.containsKey(c) && map.get(c)> 0) {
                map.put(c, map.get(c) - 1);
            }
        }
        for (int val : map.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}
