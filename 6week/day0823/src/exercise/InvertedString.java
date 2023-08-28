package exercise;

import java.util.Scanner;

public class InvertedString {
    public static void main(String[] args) {
        // 将一个字符串逆序输出 例如: abcd --> dcba
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
//        inverted(str);
        System.out.println(inverted(str));
    }
    /**
     * 将字符串保存为一个字符数组，再转化为字符串输出
     * @param str 获取一个字符串
     * @return 返回一个字符串
     */
    public static String inverted(String str){
//        for (int i = str.length()-1; i >=0; i--) {
//            System.out.print(str.charAt(i));
//        }
        char[] chars=new char[str.length()];
        for (int i = 0; i <str.length(); i++) {
            chars[i]=str.charAt(str.length()-i-1);
//            System.out.print(str.charAt(str.length()-i-1));
        }
        return new String(chars);
    }
}
