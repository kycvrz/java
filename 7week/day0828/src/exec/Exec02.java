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
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个包含括号的字符串");
        String str=sc.next();
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str){
        if (str.contains("()") || str.contains("{}") || str.contains("[]")){
            return true;
        }
        return false;
    }
}
