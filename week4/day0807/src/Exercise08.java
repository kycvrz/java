package day0807;

import java.util.Random;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        //定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，
        //偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组长度");
        int num=sc.nextInt();
        // 定义一个数组a
        int[] a=new int[num];
        Random in=new Random();
        // 给数组a进行赋值
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextInt(100)+1;
            System.out.print(a[i]+"\t");
        }

        System.out.println();

        int[] b=new int[num];// 定义一个新的数组
        int j=0;
        int c=b.length-1;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2!=0){
                b[j]=a[i];
                j++;
            }
            if (a[i]%2==0){
                b[c]=a[i];
                c--;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }

    }
}
