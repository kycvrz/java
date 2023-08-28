package thirdweek;

import java.util.Scanner;

public class Day3_exec01 {
    public static void main(String[] args) {
        // 编写一个简单的计算器程序，要求用户输入两个数和操作符（+、-、*、/、%），然后根
        //据操作符进行相应的运算，并输出结果。如果输入的运算符不是有效的运算符，则输出"无效的运算符"。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请再输入一个数字");
        int num2 = sc.nextInt();
        System.out.println("请输入一个操作符");
        String op = sc.next();
        int result = 0;
//        switch (op){
//            case "+" :
//                result = num1 + num2;
//                System.out.println("计算结果为："+result);
//                break;
//            case "-" :
//                result = num1 - num2;
//                System.out.println("计算结果为："+result);
//                break;
//            case "*" :
//                result = num1 * num2;
//                System.out.println("计算结果为："+result);
//                break;
//            case "/" :
//                result = num1 / num2;
//                System.out.println("计算结果为："+result);
//                break;
//            case "%":
//                result = num1 % num2;
//                System.out.println("计算结果为："+result);
//                break;
//            default:
//                System.out.println("无效的操作符");
//                break;
//        }
        boolean temp = true;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                temp = false;
                System.out.println("无效的操作符");
        }
        if (temp) {
            System.out.println("计算结果为：" + result);
        }
    }
}
