package thirdweek.day05;

import java.util.Scanner;

public class Day5_test04 {
    public static void main(String[] args) {
        // 洪乞丐干10天，收入是多少？
        //天朝有一个乞丐姓洪，去天桥要钱
        //第一天要了1块钱
        //第二天要了2块钱
        //第三天要了4块钱
        //第四天要了8块钱
        //以此类推
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个天数");
        int day=sc.nextInt();
        int salary=0;
        int sum=0;
        for (int i=1;i<=day;i++){
            if (i==1){
                salary=salary+i;
            }else{
                salary=salary*2;
            }
            sum=sum+salary;
        }
        System.out.println("洪乞丐"+day+"天收入为："+sum);
    }
}
