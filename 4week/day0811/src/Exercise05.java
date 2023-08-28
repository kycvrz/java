import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        // 编写一个方法，接受一个整数作为参数，判断它是否为回文数（正着读和倒着读都一样）
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字，判断是不是回文数字");
        int number=sc.nextInt();
        System.out.println(number+"是回文数字吗？"+number(number));
    }
    public static boolean number(int num){
        int qianwei =num/1000;
        int baiwei =num/100%10;
        int shiwei =num/10%10;
        int gewei =num%10;
        return qianwei==gewei && baiwei==shiwei;
    }
}
