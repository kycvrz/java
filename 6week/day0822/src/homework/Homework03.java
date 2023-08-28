package homework;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Homework03 {
    public static void main(String[] args)  {
        format();
        getBytes();
        getBytes1();
//        getBytes2();
    }
    public static void format(){
        // format(String format, Object... args) %s表示字符串 %d表示整数
        String name="张三";
        int age=18;
        double salary=8;
        System.out.println(String.format("我叫%s，今年%d岁,一个月工资%f.",name,age,salary));
    }
    public static void formatted(){

    }
    public static void getBytes(){
        // getBytes() 将一个字符串转化为字节数组
        String str = "Hello, world!";
        byte[] byteArray = str.getBytes(); // 将字符串转换为字节数组
        for (byte a : byteArray) {
            System.out.print(a + " "); // 72 101 108 108 111 44 32 119 111 114 108 100 33
            // 输出字节数组中的每个字节(每个字母对应的Unicode值)
        }
    }
    public static void getBytes1(){
        // getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin)
        String str = "Hello, world!";
        byte[] byteArray = new byte[8]; // 创建一个字节数组用于存储转换后的数据
        str.getBytes(0, 5, byteArray, 3); // 提取索引 0 到 4 的字符并转换为字节数组
        for (byte a : byteArray) {
            System.out.print(a + "\t"); // 输出存储在字节数组中的字节数据
        }
    }
//    public static void getBytes2(){
//        //getBytes(String charsetName)
//        String str = "你好，世界！";
//        byte[] byteArray = str.getBytes("UTF-8"); // 使用 UTF-8 编码将字符串转换为字节数组
//        for (byte b : byteArray) {
//            System.out.print(b + "\t"); // 输出字节数组中的每个字节
//        }
//    }
}
