package day0807;

import java.util.Random;

public class Exercise02 {
    public static void main(String[] args) {
        // 创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100
        // （不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
        // a[i]= sc.nextInt(100)-->[0,99] 101-->[0,100]
        int[] a =new int[6];
        Random sc=new Random();
        for (int i = 0; i < 6; i++) { //  为数组赋值
            a[i]= sc.nextInt(100);
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];// 计算数组之和
        }
        System.out.println("随机数组中所有元素的和为："+sum);
    }
}
