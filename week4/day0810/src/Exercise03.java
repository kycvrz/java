import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        //  编写一个方法 isInValidRange(int number)，该方法接收一个整数参数
        // number，判断该数是否在有效范围内。有效范围定义为大于等于 0 且小于等于 100。
        // 如果在有效范围内，则返回 true，否则返回 false。
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number=in.nextInt();
//        isInValidRange(number);
        System.out.println(number+"大于等于 0 且小于等于 100吗？"+isInValidRange(number));
    }
    public static boolean isInValidRange(int number){
        return number>=0 && number<=100;
//        if (number>=0 && number<=100){
//            System.out.println(number+"在有效范围内吗？"+true);
//        }else{
//            System.out.println(number+"在有效范围内吗？"+false);
//        }
    }
}
