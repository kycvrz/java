import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        // 给定一个整数数组，输入一个值 n ，输出 n 在数组中的下标(如果不存在输出 -1)
        // int[] arr = {3,2，1， 4，5};
        // 1.输入:3
        // 输出: 0
        // 2.输入: 6
        // 输出:-1
        // 定义数组arr
        int[] arr = {3,2,1,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n=sc.nextInt();
        // 判断n,并且找到下标
        for (int i = 0; i < arr.length; i++) {
            if (n==arr[i]){
                System.out.println(i);
                break;
            }else if (i==arr.length-1){// 找到最后一个还没有则输出-1
                System.out.println(-1);
            }
        }
//        // 判断n，并且找到相对应的下标
//        int Index=-1;// 初始化一个下标值
//        for (int i = 0; i < arr.length; i++) {
//            if (n==arr[i]) {
//                Index=i;
//            }
//        }
//        // 判断Index是否为-1
//        if (Index==-1){
//            System.out.println("你输入的"+n+"在数组中不存在，下标为："+Index);
//        }else{
//            System.out.println("你输入的"+n+"在数组中的下标为："+Index);
//        }
    }
}
