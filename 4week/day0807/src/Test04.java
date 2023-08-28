package day0807;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        // 某歌唱比赛，需要开发一个系统：可以录入6名评委的打分，录入完毕后立即输出平均分做选手得分
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];// 定义数组
        int sum =0;// 定义总和变量
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"评委打分");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("选手得分总分为："+sum);
        int avg=sum/6;
        System.out.println("选手平均分为："+avg);
    }
}
