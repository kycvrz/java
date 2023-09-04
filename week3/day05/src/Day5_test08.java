package thirdweek.day05;

import java.util.Scanner;

public class Day5_test08 {
    public static void main(String[] args) {
        // 输入行数 显示如图所示的空心三角形
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++){
                if (i==n){
                    System.out.print("* ");
                }else {
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
