package thirdweek.day05;

import java.util.Scanner;

public class Day5_test07 {
    public static void main(String[] args) {
        //输入一个位数字，和位数，判断这个数是否回文数字1221 就是回文数字
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个四位数字");
        int num =sc.nextInt();
        int qianwei = num/1000;
        int baiwei =num/100%10;
        int shiwei =num /10%10;
        int gewei =num%10;
        if (qianwei==gewei&&baiwei==shiwei){
            System.out.println(num+"是回文数字");
        }else{
            System.out.println(num+"不是回文数字");
        }
    }
}
