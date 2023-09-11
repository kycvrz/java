package exec;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class Exec01 {
    public static void main(String[] args) {
        // 给定一个字符串数组,使用 Stream 把所有字符串拼接成一个字符串。
        String[] arr = {"a", "b", "c","d"};
        String str=Arrays.stream(arr).reduce(new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return s + s2;
            }
        }).get();
        System.out.println(str);
    }
}
