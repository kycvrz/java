package exec;

import java.util.Scanner;

public class Exec02 {
    public static void main(String[] args) {
        // 编写一个函数，接受一个包含括号字符的字符串，判断括号是否匹配有效。
        // 例如，"()[]{}" 是有效的，但 "(]" 是无效的。
        // 输入："()[]{}"
        // 输出：true
        // 输入："(]"
        // 输出：false
        // 输入："{[()]}"
        // 输出：true
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个包含括号的字符串");
        String str = sc.nextLine();
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str) {
        // 用栈的思想去解决
        char[] chars = new char[str.length()];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                chars[count++] = c;
            } else if (c == ')') {
                if (count == 0) {
                    return false;
                }
                if (chars[count - 1] == '(') {
                    chars[--count] = ' ';
                }
            }
            if (c == '{') {
                chars[count++] = c;
            } else if (c == '}') {
                if (count == 0) {
                    return false;
                }
                if (chars[count - 1] == '{') {
                    chars[--count] = ' ';
                }
            }
            if (c == '[') {
                chars[count++] = c;
            } else if (c == ']') {
                if (count == 0) {
                    return false;
                }
                if (chars[count - 1] == '[') {
                    chars[--count] = ' ';
                }
            }
        }
        return count == 0;
    }

    public static boolean isValid1(String str) {
        if (str == null) {
            return false;
        }
        if (str.isBlank() || str.isEmpty()) {
            return true;
        }
        str = str.replace(" ", "");
        while (str.contains("()") || str.contains("{}") || str.contains("[]")) {
            str = str.replace("{}", "");
            str = str.replace("()", "");
            str = str.replace("[]", "");
        }
        return str.isEmpty() || str.isBlank();
    }
}
