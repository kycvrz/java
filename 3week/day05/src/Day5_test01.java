package thirdweek.day05;

import java.util.Scanner;

public class Day5_test01 {
    public static void main(String[] args) {
        // 求指定两个数的最大公约数和最小公倍数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int a=sc.nextInt();
        System.out.println("请再输入一个数字");
        int b= sc.nextInt();
        // 最大公约数
        int temp=0;
        for (int i=1;i<a*b;i++){
            if (a%i==0 && b%i==0){
                temp=i;
            }
        }
        System.out.println("最大公约数为："+temp);
        // 最小公倍数
        int max = 0;
        int min = 0;
        if (a>b){
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }
        for (int i=max;i<=a*b;i++){
            if (i%a==0&&i%b==0){
                System.out.println("最小公倍数为："+i);
                break;
            }
        }
        // 最大公约数
        for (int j=min;j>=1;j--){
            if (a%j==0&&b%j==0){
                System.out.println("最大公约数为："+j);
                break;
            }
        }
    }

}
