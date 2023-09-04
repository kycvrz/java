package exercise;

import java.util.Scanner;

public class Exec04 {
    public static void main(String[] args) {
        // 给定一个只包括 ‘(‘，’)’ 的字符串，判断字符串是否有效。
        // 有效字符串需满足：
        // 1.左括号必须⽤相同类型的右括号闭合。
        // 2.左括号必须以正确的顺序闭合。
        // 3.注意空字符串可被认为是有效字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个包含括号的字符串,判断是否输入的正确");
        String str=sc.next();
//        System.out.println(bracket(str));

    }
    public static boolean bracket(String s){
        s=s.replace(" ","");// 将空格替换为空字符
        while (s.contains("()")) {
            s = s.replace("\\(\\)", "");// 将括号替换为空字符
        }
        // isEmpty() 判断是否有有效的空字符串
        // isBlank() 判断
        return s.isEmpty() || s.isBlank();// 是否有空字符
    }
    public static boolean isValid(String s){
        while (s.contains("[]") || s.contains("{}")){
            s=s.replace("[]", "").replace("{}", "");
        }
        return s.isEmpty();
    }
}
