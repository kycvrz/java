package exec;

import java.util.HashMap;
import java.util.function.BiFunction;

public class Exec02 {
    public static void main(String[] args) {
        // 输⼊⼀个字符串，统计字符串中每个字符出现的次数.最后输出结果
        String str = "bidjwijdjnsdjibhsdhnjk";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            hashMap.compute(c, new BiFunction<Character, Integer, Integer>() {
                @Override
                public Integer apply(Character key, Integer value) {
                    return value == null ? 1 : value + 1;
                }
            });
        }
        System.out.println(hashMap);
    }
}
