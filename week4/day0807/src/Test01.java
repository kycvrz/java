package day0807;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 输入 n 输出前 n 个数 存储到数组 再输出
        Scanner  sc= new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num =sc.nextInt();
        int[] score=new int[num];
//        int first =0;
//        int second = 1;
//        int third =0;
        score [0]=1; // 第一个数字
        score [1]=1; // 第二个数字
        for (int i =3;i<=num;i++){
            score[i-1] = score[i-3]+score[i-2]; // 第三个数字
//            score[i] =score[i+1];
//            score[i+1]=score[i+2];

        }
        for (int i =0;i<num;i++){
            System.out.println(score[i]);
        }
    }
}