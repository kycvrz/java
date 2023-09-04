package day0807;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        // 输入 n 输出前 n 个数 存储到数组 再输出
        // 斐波那契数字：1 1 2 3 5 8 13
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要输出斐波那契数字的前几个数字");
        int n= sc.nextInt();
        int first=1;//第一个数字
        int second=1;// 第二个数字
        int third=0;
        System.out.println(first);
        System.out.println(second);
        for (int i = 0; i <n-2; i++) {
            third=first + second; // 第三个数字
            first=second;// 交换位置第二个数变为第一个数
            second=third;// 第三个数变为第二个数
            System.out.println(third);
        }
    }
}
