package homework;

import java.sql.SQLOutput;

public class Homework02 {
    public static void main(String[] args) {
        copyValueOf();
        endWith();
        equals();
        equalsIgnoreCase();
    }
    public static void copyValueOf(){
        // copyValueOf(char[] date,int offset,int count) 从指定的下标开始，复制指定数量的字符,并且拼接起来，数量不能超过长度数组长度-偏移量
        char[] chars=new char[]{'h','e','l','l','o','w','o','r','l','d'};
        System.out.println(String.copyValueOf(chars,5,5));
    }
    public static void endWith(){
        // endWith(String suffix) 检查当前字符是不是以字符串末尾结束，如果是返回true，不是返回false，区分大小写
        String str="hello,world";
        System.out.println(str.endsWith("world"));// true
        System.out.println(str.endsWith("hello"));// false
        System.out.println(str.endsWith("hello"));// false
    }
    public static void equals(){
        // equals() 比较两个字符串是否相等 区分大小写
        String str1="hello";
        String str2="hello";
        String str3="world";
        String str4=new String("world");
        String str5="Hello";
        System.out.println(str1.equals(str2));// true
        System.out.println(str1.equals(str3));// false
        System.out.println(str3.equals(str4));// true
        System.out.println(str1.equals(str5));// false
    }
    public static void equalsIgnoreCase(){
        // equalsIgnoreCase(String anotherString) 比较两个字符串是否相等 不区分大小写
        String str1="hello";
        String str2="Hello";
        String str3="world";
        String str4=new String("world");
        System.out.println(str1.equalsIgnoreCase(str2));// true
        System.out.println(str1.equalsIgnoreCase(str3));// false
        System.out.println(str3.equalsIgnoreCase(str4));// true
    }
}
