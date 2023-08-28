import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str="------1-2-3-4-5-6-----hello------";
        String[] str1=str.split("-");
        System.out.println(str1.length);// 17
        System.out.println(Arrays.toString(str1));// [, , , , , , 1, 2, 3, 4, 5, 6, , , , , hello]
        for (String a:str1) {
            System.out.print(a+"\t");// 						1	2	3	4	5	6					hello
        }
        System.out.println();
        String str2 = "Hello-world-Java";
        System.out.println(str2.charAt(0));// 查找下标对应的字符 H
        System.out.println(str2.indexOf('e'));// 查找对应字符的下标 1
        String[] parts = str2.split("-"); // 使用逗号拆分字符串 [Hello, world, Java]
        System.out.println(Arrays.toString(parts));
        for (String part : parts) {
            System.out.print(part+"\t");// Hello	world	Java
        }
    }
}
