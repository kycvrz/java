package exercise;

import java.util.Scanner;

public class CutFile {
    public static void main(String[] args) {
        // 定义一个用于截取文件后缀名的方法, 传入一个字符串的文件名( hello.java),返回一个字符串。
        // 获取.最后一次出现的位置
        // substring()
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要截取的文件名");
        String str=sc.next();
        System.out.println(cutFile(str));
    }
    /**
     * 找出最后一次出现.的位置并截取
     * @param str 获取一个字符串
     * @return 返回一个字符串
     */
    public static String cutFile(String str){
//        int index=str.lastIndexOf(".");
//        return str.substring(0,index);// 截取文件名
        return str.substring(str.lastIndexOf(".")+1);// 截取文件后缀名
    }
}
