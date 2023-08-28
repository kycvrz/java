import java.util.Random;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        // 编写一个方法，接受一个整数数组和一个正整数 k 作为参数，将数组中的元素左移 k 个位置。
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int n=sc.nextInt();
        int[] arr=new int[n];
        Random in=new Random();
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt(100);
            System.out.print(arr[i]+"\t");
        }
        System.out.println("请输入要左移几个元素");
        int k=sc.nextInt();
        numArray(arr,k);
        for (int a:arr) {
            System.out.print(a+"\t");
        }
    }
    public static void numArray(int[] arr,int k){
        if (k>arr.length-2 || k <1){
            System.out.println("输入不符合要求"+"\t");
        }else{
            Array(arr,k);
        }
    }
    public static void Array(int[] arr,int k){
        for (int i = 0; i <= k-1; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp=arr[arr.length-1-i];
                arr[arr.length-1]=arr[i];
                arr[arr.length-1-1-i]=temp;
            }
        }
/*
        for (int i = k; i < arr.length; i++) {
            int temp=arr[arr.length-1];
            arr[arr.length-1]=arr[k];
            arr[k]=temp;
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            arr[0]=arr[arr.length-1];
            count++;
        }
*/
    }
}
