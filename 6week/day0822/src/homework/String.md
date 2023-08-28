**String类的方法**

`charAt(int index)`：获取字符串中对应下标的字符(内容)，返回值是一个字符型(char类型)的内容

```java
public class Demo {
    public static void main(String[] args) {
        // charAt(int index)
        String str="Hello,world";
        System.out.println(str.charAt(10));// d
    }
}
```
`compareTo(String anotherString)`：比较当前字符串与另一个字符串的字典顺序(按字符的Unicode值比较),返回一个整数值，表示比较的结果。从第一个字符依次去比较,当第一个字符不相等的时候直接返回（前一个字符串的第一个字符的值减去第二个字符串的第一个字符的值），后面的不再去比较，直接返回相减的值，当相等时再去比较第二个字符依次类推，当全部相等的时候返回0。

```java
public class Demo {
    public static void main(String[] args) {
        compareTo();
    }
    public static void compareTo(){
        // compareTo(String anotherString) 比较两个字符的数量 返回数量
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
    }
}
```
`compareToIgnoreCase(String str)`：用于比较当前字符串与另一个字符串的字典顺序，但在比较时忽略字母的大小写(都会转化为小写去进行比较)。该方法返回一个整数值，用于表示比较的结果，与 compareTo() 方法类似。
```java
public class Demo {
    public static void main(String[] args) {
        compareToIgnoreCase();
    }
    public static void compareToIgnoreCase(){
        // compareToIgnoreCase(String str) 比较两个字符的对应的Unicode值 返回值 会忽略字母的大小
        String str1="Hello";
        String str2="hello";
        String str3="world";
        System.out.println(str1.compareToIgnoreCase(str2)); // 0
        System.out.println(str1.compareToIgnoreCase(str3)); // H先转化为h：104 w：119 104-119=-15
    }
}
```
`concat(String str)`：用于将当前字符串与另一个字符串进行拼接（连接）。它将另一个字符串添加到当前字符串的末尾，返回一个新的字符串。
```java
public class Demo {
    public static void main(String[] args) {
        concat();
    }
    public static void concat(){
        // concat(String str) 字符串的拼接
        String str1="hello";
        String str2="world";
        System.out.println(str1.concat(str2));// helloworld
    }
}
```
`contains(CharSequence s)`：用于检查当前字符串是否包含指定的子串 s。它返回一个布尔值，表示是否包含该子串。字符串中包含该字符则返回true，不包含则返回false,区分大小写.
```java
public class Demo {
    public static void main(String[] args) {
        contains();
    }
    public static void contains(){
        // contains(CharSequence s) 字符串中包含该字符则返回true，不包含则返回false 区分大小写
        String str="Hello,world";
        System.out.println(str.contains("Hello"));// 包含Hello 返回true
        System.out.println(str.contains("WORLD")); // 不包含WORLD 返回false
    }
}
```
`copyValueOf(char[] date)`：用于从字符数组中创建一个新的字符串。它接受一个 char 数组作为参数，并返回一个包含数组内容的字符串。
```java
public class Demo {
    public static void main(String[] args) {
        // copyValueOf(char[] date) 将一个字符数组拼接成一个字符串
        char[] chars=new char[]{'k','a','i','f','a','m','i','a','o'};
        copyValueOf(chars);
    }
    public static void copyValueOf(char[] chars){
        System.out.println(String.copyValueOf(chars));// kaifamiao
    }
}
```
`copyValueOf(char[] date,int offset,int count)`：String的静态方法，用于从指定的字符数组中创建一个新的字符串，从指定的偏移量开始，复制指定数量的字符。它接受三个参数：字符数组 data、偏移量(下标) offset 和字符数 count(不能超过数组长度减去偏移量也就是复制的开始下标)，并返回一个包含复制字符的字符串。
```java
public class Demo {
    public static void main(String[] args) {
        copyValueOf();
    }
    public static void copyValueOf(){
        // copyValueOf(char[] date,int offset,int count) 从指定的下标开始，复制指定数量的字符,并且拼接起来，数量不能超过长度数组长度-偏移量
        char[] chars=new char[]{'h','e','l','l','o','w','o','r','l','d'};
        System.out.println(String.copyValueOf(chars,5,5));
    }
}
```
`endWith(String suffix)`：用于检查当前字符串是否以指定的后缀字符串 suffix 结尾。它返回一个布尔值，表示字符串是否以指定后缀结尾，区分大小写
```java
public class Demo {
    public static void main(String[] args) {
        endWith();
    }
    public static void endWith(){
        // endWith(String suffix) 检查当前字符是不是以字符串末尾结束，如果是返回true，不是返回false，区分大小写
        String str="hello,world";
        System.out.println(str.endsWith("world"));// true
        System.out.println(str.endsWith("hello"));// false
        System.out.println(str.endsWith("hello"));// false
    }
}
```
`equals(Object anObject)`：用于比较当前字符串与另一个对象是否相等。它接受一个参数 anObject，可以是任何对象，但通常情况下应该是另一个字符串对象,区分大小写。
```java
public class Demo {
    public static void main(String[] args) {
        equals();
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
}
```
`equalsIgnoreCase(String anotherString)`：用于比较当前字符串与另一个字符串是否相等，但忽略大小写。它会将当前字符串和传入的字符串都转换为小写（或大写），然后再进行比较，从而实现不区分大小写的比较。
```java
public class Demo {
    public static void main(String[] args) {
        equalsIgnoreCase();
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
```
`
format(String format, Object... args)`：String中的静态方法，用于将格式化字符串替换为指定的参数，并返回一个格式化后的新字符串。它接受一个格式字符串 format 和一个可变参数列表 args，用于指定要替换格式字符串中的占位符。 格式字符串中的占位符由 % 开始，并由格式说明符指定，例如 %d 表示整数，%s 表示字符串等。每个占位符都会被 args 中的参数替换
- %d: 表示整数类型（decimal），用于替换整数值。
- %f: 表示浮点数类型，用于替换浮点数值。
- %s: 表示字符串类型，用于替换字符串值。
- %c: 表示字符类型，用于替换字符值。
- %b: 表示布尔类型，用于替换布尔值。
- %x: 表示十六进制整数类型，用于替换整数值的十六进制表示。
- %o: 表示八进制整数类型，用于替换整数值的八进制表示。
```java
public class Demo {
    public static void main(String[] args) {
        format();
    }
    public static void format(){
        // format(String format, Object... args) %s表示字符串 %d表示整数
        String name="张三";
        int age=18;
        double salary=8000;
        System.out.println(String.format("我叫%s，今年%d岁,一个月工资%f.",name,age,salary));// 我叫张三，今年18岁,一个月工资8000.000000.
    }
}
```
`formatted(Object... args)`：

