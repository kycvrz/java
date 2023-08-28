package day0807;

import java.util.Random;

public class Exercise09 {
    public static void main(String[] args) {
        // 在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手的
        // 最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        Random sc=new Random();
        int[] arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt(101);
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        int max=arr[0];
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("最高分为："+max);
        System.out.println("最低分为："+min);
        System.out.println("总分为："+sum);
        int avg=(sum-max-min)/4;
        System.out.println("选手的平均分为："+avg);
    }
}
