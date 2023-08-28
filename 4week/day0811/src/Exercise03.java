import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        // 编写一个方法，接受一个整数作为参数，并判断它是否为素数（质数）
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字判断是否是素数");
        int number=sc.nextInt();
        System.out.println(number+"是素数吗？"+primeNumber(number));
    }
    public static boolean primeNumber(int n){
        int count=0;
        for (int i = n; i >0; i--) {
            if (n%i==0){
                count++;
            }
        }
        if (count==2){
            return true;
        }else {
            return false;
        }
    }
}
