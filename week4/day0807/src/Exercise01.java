package day0807;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        // 定义一个含有五个元素的数组,并为每个元素赋值,求数组中所有元素的最小值
        //操作步骤：
        //1.定义5个元素数组
        //2.可以使用初始化数组的两种方式之一为数组元素赋值： 动态初始化/静态初始化
        //3.遍历数组求数组中的最小值
        int[] a=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("请输入第"+(i+1)+"个数字");
            a[i]=sc.nextInt();// 为数组元素赋值
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int min=a[0];
        for (int i=1;i<a.length;i++){
            if (min>a[i]){
                min=a[i];// 求出最小值
            }
        }
        System.out.println("数组中最小值为："+min);
    }
}
