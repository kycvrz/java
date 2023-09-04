import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        // 编写一个方法 isPositiveAndGreaterThanTen(double number)，该方法接
        // 收一个双精度浮点数参数 number，判断该数是否是正数且大于 10。如果满足条件，则
        // 返回 true，否则返回 false
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个数字");
        double number= in.nextDouble();
//        isPositiveAndGreaterThanTen(number);
        System.out.println(number+"是否是正数且大于10:"+isPositiveAndGreaterThanTen(number));
    }
    public static boolean isPositiveAndGreaterThanTen(double number){
        return number>10;
//        if (number>10){
//            System.out.println(number+"大于10吗？"+true);
//        }else{
//            System.out.println(number+"大于10吗？"+false);
//        }
    }
}