```java

```
`getBytes()`:用于将字符串转换为字节数组。它会返回表示字符串的字节数组，使用默认的字符编码。
```java
public class Demo {
    public static void main(String[] args) {
        getBytes();
    }
    public static void getBytes(){
        // getBytes() 将一个字符串转化为字节数组
        String str = "Hello, world!";
        byte[] byteArray = str.getBytes(); // 将字符串转换为字节数组
        for (byte b : byteArray) {
            System.out.print(b + " "); // 72 101 108 108 111 44 32 119 111 114 108 100 33 
            // 输出字节数组中的每个字节(每个字母对应的Unicode值)
        }
    }
}
```
`getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin)`：用于将指定范围内的字符转换为字节数组，并将结果存储到另一个字节数组中的指定位置。这个方法允许您从字符串中提取特定范围的字符并将其转换为字节数组。
- srcBegin: 要提取的字符的起始索引。
- srcEnd: 要提取的字符的结束索引（不包括该索引对应的字符）。
- dst: 目标字节数组，用于存储转换后的字节数据。
- dstBegin: 目标字节数组中存储结果的起始位置。
- 当你要复制的在字节数组的位置不是0时，字节数组的长度一定要大于等于(结束位置的下标加复制字节数组中开始位置的下标)
```java
public class Demo {
    public static void main(String[] args) {
        // getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin)
        // srcBegin起始位置的下标 srcEnd结束位置的下标 dst 字节数组 dstBegin字节数组的起始位置就是下标
        String str = "Hello, world!";
        byte[] byteArray = new byte[5]; // 创建一个字节数组用于存储转换后的数据
        str.getBytes(0, 5, byteArray, 0); // 提取索引 0 到 4 的字符并转换为字节数组
        for (byte a : byteArray) {
            System.out.print(a + "\t"); // 72 101 108 108 111  输出存储在字节数组中的字节数据
        }
    }
}
```
`getBytes(String charsetName)`：用于将字符串转换为字节数组，并使用指定的字符编码进行转换。它允许您使用特定的字符编码将字符串转换为字节数组，以便在不同字符编码之间进行转换
```java
public class Demo {
    public static void main(String[] args) {
        
    }
    
}
```
`getBytes(Charset charset)`：用于将字符串转换为字节数组，并使用指定的字符集（Charset）进行转换。与使用字符编码相比，使用字符集可以更灵活地处理字符编码的转换。
- nio包下的,需要导包
```java
public class Demo {
    public static void main(String[] args) {
        String str = "你好，世界！";
        Charset utfCharset = Charset.forName("UTF-8");
        byte[] byteArray = str.getBytes(utfCharset); // 使用 UTF-8 字符集将字符串转换为字节数组
        for (byte b : byteArray) {
            System.out.print(b + " "); // 输出字节数组中的每个字节
        }
    }
}
```
`getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)`：用于将指定范围内的字符复制到目标字符数组中的指定位置。这个方法允许您从字符串中提取特定范围的字符，并将它们复制到另一个字符数组中的指定位置。
- srcBegin: 要复制的字符的起始索引。
- srcEnd: 要复制的字符的结束索引（不包括该索引对应的字符）。
- dst: 目标字符数组，用于存储复制的字符数据。
- dstBegin: 目标字符数组中存储结果的起始位置。
```java
public class Demo {
    public static void main(String[] args) {
        String str1 = "Hello, world!";
        char[] charArray = new char[5]; // 创建一个字符数组用于存储复制的字符数据
        str1.getChars(0, 5, charArray, 0); // 复制索引 0 到 4 的字符到字符数组
        for (char c : charArray) {
            System.out.print(c); // 输出存储在字符数组中的字符
        }
    }
}
```
`hashCode()`：返回对象的哈希码（散列码），用于标识对象在哈希表等数据结构中的位置。
```java
public class Demo {
    public static void main(String[] args) {
        String str3 = "hello";
        String str4 = "world";
        int hashCode1 = str3.hashCode(); // 获取字符串 "hello" 的哈希码
        int hashCode2 = str4.hashCode(); // 获取字符串 "world" 的哈希码
        System.out.println("'hello': " + hashCode1);// 99162322
        System.out.println("'world': " + hashCode2);// 113318802
    }
}
```
`indent(int n)`：
```java
public class Demo {
    public static void main(String[] args) {
        
    }
}
```
`indexOf(int ch)`：用于查找指定字符在字符串中首次出现的位置索引。该方法返回值为字符在字符串中的索引位置，如果未找到字符，则返回 -1。
```java
public class Demo {
    public static void main(String[] args) {
        String str5 = "Hello, world!";
        int index = str5.indexOf('o'); // 查找字符 'o' 在字符串中的索引位置
        System.out.println("'o': " + index); // 4 输出索引位置 
        int notFoundIndex = str5.indexOf('z'); // 查找字符 'z' 在字符串中的索引位置
        System.out.println("'z': " + notFoundIndex); // -1 输出 -1，表示未找到
    }
}
```
`indexOf(int ch, int fromIndex)`：用于从指定的索引位置开始查找指定字符在字符串中首次出现的位置索引。该方法返回值为字符在字符串中的索引位置，如果未找到字符，则返回 -1。
- ch: 要查找的字符的 ASCII 值（整数表示）。
- fromIndex: 开始查找的索引位置。
```java
public class Demo{
    public static void main(String[] args) {
        String str6 = "Hello, world!";
        int index1 = str6.indexOf('o', 0); // 从索引位置 0 开始查找字符 'o'
        System.out.println("'o': " + index1);// 4
        int index2 = str6.indexOf('o', 5); // 从索引位置 5 开始查找字符 'o'
        System.out.println("'o': " + index2);// 8
    }
}
```
`indexOf(String str)`：用于查找指定子字符串在字符串中首次出现的位置索引。该方法返回值为子字符串在字符串中的索引位置，如果未找到子字符串，则返回 -1
```java
public class Demo{
    public static void main(String[] args) {
        String str7 = "Hello, world!";
        int index3 = str7.indexOf("world"); // 查找子字符串 "world" 在字符串中的索引位置
        System.out.println("'world': " + index3); // 7 输出索引位置
        int notFoundIndex1 = str7.indexOf("Java"); // 查找子字符串 "Java" 在字符串中的索引位置
        System.out.println("'Java': " + notFoundIndex1); // -1 输出 -1，表示未找到
    }
}
```
`indexOf(String str, int fromIndex)`：用于从指定的索引位置开始查找指定子字符串在字符串中首次出现的位置索引。该方法返回值为子字符串在字符串中的索引位置，如果未找到子字符串，则返回 -1。
```java
public class Demo{
    public static void main(String[] args) {
        String str8 = "Hello, world!";
        int index4 = str8.indexOf("o", 0); // 从索引位置 0 开始查找子字符串 "o"
        System.out.println("'o': " + index4);// 4
        int index5 = str8.indexOf("o", 5); // 从索引位置 5 开始查找子字符串 "o"
        System.out.println("'o': " + index5);// 8
    }
}
```
`isBlank()`：用于判断字符串是否为空或者只包含空白字符（whitespace characters）。 空白字符包括空格、制表符、换行符和其他 Unicode 空白字符。 如果字符串为空字符串或者只包含空白字符，则返回 true，否则返回 false
```java
public class Demo{
    public static void main(String[] args) {
        String str9 = "   ";
        String str10 = "Hello, world!";
        String str11 = "";
        System.out.println(str9.isBlank()); // true
        System.out.println(str10.isBlank()); // false
        System.out.println(str11.isBlank()); // true
    }
}
```
`isEmpty()`：用于判断字符串是否为空字符串。 如果字符串长度为0，即不包含任何字符，则返回 true，表示字符串为空；否则返回 false，表示字符串不为空。
```java
public class Demo{
    public static void main(String[] args) {
        String str12 = "Hello, world!";
        String str13 = "";
        System.out.println(str12.isEmpty()); // false
        System.out.println(str13.isEmpty()); // true
    }
}
```
`lastIndexOf(int ch)`：用于查找指定字符在字符串中最后一次出现的位置索引。该方法返回值为字符在字符串中的索引位置，如果未找到字符，则返回 -1。
```java
public class Demo{
    public static void main(String[] args) {
        String str14 = "Hello, world!";
        int lastIndex = str14.lastIndexOf('o'); // 查找字符 'o' 在字符串中最后一次出现的索引位置
        System.out.println("'o': " + lastIndex); // 8 输出索引位置
        int notFoundIndex3 = str.lastIndexOf('z'); // 查找字符 'z' 在字符串中的索引位置
        System.out.println("'z': " + notFoundIndex3); // -1 输出 -1，表示未找到
    }
}
```
`lastIndexOf(int ch, int fromIndex)`：用于从指定的索引位置开始倒序查找指定字符在字符串中最后一次出现的位置索引。该方法返回值为字符在字符串中的索引位置，如果未找到字符，则返回 -1。
- ch: 要查找的字符的 ASCII 值（整数表示）。
- fromIndex: 开始查找的索引位置。
```java
public class Demo{
    public static void main(String[] args) {
        String str15 = "Hello, world! Hello!";
        int lastIndex1 = str15.lastIndexOf('o', str.length() - 1); // 从字符串末尾开始查找字符 'o'
        System.out.println("'o'" + lastIndex1);// 4
        int lastIndex2 = str15.lastIndexOf('o', 10); // 从索引位置 10 开始查找字符 'o'
        System.out.println("'o'" + lastIndex2);// 8
    }
}
```
`lastIndexOf(String str)`：用于查找指定子字符串在字符串中最后一次出现的位置索引。该方法返回值为子字符串在字符串中的索引位置，如果未找到子字符串，则返回 -1。
```java
public class Demo{
    public static void main(String[] args) {
        String str16 = "Hello, world! Hello!";
        int lastIndex3 = str16.lastIndexOf("Hello"); // 查找子字符串 "Hello" 在字符串中最后一次出现的索引位置
        System.out.println("'Hello': " + lastIndex3); // 14 输出索引位置
        int notFoundIndex4 = str16.lastIndexOf("Java"); // 查找子字符串 "Java" 在字符串中的索引位置
        System.out.println("'Java': " + notFoundIndex4); // -1 输出 -1，表示未找到
    }
}
```
`lastIndexOf(String str, int fromIndex)`：用于从指定的索引位置开始倒序查找指定子字符串在字符串中最后一次出现的位置索引。该方法返回值为子字符串在字符串中的索引位置，如果未找到子字符串，则返回 -1。
- str: 要查找的子字符串。
- fromIndex: 开始查找的索引位置。
```java
public class Demo{
    public static void main(String[] args) {
        String str17 = "Hello, world! Hello!";
        int lastIndex5 = str17.lastIndexOf("Hello", str.length() - 1); // 从字符串末尾开始查找子字符串 "Hello"
        System.out.println("'Hello': " + lastIndex5);// 0
        int lastIndex6 = str17.lastIndexOf("Hello", 10); // 从索引位置 10 开始查找子字符串 "Hello"
        System.out.println("'Hello': " + lastIndex6);// 0
    }
}
```
`length()`：用于获取字符串的长度，即字符串中包含的字符数量
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello, world!";
        int length = str.length(); // 获取字符串的长度
        System.out.println("Length of the string: " + length);
    }
}
```
`matches(String regex)`：用于判断字符串是否与指定的正则表达式匹配。 regex: 要匹配的正则表达式。 该方法返回值为布尔类型，如果字符串与正则表达式匹配，则返回 true，否则返回 false。
```java
public class Demo{
    public static void main(String[] args) {
        String str1 = "Hello, world!";
        String str2 = "Hello123";
        boolean matches1 = str1.matches("[A-Za-z,\\s]+"); // 判断字符串是否只包含字母和逗号
        boolean matches2 = str2.matches("[A-Za-z,\\s]+"); // 判断字符串是否只包含字母和逗号
        System.out.println("str1 matches: " + matches1); // false
        System.out.println("str2 matches: " + matches2); // true
    }
}
```
`repeat(int count)`：用于将字符串重复多次生成一个新的字符串。 count: 重复生成新字符串的次数。 该方法返回一个新的字符串，其中包含原始字符串重复 count 次的内容
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello";
        String repeatedStr = str.repeat(3); // 将字符串重复生成3次
        System.out.println("Repeated string: " + repeatedStr);
    }
}
```
`replace(char oldChar, char newChar)`：用于将字符串中所有出现的指定字符 oldChar 替换为新的字符 newChar。
oldChar: 要替换的字符。
newChar: 替换后的新字符。
该方法返回一个新的字符串，其中所有出现的 oldChar 都被替换为 newChar。
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello, world!";
        String replacedStr = str.replace('o', 'x'); // 将字符串中的字符 'o' 替换为字符 'x'
        System.out.println("Replaced string: " + replacedStr);
    }
}
```
`replaceAll(String regex, String replacement)`：用于使用指定的替换字符串 replacement 替换字符串中匹配指定正则表达式 regex 的部分。
regex: 要匹配的正则表达式。
replacement: 替换后的新字符串。
该方法返回一个新的字符串，其中所有匹配正则表达式 regex 的部分都被替换为 replacement。
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello, 2023! Welcome to 2023!";
        String replacedStr = str.replaceAll("\\d+", "YEAR"); // 将字符串中的数字部分替换为 "YEAR"
        System.out.println("Replaced string: " + replacedStr);
    }
}
```
`replaceFirst(String regex, String replacement)`：用于使用指定的替换字符串 replacement 替换字符串中匹配指定正则表达式 regex 的第一个部分。
regex: 要匹配的正则表达式。
replacement: 替换后的新字符串。
该方法返回一个新的字符串，其中第一个匹配正则表达式 regex 的部分都被替换为 replacement。
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello, 2023! Welcome to 2023!";
        String replacedStr = str.replaceFirst("\\d+", "YEAR"); // 将字符串中的第一个数字部分替换为 "YEAR"
        System.out.println("Replaced string: " + replacedStr);
    }
}
```
`resolveConstantDesc(MethodHandles.Lookup lookup)`：MethodHandles 类提供了一种用于动态方法调用的底层机制，其中的 Lookup 类用于查找方法句柄。在 Java SE 9 中，引入了常量动态描述符（Constant Dynamic Descriptor）的概念，允许在运行时创建常量，并将其用于方法句柄等场景。 resolveConstantDesc(MethodHandles.Lookup lookup) 方法用于在给定的 Lookup 对象中解析获取常量动态描述符。它返回一个 java.lang.invoke.ConstantCallSite 对象，该对象可以用于动态地访问常量。
需要注意的是，这是一个较为高级的 Java 特性，通常在需要动态生成方法句柄的复杂场景下使用，例如动态生成字节码等
```java
public class Demo{
    public static void main(String[] args) {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        ConstantCallSite callSite = lookup.resolveConstantDesc("Hello, World!", String.class);
        String constantValue = (String) callSite.dynamicInvoker().invoke();
        System.out.println(constantValue); // Output: Hello, World!
    }
}
```
`split(String regex)`：用于根据指定的正则表达式 regex 将字符串拆分为子字符串数组。
regex: 用于拆分字符串的正则表达式。
该方法返回一个包含拆分后的子字符串的数组。
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello,world,Java";
        String[] parts = str.split(","); // 使用逗号拆分字符串
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
```
`split(String regex, int limit)`：用于根据指定的正则表达式 regex 将字符串拆分为子字符串数组，限制拆分的次数不超过指定的 limit。
regex: 用于拆分字符串的正则表达式。
limit: 拆分的次数限制。
该方法返回一个包含拆分后的子字符串的数组
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello,world,Java,is,fun";
        String[] parts = str.split(",", 3); // 使用逗号拆分字符串，最多拆分3次
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
````
`startsWith(String prefix)`：用于判断字符串是否以指定的前缀字符串 prefix 开头。
prefix: 要检查的前缀字符串。
该方法返回一个布尔值，如果字符串以指定的前缀开头，则返回 true，否则返回 false
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello, world!";
        boolean startsWithHello = str.startsWith("Hello"); // 判断字符串是否以 "Hello" 开头
        System.out.println("Starts with Hello: " + startsWithHello);
        boolean startsWithHi = str.startsWith("Hi"); // 判断字符串是否以 "Hi" 开头
        System.out.println("Starts with Hi: " + startsWithHi);
    }
}
```
`startsWith(String prefix, int toffset)`：用于从指定的偏移位置 toffset 开始，判断字符串是否以指定的前缀字符串 prefix 开头。
prefix: 要检查的前缀字符串。
toffset: 要开始检查的偏移位置。
该方法返回一个布尔值，如果从指定偏移位置开始的子字符串以指定的前缀开头，则返回 true，否则返回 false。
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello, world!";
        boolean startsWithWorld = str.startsWith("world", 7); // 从索引位置 7 开始判断字符串是否以 "world" 开头
        System.out.println("Starts with world: " + startsWithWorld);
        boolean startsWithHello = str.startsWith("Hello", 7); // 从索引位置 7 开始判断字符串是否以 "Hello" 开头
        System.out.println("Starts with Hello: " + startsWithHello);
    }
}
```
`strip()`：用于去除字符串的首尾空白字符（包括空格、制表符、换行符等）。
这个方法是在 Java 11 中引入的，它与 trim() 方法类似，但相对于 trim()，strip() 更强大，可以处理更广泛的 Unicode 空白字符
```java
public class Demo{
    public static void main(String[] args) {
        String str = "  Hello, world!  ";
        String stripped = str.strip(); // 去除字符串的首尾空白字符
        System.out.println("Stripped: " + stripped);
    }
}
```
`stripIndent()`：用于去除多行字符串的每行开头的缩进空格。它在 Java 15 中引入。
这个方法在处理多行字符串时非常有用，可以消除每行开头的缩进，使代码更清晰易读。
```java
public class Demo{
    public static void main(String[] args) {
        String multilineString = """
                This is a
                multiline
                string with
                indentation.
                """;
        String strippedString = multilineString.stripIndent(); // 去除每行开头的缩进空格
        System.out.println(strippedString);
    }
}
```
`stripLeading()`：用于去除字符串开头的空白字符（包括空格、制表符、换行符等）。
这个方法是在 Java 11 中引入的，它与 trim() 方法类似，但是专门用于去除开头的空白字符。
```java
public class Demo{
    public static void main(String[] args) {
        String str = "  Hello, world!";
        String strippedLeading = str.stripLeading(); // 去除字符串开头的空白字符
        System.out.println("Stripped Leading: " + strippedLeading);
    }
}
```
`stripTrailing()`：用于去除字符串末尾的空白字符（包括空格、制表符、换行符等）。
这个方法是在 Java 11 中引入的，它与 trim() 方法类似，但是专门用于去除末尾的空白字符。
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello, world!   ";
        String strippedTrailing = str.stripTrailing(); // 去除字符串末尾的空白字符
        System.out.println("Stripped Trailing: " + strippedTrailing);
    }
}
```
`substring(int beginIndex)`：用于从指定的索引位置 beginIndex 开始截取字符串的子串。
beginIndex: 开始截取的索引位置。
该方法返回一个新的字符串，包含从指定索引位置开始直到字符串末尾的子串。
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello, world!";
        String subStr = str.substring(7); // 从索引位置 7 开始截取子串
        System.out.println("Substring: " + subStr);
    }
}
```
`substring(int beginIndex, int endIndex)`：用于从指定的开始索引 beginIndex 到结束索引 endIndex（不包括 endIndex）之间截取字符串的子串。
beginIndex: 开始截取的索引位置。
endIndex: 结束截取的索引位置（不包括在截取范围内）。
该方法返回一个新的字符串，包含从 beginIndex 开始，直到 endIndex - 1 位置的子串。
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello, world!";
        String subStr = str.substring(7, 12); // 从索引位置 7 到索引位置 12（不包括）截取子串
        System.out.println("Substring: " + subStr);
    }
}
```
`toCharArray()`：用于将字符串转换为字符数组。
这个方法会返回一个新的字符数组，其中包含了字符串中的每个字符。
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello, world!";
        char[] charArray = str.toCharArray(); // 将字符串转换为字符数组
        for (char c : charArray) {
            System.out.print(c + " ");
        }    
    }
}
```
`toLowerCase()`：用于将字符串中的所有字符转换为小写形式。
这个方法会返回一个新的字符串，其中所有的大写字符都被转换为对应的小写字符
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello, World!";
        String lowerCaseStr = str.toLowerCase(); // 将字符串中的字符转换为小写形式
        System.out.println("Lowercase: " + lowerCaseStr);
    }
}
```
`toString()`：在 Java 中的所有类都继承了 Object 类，因此可以在任何对象上调用这个方法。
在 Object 类中，toString() 方法的默认实现返回一个包含对象的类名和哈希码的字符串表示。但是，大多数类都会重写这个方法，以便返回更有意义的对象描述。
在自定义的类中，你可以根据需要重写 toString() 方法，以返回你希望的对象描述。
```java
public class ToStringExample {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "12345");
        System.out.println(student.toString()); // 默认情况下调用对象的toString()方法

        String str = "Hello, world!";
        System.out.println(str.toString()); // 调用String类的toString()方法
    }
}
class Student {
    private String name;
    private int age;
    private String studentId;
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
    }
}
```
`toUpperCase()`：用于将字符串中的所有字符转换为大写形式。
这个方法会返回一个新的字符串，其中所有的小写字符都被转换为对应的大写字符。
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello, World!";
        String upperCaseStr = str.toUpperCase(); // 将字符串中的字符转换为大写形式
        System.out.println("Uppercase: " + upperCaseStr);
    }
}
```
`trim()`：用于去除字符串两端的空白字符（包括空格、制表符、换行符等）。
这个方法会返回一个新的字符串，其中两端的空白字符被去除掉。
```java
public class Demo{
    public static void main(String[] args) {
        String str = "   Hello, world!   ";
        String trimmedStr = str.trim(); // 去除字符串两端的空白字符
        System.out.println("Trimmed: " + trimmedStr);
    }
}
```
`valueOf(boolean b)`：用于将一个布尔值转换为其字符串表示形式。
这个方法会返回一个字符串，表示给定的布尔值。
```java
public class Demo{
    public static void main(String[] args) {
        boolean boolValue = true;
        String stringValue = String.valueOf(boolValue); // 将布尔值转换为字符串
        System.out.println("String Value: " + stringValue);
    }
}
```
`valueOf(char c)`：用于将一个字符转换为其字符串表示形式。
这个方法会返回一个字符串，表示给定的字符。
```java
public class Demo{
    public static void main(String[] args) {
        char charValue = 'A';
        String stringValue = String.valueOf(charValue); // 将字符转换为字符串
        System.out.println("String Value: " + stringValue);
    }
}
```
`valueOf(char[] data)`：用于将一个字符数组转换为其字符串表示形式。
这个方法会返回一个字符串，表示给定的字符数组。
```java
public class Demo{
    public static void main(String[] args) {
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String stringValue = String.valueOf(charArray); // 将字符数组转换为字符串
        System.out.println("String Value: " + stringValue);
    }
}
```
`valueOf(char[] data, int offset, int count)`：String 类的静态方法，用于将一个字符数组的一部分转换为其字符串表示形式。
这个方法会返回一个字符串，表示给定字符数组中从指定偏移量开始的指定数量字符。
```java
public class Demo{
    public static void main(String[] args) {
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String stringValue = String.valueOf(charArray, 1, 3); // 将字符数组的一部分转换为字符串
        System.out.println("String Value: " + stringValue);
    }
}
```
`valueOf(double d)`：String 类的静态方法，用于将一个双精度浮点数（double 类型）转换为其字符串表示形式。
这个方法会返回一个字符串，表示给定的双精度浮点数。
```java
public class Demo{
    public static void main(String[] args) {
        double doubleValue = 3.14;
        String stringValue = String.valueOf(doubleValue); // 将双精度浮点数转换为字符串
        System.out.println("String Value: " + stringValue);
    }
}
```
`valueOf(float f)`：String 类的静态方法，用于将一个单精度浮点数（float 类型）转换为其字符串表示形式。
这个方法会返回一个字符串，表示给定的单精度浮点数
```java
public class Demo{
    public static void main(String[] args) {
        float floatValue = 2.718f;
        String stringValue = String.valueOf(floatValue); // 将单精度浮点数转换为字符串
        System.out.println("String Value: " + stringValue);
    }
}
```
`valueOf(int i)`： String 类的静态方法，用于将一个整数（int 类型）转换为其字符串表示形式。
这个方法会返回一个字符串，表示给定的整数
```java
public class Demo{
    public static void main(String[] args) {
        int intValue = 123;
        String stringValue = String.valueOf(intValue); // 将整数转换为字符串
        System.out.println("String Value: " + stringValue);
    }
}
```
`valueOf(long l)`： String 类的静态方法，用于将一个长整数（long 类型）转换为其字符串表示形式。
这个方法会返回一个字符串，表示给定的长整数。
```java
public class Demo{
    public static void main(String[] args) {
        long longValue = 9876543210L;
        String stringValue = String.valueOf(longValue); // 将长整数转换为字符串
        System.out.println("String Value: " + stringValue);
    }
}
```
`valueOf(Object obj)`：String 类的静态方法，用于将一个对象转换为其字符串表示形式。
这个方法会返回一个字符串，表示给定的对象。如果参数对象为 null，则返回字符串 "null"。
```java
public class Demo{
    public static void main(String[] args) {
        String str = "Hello, world!";
        char[] charArray = new char[5]; // 创建一个字符数组用于存储复制的字符数据
        str.getChars(0, 5, charArray, 0); // 复制索引 0 到 4 的字符到字符数组
        for (char c : charArray) {
            System.out.print(c); // 输出存储在字符数组中的字符
        }
    }
}
```