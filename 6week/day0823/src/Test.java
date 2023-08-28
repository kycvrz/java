import java.util.Arrays;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str= sc.next();
        char[] chars=str.toCharArray();
        // 将字符串转化为一个字符数组
        System.out.println(Arrays.toString(chars));
    }
}
