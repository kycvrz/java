import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        // 编写一个方法 isPalindromeNumber(int number)，该方法接收一个四位整数参
        // 数 number，判断该数是否是回文数。回文数是指正序和倒序读都相同的整数。如果是回
        // 文数，则返回 true，否则返回false。
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个四位整数");
        int number=in.nextInt();
//        isPalindromeNumber(number);
        System.out.println(number+"是回文数吗？"+isPalindromeNumber(number));
    }
    public static boolean isPalindromeNumber(int number){
        int qianwei=number/1000;
        int baiwei=number/100%10;
        int shiwei=number/10%10;
        int gewei=number%10;
        return qianwei==gewei && baiwei==shiwei;
//        if (qianwei==gewei && baiwei==shiwei){
//            System.out.println(number+"是回文数吗？"+true);
//        }else{
//            System.out.println(number+"是回文数吗？"+false);
//        }
    }
}
