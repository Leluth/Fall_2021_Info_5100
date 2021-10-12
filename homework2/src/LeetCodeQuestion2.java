import java.util.HashMap;
import java.util.Map;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: LeetCodeQuestion2
 * @date 2021/10/3 10:57
 */
public class LeetCodeQuestion2 {
    public static void main(String[] args) {
        LeetCodeQuestion2 solution = new LeetCodeQuestion2();
        System.out.println(solution.shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},
                "coding", "practice"));
        System.out.println(solution.shortestDistance(new String[]{"practice", "practice", "coding"},
                "coding", "practice"));
    }

    // m is the length of wordsDict, n is the total length of word1 and word2
    // Time: O(m * n)
    // Space: O(1)
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        if (wordsDict == null || wordsDict.length == 0 || word1 == null || word2 == null) {
            return Integer.MAX_VALUE;
        }
        int index1 = -1, index2 = -1;
        int minDistance = wordsDict.length;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                index1 = i;
            } else if (wordsDict[i].equals(word2)) {
                index2 = i;
            }
            if (index1 != -1 && index2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(index1 - index2));
            }
        }
        return minDistance;
    }
}
