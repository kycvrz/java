package thirdweek;

import java.util.Scanner;
public class Day2_test01 {
    public static void main(String[] args) {
        //从键盘上输入一个四位整数，求各位数之和。
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个四位数");
        int num = in.nextInt();
        int qianwei = num/1000;
        int baiwei = num % 1000 / 100;
        int shiwei = num % 1000 % 100 / 10;
        int gewei = num % 1000 % 100 % 10;

        // int baiwei = num / 100 % 10;
        // int shiwei = num / 10 % 10;
        // int gewei = num % 10;
        int sum = qianwei + baiwei + shiwei +gewei ;
        System.out.println(num);
        System.out.println(sum);
    }
}
