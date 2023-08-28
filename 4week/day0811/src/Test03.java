import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        // 计算阶乘
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if (n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
