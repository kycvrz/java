package day0807;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        // 需求：求出数组中索引与索引对应的元素都是奇数的元素
        //分析：
        //1、遍历数组
        //2、判断索引是否是奇数（索引 % 2 != 0）
        //3、判断索引对应的元素是否是奇数(arr[索引] % 2 != 0)
        //4、满足条件输出结果
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int num =sc.nextInt();
        int[] a=new int[num];
        for (int i = 0; i <num; i++) {
            System.out.println("请输入第"+(i+1)+"个数字");
            a[i]= sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (i%2!=0 && a[i]%2!=0){// 判断下标是否是奇数 值是否是奇数
                System.out.print("索引下标为："+i+"\t"+"对应的数值为："+a[i]);
            }
        }
    }
}
