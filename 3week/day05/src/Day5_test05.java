package thirdweek.day05;

import java.util.Scanner;

public class Day5_test05 {
    public static void main(String[] args) {
        //李四每天跑步
        //第一周周一跑 100 米，周二到周天每天比前一天多 100 米。
        //往后每周一比前一周周一多 100 米。
        //请问 李四 n（控制台输入） 天后跑了多少米
        // 计算整周的距离  week=n/7(计算周数)
        // 计算单个天的距离  day=n%7
        // 需要的变量：周一(monday) 距离(distance)
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个天数");
        int n=sc.nextInt();
        int distance=0;
        int week=n/7;
        int monday=0;// 周一的天数
        // 整周的距离
        for (int i=0;i<week;i++){
            monday=monday+100;// 每周周一的天数
            int day=monday;// 每天的天数
            for (int j=1;j<=7;j++){
                distance=distance+day;
                day=day+100;
            }
        }
        // 计算单个天的距离
        monday=monday+100;
        int day=monday;
        for (int j=1;j<=n%7;j++){
            distance=distance+day;
            monday=monday+100;
        }
        System.out.println(distance);
    }
}
