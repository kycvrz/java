package day0807;

import java.util.Random;

public class Exercise06 {
    public static void main(String[] args) {
        // 定义一个长度为20的数组，元素为20-40的随机数，
        // 要求判断指定元素在数组中出现的次数，指定元素为键盘录入范围为20-40之间。
        int[] arr=new int[20];
        Random sc=new Random();
        for (int i = 0; i < 20; i++) {
            arr[i]= sc.nextInt(21)+20;
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for (int i=0;i< arr.length;i++){// 外层循环控制数组输出的值
            int count=0;// 记录重复出现的次数
            for (int j=0;j<arr.length;j++){// 内层循环控制数组输出的值(为了进行判断值输出几次)
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+"出现的次数为："+count);
        }
    }
}
