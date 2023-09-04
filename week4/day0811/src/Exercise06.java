import java.util.Random;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        // 编写一个方法，接受一个整数数组和两个索引作为参数，交换数组中指定索引位置的两个元素
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组长度");
        int n=sc.nextInt();
        int[] arr=new int[n];
        Random in=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt(100);
        }
        int Index1=in.nextInt(n);
        System.out.println(Index1);
        int Index2= in.nextInt(n);
        System.out.println(Index2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        Array(arr,Index1,Index2);
        for (int t:arr) {
            System.out.print(t+"\t");
        }
    }
    public static void Array(int[] arr,int a,int b){
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
    }
}
