import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        // 编写一个方法 isEvenAndDivisibleByThree(int number)，该方法接收一个
        // 整数参数 number，判断该数是否既是偶数又能被3整除。如果是，则返回 true，否则
        // 返回 false。
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number=sc.nextInt();
//        isEvenAndDivisibleByThree(number);
        System.out.println(number+"既是偶数又能被3整除吗？"+isEvenAndDivisibleByThree(number));
    }
    public static boolean isEvenAndDivisibleByThree(int number){
        return number%3==0 && number%2==0;
//        if (number%3==0 && number%2==0){
//            System.out.println(number+"既是偶数又能被3整除吗？"+true);;
//        }else{
//            System.out.println(number+"既是偶数又能被3整除吗？"+false);;
//        }
    }
}
