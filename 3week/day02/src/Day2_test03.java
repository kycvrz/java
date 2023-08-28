package thirdweek;

import java.util.Scanner;
public class Day2_test03 {
    public static void main(String[] args){
        // 编写一个Java程序，接收用户输入的一个三角形的三个边长，
        // 判断这三条边是否能构成一个三角形，并输出相应的结果。
        // 两边之和大于第三边，两边之差小于第三边
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形第一的第一条边");
        int a = sc.nextInt();
        System.out.println("请输入三角形的第二条边");
        int b = sc.nextInt();
        System.out.println("请输入三角形的第二条边");
        int c = sc.nextInt();
        boolean result = a + b > c & a - b < c;
        System.out.println("这三条边能构成三角形吗？" + result);

    }
}
