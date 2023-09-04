import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        // 给定一个整数数组，输入一个值 n, 输出去掉数组中第 n 大的数后的数组。
        int[] arr=new int[]{34,89,47,39,54};
        // 插入排序
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];// 第二位数
            int Index=i-1;// 第一位数
            while (Index>=0 && current>arr[Index]){
                arr[Index+1]=arr[Index]; // 互换位置
                Index--;
            }
            arr[Index+1]=current;
        }
        // 排序后的数组
        for (int a:arr) {
            System.out.print(a+"\t");
        }
        System.out.println();
        // 用户输入需要出去第几大数字
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要去除第n大的数字");
        int n= sc.nextInt();
        // 找出第n大相对应的数字
        // 将第n大数字移动到最后一位
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            if (i==n-1){
                System.out.println(arr[i]);
                temp=arr[arr.length-1];
                arr[arr.length-1]=arr[i];
                arr[i]=temp;
            }
        }
        // 互换之后的数组
        for (int a:arr) {
            System.out.print(a+"\t");
        }
        System.out.println();

        // 定义一个新的数组
        int[] arr1=new int[arr.length-1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr[i];
            System.out.print(arr1[i]+"\t");
        }
        sc.close();
    }
}
