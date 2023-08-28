package thirdweek;

import java.util.Scanner;

public class Day3_test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年月");
        int year = sc.nextInt();
        int month = sc.nextInt();
        // 判断输入一个年月 这个月有多少天  31天：1,3,5,7,8,10,12
        switch (month){
            case 1,3,5,7,8,10,12:
                System.out.println("该月有31天");
                break;
            case 4, 6, 9, 11:
                System.out.println("该月有30天");
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("该月有29天");
                }else{
                    System.out.println("该月有28天");
                }
        }
//        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0){
//            switch (month){
//                case 1,3,5,7,8,10,12:
//                    System.out.println("该月有31天");
//                    break;
//                case 4,6,9,11:
//                    System.out.println("该月有30天");
//                    break;
//                case 2:
//                    System.out.println("该月有29天");
//                    break;
//                default:
//                    System.out.println("输入有误");
//                    break;
//            }
//        }else {
//            switch (month) {
//                case 1,3,5,7,8,10,12:
//                    System.out.println("该月有31天");
//                    break;
//                case 4,6,9,11:
//                    System.out.println("该月有30天");
//                    break;
//                case 2:
//                    System.out.println("该月有28天");
//                    break;
//                default:
//                    System.out.println("输入有误");
//                    break;
//            }
//        }
    }
}
