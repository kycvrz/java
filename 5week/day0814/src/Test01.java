import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 编写一个方法，指定一个整数，找出这个数的质因数
        // 分析：这个数除以小于它的所有数==0时，再去判断小于它的这个数是否是质数，是的话输出
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要找哪个数的质因数");
        int number=sc.nextInt();
        primeFactor(number);
    }
    public static void primeFactor(int number){
        for (int i = 2; i <= number; i++) {
           while(number%i==0){
                System.out.print(i+"\t");
                number/=i;
            }
        }
    }

}
