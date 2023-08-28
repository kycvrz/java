package thirdweek.day04;

import java.util.Scanner;

public class Day4_test06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个指定行数");
        int n=sc.nextInt();
        // 输出等腰三角行
        for (int i=1;i<=n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
