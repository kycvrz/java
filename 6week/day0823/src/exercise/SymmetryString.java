package exercise;

import java.util.Scanner;

public class SymmetryString {
    public static void main(String[] args) {
        // 对称字符串
        // 请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
        // 例如：“abcba”、"上海自来水来自海上"均为对称字符串。
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串来判断是否对称");
        String str=sc.next();
        boolean str1=symmetryString(str);
        System.out.println("你输入的字符串是对称的吗？"+str1);
    }
    public static boolean symmetryString(String str){
        if (str==null || str.isBlank() || str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
