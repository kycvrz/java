import java.util.*;

public class Anagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();

        // 统计字符串s中每个字符的出现次数
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 检查字符串t中的每个字符
        for (char c : t.toCharArray()) {
            // 如果字符在map中不存在，或者出现的次数已经为0
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1); // 减少对应字符的计数
        }
        System.out.println(map.values());
        // 检查map中所有计数是否为0
        return map.values().stream().allMatch(count -> count == 0);
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram("anagram", "nagaram")); // true
        System.out.println(anagram.isAnagram("rat", "car")); // false
    }
}
