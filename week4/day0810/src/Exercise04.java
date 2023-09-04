import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        // 编写一个方法 isBothConditionsTrue(boolean condition1，boolean
        // condition2)，该方法接收两个布尔类型的参数 condition1 和 condition2，判断
        // 这两个条件是否都为 true。如果两个条件都为 true，则返回 true，否则返回false
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int con1=sc.nextInt();
        System.out.println("请再输入一个数字");
        int con2=sc.nextInt();
////        boolean condition1=true;
////        boolean condition2=true;
        boolean condition1=con1>con2;
        boolean condition2=con1>con2;
        System.out.println(isBothConditionsTrue(condition1,condition2));
    }
    public static boolean isBothConditionsTrue(boolean condition1,boolean condition2){
        return condition1 && condition2;
    }
}
