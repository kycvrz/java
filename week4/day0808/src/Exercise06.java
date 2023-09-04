import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        // 给定一个整数数组，输入位置 n 和值 k。将值 k 插入到数组的第 n 位并输出新数组的每一个元素
        // 输入 n 为 3 , k 为 10 ，新数组为 [2, 3, 10, 1, 8, 3, 9, 6]
        int[] arr = {2, 3, 1, 8, 3, 9, 6};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入位置");
        int Index= sc.nextInt();
        System.out.println("请输入值");
        int num =sc.nextInt();
        // 定义一个新数组
        int[] arr1=new int[arr.length+1];
        for (int i=0;i<arr.length+1;i++){
            if (i==Index-1){// 找相对应的位置并进行赋值
                arr1[i]=num;
            }else if (i<Index-1){
                arr1[i]=arr[i];
            }else{
                arr1[i]=arr[i-1];
            }
        }
        // 输出新的数组
        for (int a:arr1) {
            System.out.print(a+"\t");
        }
    }
}
