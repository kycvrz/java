package thirdweek;

import java.util.Scanner;

public class Day3_exec02 {
    public static void main(String[] args) {
        //编写一个程序，根据用户输入的温度单位("C"表示摄氏度，"F"表示华氏度)和温度，将其转换为另一种单位后输出。
        //注: 摄氏度转换为华氏度的公式(摄氏度 * 9 / 5)+32，以及华氏度转换为摄氏度的公式(华氏度-32) * 5 / 9
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个温度");
        double temp = sc.nextDouble();
        System.out.println("请输入一个温度单位");
        String unit = sc.next();
        double result=0;
        boolean a =true;
        switch (unit){
            case "C":
                result=(temp * 9 / 5) + 32;
                break;
            case "F":
                result=(temp -31) * 5 / 9;
                break;
            default:
                a=false;
                System.out.println("输入单位错误");
        }
        if(a){
            System.out.println(temp+"转化后为："+result);
        }
    }
}
