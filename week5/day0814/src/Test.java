import java.util.Scanner;

public class Test {
    public static void findPrimeFactors(int num, int divisor) {
        if (num <= 1) {
            return;
        }
        if (num % divisor == 0) {
            System.out.print(divisor + " ");
            findPrimeFactors(num / divisor, divisor);
        } else {
            findPrimeFactors(num, divisor + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要找哪个数的质因数");
        int num = sc.nextInt();
        System.out.print("质因数：" + num + " = ");
        findPrimeFactors(num, 2);
    }
}
