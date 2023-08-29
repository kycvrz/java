package exec;

import java.util.Scanner;

public class Exec01 {
    public static void main(String[] args) {
        // 给定两个字符串，编写一个函数来获取这两个字符串的最长公共子序列。
        // 例如：
        // 输入 ： "abcde" "ace"
        // 输出 ： "ace"
        // 输入："abc"  "def"
        // 输出：""
        // 输入："AGGTAB" "GXTXAYB"
        // 输出："GTAB"
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1=sc.next();
        System.out.println("请再输入一个字符串");
        String str2=sc.next();
        String str=longestCommonSubsequence(str1,str2);
        System.out.println(1);
        System.out.println(str);
    }
    public static String longestCommonSubsequence(String str1,String str2){
        // 思路
        // 第一种情况 当长度相同时
        // 1.找出两个字符串中长度短的字符串
//        str1=str1.replace(" ","");
//        str2=str2.replace(" ","");
        String str="";
        if (str1.length()!=str2.length()){
            String shortStr="";
            String longStr="";
            // 判断长度
            if (str1.length()<str2.length()){
                shortStr=str1;
                longStr=str2;
            }else{
                shortStr=str2;
                longStr=str1;
            }
            // 2.再用短字符串的每个字符去长字符串找包不包含该字符,如果包含,则继续再找下一个,
            // 如果不包含则最长公共序列就是当前字符前面的
            for (int i = 0; i < shortStr.length(); i++) {
                if (longStr.indexOf(shortStr.charAt(i))==-1){
                    break;
                }else {
                    str=shortStr.substring(0,i+1);
                }
            }
        }else{
            // 输入："AGGTAB" "GXTXAYB"
            // 输出："GTAB"
            // 第二种情况 长度相同时
            // 1.第一步，先找出第一个(两个字符串中相同字符)的位置
            for (int i = 0; i < str1.length(); i++) {
                String str11="";
                String str22="";
                if (str2.indexOf(str1.charAt(i))!=-1){
                    int str1Index1=i;
                    int str2Index2=str2.indexOf(str1.charAt(i));
                    str11=str1.substring(str1Index1);
                    str22=str2.substring(str2Index2);
                }
            }
        }
        return str;
    }
}
