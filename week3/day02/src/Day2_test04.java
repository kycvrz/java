package thirdweek;

import java.util.Scanner;
public class Day2_test04 {
    public static void main(String[] args){
        //  定义两个整变量，交换两个变量的值。 方法1：通过位运算(异或运算)
        //  方法2：定义临时(中间)变量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int a = sc.nextInt();
        System.out.println("请再输入一个数字");
        int b = sc.nextInt();
        // int a = 12; // 1100
        // int b = 7; // 0111
        a = a ^ b; // a = 1011
        b = a ^ b; // b = 1100
        a = a ^ b; // a = 0111
        System.out.println("交换之后的数为："+a);
        System.out.println("交换之后的数为："+b);
    }
}
