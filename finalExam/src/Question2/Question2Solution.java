package Question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question2Solution
 * @date 2021/12/14 19:21
 */
public class Question2Solution {
    public static void main(String[] args) {
        Question2Solution solution = new Question2Solution();
        String[] arrays = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution.groupAnagrams(arrays));

        arrays = new String[]{""};
        System.out.println(solution.groupAnagrams(arrays));

        arrays = new String[]{"a"};
        System.out.println(solution.groupAnagrams(arrays));

        arrays = new String[]{"tta", "att", "at", "ta"};
        System.out.println(solution.groupAnagrams(arrays));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return res;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 26; j++) {
                sb.append(count[j]);
            }
            String code = sb.toString();
            map.putIfAbsent(code, new ArrayList<>());
            map.get(code).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}
