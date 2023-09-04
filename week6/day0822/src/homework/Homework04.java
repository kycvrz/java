package homework;

import java.nio.charset.Charset;

public class Homework04 {
    public static void main(String[] args) {
        // getBytes(Charset charset)
        String str = "你好，世界！";
        Charset utfCharset = Charset.forName("UTF-8");
        byte[] byteArray = str.getBytes(utfCharset); // 使用 UTF-8 字符集将字符串转换为字节数组
        for (byte b : byteArray) {
            System.out.print(b + " "); // 输出字节数组中的每个字节
        }
        // getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        String str1 = "Hello, world!";
        char[] charArray = new char[5]; // 创建一个字符数组用于存储复制的字符数据
        str1.getChars(0, 5, charArray, 0); // 复制索引 0 到 4 的字符到字符数组
        for (char c : charArray) {
            System.out.print(c); // 输出存储在字符数组中的字符
        }
        // hashCode()
        String str3 = "hello";
        String str4 = "world";
        int hashCode1 = str3.hashCode(); // 获取字符串 "hello" 的哈希码
        int hashCode2 = str4.hashCode(); // 获取字符串 "world" 的哈希码
        System.out.println("'hello': " + hashCode1);// 99162322
        System.out.println("'world': " + hashCode2);// 113318802
        // indexOf(int ch)
        String str5 = "Hello, world!";
        int index = str5.indexOf('o'); // 查找字符 'o' 在字符串中的索引位置
        System.out.println("'o': " + index); // 输出索引位置
        int notFoundIndex = str5.indexOf('z'); // 查找字符 'z' 在字符串中的索引位置
        System.out.println("'z': " + notFoundIndex); // 输出 -1，表示未找到
        // indexOf(int ch, int fromIndex)
        String str6 = "Hello, world!";
        int index1 = str6.indexOf('o', 0); // 从索引位置 0 开始查找字符 'o'
        System.out.println("'o': " + index1);
        int index2 = str6.indexOf('o', 5); // 从索引位置 5 开始查找字符 'o'
        System.out.println("'o': " + index2);
        // indexOf(String str)
        String str7 = "Hello, world!";
        int index3 = str7.indexOf("world"); // 查找子字符串 "world" 在字符串中的索引位置
        System.out.println("'world': " + index3); // 7 输出索引位置
        int notFoundIndex1 = str7.indexOf("Java"); // 查找子字符串 "Java" 在字符串中的索引位置
        System.out.println("'Java': " + notFoundIndex1); // -1 输出 -1，表示未找到
        // indexOf(String str, int fromIndex)
        String str8 = "Hello, world!";
        int index4 = str8.indexOf("o", 0); // 从索引位置 0 开始查找子字符串 "o"
        System.out.println("'o': " + index4);// 4
        int index5 = str8.indexOf("o", 5); // 从索引位置 5 开始查找子字符串 "o"
        System.out.println("'o': " + index5);// 8
        // isBlank()
        String str9 = "   ";
        String str10 = "Hello, world!";
        String str11 = "";
        System.out.println(str9.isBlank()); // true
        System.out.println(str10.isBlank()); // false
        System.out.println(str11.isBlank()); // true
        // isEmpty()
        String str12 = "Hello, world!";
        String str13 = "";
        System.out.println(str12.isEmpty()); // false
        System.out.println(str13.isEmpty()); // true
        // lastIndexOf(int ch)
        String str14 = "Hello, world!";
        int lastIndex = str14.lastIndexOf('o'); // 查找字符 'o' 在字符串中最后一次出现的索引位置
        System.out.println("'o': " + lastIndex); // 8 输出索引位置
        int notFoundIndex3 = str.lastIndexOf('z'); // 查找字符 'z' 在字符串中的索引位置
        System.out.println("'z': " + notFoundIndex3); // -1 输出 -1，表示未找到
        // lastIndexOf(int ch, int fromIndex)
        String str15 = "Hello, world! Hello!";
        int lastIndex1 = str15.lastIndexOf('o', str.length() - 1); // 从字符串末尾开始查找字符 'o'
        System.out.println("'o'" + lastIndex1);// 4
        int lastIndex2 = str15.lastIndexOf('o', 10); // 从索引位置 10 开始查找字符 'o'
        System.out.println("'o'" + lastIndex2);// 8
        // lastIndexOf(String str)
        String str16 = "Hello, world! Hello!";
        int lastIndex3 = str16.lastIndexOf("Hello"); // 查找子字符串 "Hello" 在字符串中最后一次出现的索引位置
        System.out.println("'Hello': " + lastIndex3); // 14 输出索引位置
        int notFoundIndex4 = str16.lastIndexOf("Java"); // 查找子字符串 "Java" 在字符串中的索引位置
        System.out.println("'Java': " + notFoundIndex4); // -1 输出 -1，表示未找到
        // lastIndexOf(String str, int fromIndex)
        String str17 = "Hello, world! Hello!";
        int lastIndex5 = str17.lastIndexOf("Hello", str.length() - 1); // 从字符串末尾开始查找子字符串 "Hello"
        System.out.println("'Hello': " + lastIndex5);// 0
        int lastIndex6 = str17.lastIndexOf("Hello", 10); // 从索引位置 10 开始查找子字符串 "Hello"
        System.out.println("'Hello': " + lastIndex6);// 0
        // length()
//        String str = "Hello, world!";
//        int length = str.length(); // 获取字符串的长度
//        System.out.println("Length of the string: " + length);
//        // repeat(int count)
//        String str = "Hello";
//        String repeatedStr = str.repeat(3); // 将字符串重复生成3次
//        System.out.println("Repeated string: " + repeatedStr);
//        // replace(char oldChar, char newChar)
//        String str = "Hello, world!";
//        String replacedStr = str.replace('o', 'x'); // 将字符串中的字符 'o' 替换为字符 'x'
//        System.out.println("Replaced string: " + replacedStr);
//        // replace(CharSequence target, CharSequence replacement)

    }
}

