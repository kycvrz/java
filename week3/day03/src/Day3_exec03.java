package thirdweek;

import java.util.Scanner;

public class Day3_exec03 {
    public static void main(String[] args) {
        // 编写一个程序，根据用户输入的月份（1 到 12），输出该月份所属的季节。
        // 假设春季是3到5月，夏季是6到8月，秋季是9到11月，冬季是12、1 和 2月。
        // 如果输入的月份超出了范围，输出"输入错误"。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = sc.nextInt();
        switch (month){
            case 3,4,5->System.out.println("该月属于春季");
            case 6,7,8->System.out.println("该月属于夏季");
            case 9,10,11->System.out.println("该月属于秋季");
            case 12,1,2->System.out.println("该月属于冬季");
            default -> System.out.println("输入错误");
        };
    }
}
