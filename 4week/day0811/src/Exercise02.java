import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        // 编写一个方法，接受一个正整数作为参数，并返回它的阶乘
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要计算的阶乘");
        int number=sc.nextInt();
        System.out.println(factorial(number));
    }
    public static int factorial(int num){
        int sum=1;
        for (int i = num; i>=1 ; i--) {
            sum*=i;
        }
        return sum;
    }
}
