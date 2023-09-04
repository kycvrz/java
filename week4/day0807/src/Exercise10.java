package day0807;

import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        // 现有一个int 数组，数组中有十个元素。将数组反转后输出。
        // 给数组arr赋值
        Random sc=new Random();
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt(100);
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        // 进行数组的反转
        int[] a=new int[10];// 定义一个新的数组
        int j=0;
        for (int i =arr.length-1; i >=0; i--) {
            a[j]=arr[i];// 最后一位转化为第一位
            j++;
        }
        // 数组a的数据
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }
}
