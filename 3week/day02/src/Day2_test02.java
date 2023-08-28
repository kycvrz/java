package thirdweek;

import java.util.Scanner;
public class Day2_test02 {
    public static void main(String[] args){
        // 从键盘上输入一个三位数，判断是否是水仙花数，是输出true，不是输出false
        // 水仙花：各个位上的数字的立方和等于该数本身
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        int baiwei = num / 100;
        int shiwei = num / 10 % 10;
        int gewei = num % 10;
        boolean result = baiwei * baiwei * baiwei + shiwei * shiwei * shiwei + gewei * gewei * gewei == num;
        System.out.println("这个数是水仙花数吗？"+ result);
    }
}
