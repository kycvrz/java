import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        // 编写一个Java程序，实现一个简单的计算器。用户输入两个数字和一个操作符
        // (如加法、减法、乘法或除法)，程序根据操作符进行相应的计算并输出结果
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        double number1=sc.nextInt();
        System.out.println("请再输入一个数字");
        double number2=sc.nextInt();
        System.out.println("请输入一个操作符");
        String oper= sc.next();
        countResult(number1,number2,oper);
    }
    public static void countResult(double number1,double number2,String oper){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个数字");
//        double number1=sc.nextInt();
//        System.out.println("请再输入一个数字");
//        double number2=sc.nextInt();
//        System.out.println("请输入一个操作符");
//        String oper= sc.next();
        double count=0;
        switch(oper){
            case "+"-> count =number1+number2;
            case "-"-> count =number1-number2;
            case "*"-> count =number1*number2;
            case "/"-> count =number1/number2;
            case "%"-> count =number1%number2;
            default -> System.out.println("输入错误");
        }
        System.out.println(count);
    }
}
