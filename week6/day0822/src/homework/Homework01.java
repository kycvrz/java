package homework;

public class Homework01 {
    public static void main(String[] args) {
        charAt();
        compareTo();
        compareToIgnoreCase();
        concat();
        contains();
        copyValueOf();
    }
    public static void charAt(){
        // charAt(int index) 查找下标对应的字符
        String str="Hello,world";
        System.out.println(str.charAt(10));// d
    }
    public static void compareTo(){
        // compareTo(String anotherString) 比较两个字符的值 返回值
        // 字母 A 到 Z 对应的 ASCII 值依次为 65 到 90，
        // A:65 B:66 C:67 D:68 E:69 F:70 G:71 H:72 I:73 J:74 K:75 L:76 M:77
        // N:78 O:79 P:80 Q:81 R:82 S:83 T:84 U:85 V:86 W:87 X:88 Y:89 Z:90
        String str3="HELLO"; // H:72
        String str4="WORLD"; // W:87
        String str5="HELLO";
        System.out.println(str3.compareTo(str4));// 72-87=-15
        System.out.println(str4.compareTo(str3));// 87-72=15
        System.out.println(str3.compareTo(str5));// 全部相等，相减都是0 所以返回0
        // 字母 a 到 z 对应的 ASCII 值依次为 97 到 122。
        // a:97 b:98 c:99 d:100 e:101 f:102 g:103 h:104 i:105 j:106 k:107 l:108 m:109
        // n:110 o:111 p:112 q:113 r:114 s:115 t:116 u:117 v:118 w:119 x:120 y:121 z:122
        String str1="hello"; // h:104
        String str2="world"; // w:119
        String str6="world";
        System.out.println(str1.compareTo(str2));// 104-119=-15
        System.out.println(str2.compareTo(str1));// 119-104=15
        System.out.println(str2.compareTo(str6));// 全部相等 相减都是0 所以返回0
        String str7=new String("你好");
        String str8=new String("您好");
        System.out.println(str7.compareTo(str8));
    }
    public static void compareToIgnoreCase(){
        // compareToIgnoreCase(String str) 比较两个字符的对应的Unicode值 返回值 会忽略字母的大小(先转化为小写再进行比较)
        String str1="Hello";
        String str2="hello";
        String str3="world";
        System.out.println(str1.compareToIgnoreCase(str2)); // 0
        System.out.println(str1.compareToIgnoreCase(str3)); // -15
    }
    public static void concat(){
        // concat(String str) 字符串的拼接
        String str1="hello";
        String str2="world";
        System.out.println(str1.concat(str2));// helloworld
    }
    public static void contains(){
        // contains(CharSequence s) 字符串中包含该字符则返回true，不包含则返回false 区分大小写
        String str="Hello,world";
        System.out.println(str.contains("Hello"));// 包含Hello 返回true
        System.out.println(str.contains("WORLD")); // 不包含WORLD 返回false
    }
    public static void copyValueOf(){
        // copyValueOf(char[] date) 将一个字符数组拼接成一个字符串
        char[] chars=new char[]{'k','a','i','f','a','m','i','a','o'};
        System.out.println(String.copyValueOf(chars));// kaifamiao
    }

}
