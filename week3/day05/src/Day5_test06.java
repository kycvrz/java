package thirdweek.day05;

import java.util.Scanner;

public class Day5_test06 {
    public static void main(String[] args) {
        // 计算 n 的阶乘
        //5! = 5 * 4 * 3 * 2 * 1 输入一个数，计算阶乘
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n=sc.nextInt();
        int num=1;
        for (int i=1;i<=n;i++){
            num=num*i;
        }
        System.out.println("这个数的阶乘为："+num);
    }
}
