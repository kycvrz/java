package thirdweek.day04;

import java.util.Scanner;

public class Day4_test09 {
    public static void main(String[] args) {
        // 输出一个菱形 13行 7行  23个
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for (int j=0;j<2*i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for (int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for (int j=0;j<2*i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
