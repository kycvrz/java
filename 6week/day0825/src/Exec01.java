import java.util.Scanner;

public class Exec01 {
    public static void main(String[] args) {
        // 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串,找出不重复的子串");
        String str=sc.next();
        System.out.println(lengthIsNotRepetition(str));
    }
    public static int lengthIsNotRepetition(String str){
        int length=0;
        String longestSubstring = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String str1=str.substring(i,j);
                if (isNotRepetition(str1) && str1.length()>length){
                    length=str1.length();
                    longestSubstring=str1;
                }
            }
        }
        System.out.println(longestSubstring);
        return length;
    }
    public static boolean isNotRepetition(String str){// 判断字符串中是否重复
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
