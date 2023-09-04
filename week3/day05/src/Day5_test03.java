package thirdweek.day05;

import java.util.Scanner;

public class Day5_test03 {
    public static void main(String[] args) {
        // 接收用户输入的数字,判断在此范围内质数的个数，例如输入90，输出0-90以内的所有质数的数量
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
                if (count>2){
                    break;
                }
            }
            if (count==2){
                sum++;
                System.out.println(i);
            }
        }
        System.out.println("质数的数量为："+sum);
    }
}
