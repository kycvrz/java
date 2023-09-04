package thirdweek;

import java.util.Scanner;
public class Day2_test05 {
    public static void main(String[] args){
        // 定义两个整变量，交换两个变量的值。用中间变量进行交换
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int a = sc.nextInt();
        System.out.println("请再输入一个数字");
        int b = sc.nextInt();
        // int a = 12;
        // int b = 5;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
