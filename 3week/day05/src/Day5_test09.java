package thirdweek.day05;

import java.util.Scanner;

public class Day5_test09 {
    public static void main(String[] args) {
        //一个循环，打印输出一个由字符构成的正方形图案，其中
        //边长由用户输入确定。要求字符按照以下顺序循环使
        //用：'#','@','*'。例如，当边长为 5 时，输出如下：
        //# @ @ @ #
        //@ * * * @
        //@ * * * @
        //@ * * * @
        //# @ @ @ #
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num=sc.nextInt();
        for (int i = 1; i <=num; i++) {
            // 第一行
            if (i == 1 || i == num) {
                for (int j = 1; j <= num; j++) {
                    if (j == 1 || j == num) {
                        System.out.print("#");
                    } else {
                        System.out.print("@");
                    }
                }
            } else {
                for (int j = 1; j <= num; j++) {
                    if (j == 1 || j == num) {
                        System.out.print("@");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
