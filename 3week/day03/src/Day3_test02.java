package thirdweek;

import java.util.Scanner;

public class Day3_test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个成绩");
        int score = sc.nextInt();
//        String num = switch (score/10){
//            case 9,10 -> "A";
//            case 8 -> "B";
//            case 7 -> "C";
//            case 6 -> "D";
//            default -> "E";
//        };
//        System.out.println(num);
        if (score >=0 && score <= 100){
            switch (score/10){
                case 9,10 -> System.out.println("A");
                case 8 -> System.out.println("B");
                case 7 -> System.out.println("C");
                case 6 -> System.out.println("D");
                default -> System.out.println("E");
            }
        }else {
            System.out.println("输入有误");
        }
    }
}
