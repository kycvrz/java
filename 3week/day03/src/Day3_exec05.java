package thirdweek;

import java.util.Scanner;

public class Day3_exec05 {
    public static void main(String[] args) {
        //编写一个程序，根据员工的工龄来计算年终奖金。奖金计算规则如下：
        //工龄小于等于5年，奖金为工资的5%
        //工龄大于5年且小于等于10年，奖金为工资的10%
        //工龄大于10年，奖金为工资的15%
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入员工的工龄");
        int le = sc.nextInt();
        System.out.println("请输入员工的工资");
        double wage = sc.nextDouble();
        double comm = 0;
        if (le >0 &&le <= 5){
            comm=(wage*12)*0.05;
            System.out.println("该员工的年终奖为："+comm);
        }else if (le >5 && le <=10){
            comm=(wage*12)*0.1;
            System.out.println("该员工的年终奖为："+comm);
        }else if (le>10){
            comm=(wage*12)*0.15;
            System.out.println("该员工的年终奖为："+comm);
        }else{
            System.out.println("输入错误");
        }
    }
}
