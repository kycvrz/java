package day0807;

import java.util.Random;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        // 现有一个整数数组，数组中的每个元素都是[0-9]之间的数字
        // 从数组的最大索引位置开始到最小索引位置，依次表示整数的个位、十位、百位。。。
        // 依次类推。请编写程序计算，这个数组所表示的整数值。
        // 数组：{2, 1, 3, 5, 4}
        // 表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。
        Random sc=new Random();
        Scanner in=new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int num=in.nextInt();
        int[] arr=new int[num];
        // 给数组arr进行赋值
        for (int i = 0; i <num ; i++) {
            arr[i]= sc.nextInt(10);
            System.out.print(arr[i]+"\t");
        }

        System.out.println();
        int sum=0;// 定义一个变量和
        for (int i = 0; i < arr.length; i++) {// 控制循环的数据数量
            int a=arr[i];
            for (int j = arr.length-i-1; j >=1; j--) {// 控制需要乘10的次数 (第一位乘10的次数是长度减1再减去它是第几位)
                a*=10;
            }
            sum+=a;
        }
        System.out.println(sum);
    }
}
