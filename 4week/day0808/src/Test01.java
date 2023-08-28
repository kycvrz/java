//package day0808;
import java.util.Random;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 选择排序
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组长度");
        int num=sc.nextInt();// 获取键盘输入的对象
        int[] arr=new int[num];// 定义数组
        Random in =new Random();// 随机生成数字
        for (int i = 0; i < arr.length; i++) { // 遍历数组
            arr[i]=in.nextInt(100);// 给数组赋值
            System.out.print(arr[i]+"\t");// 输出数组数据
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {// 遍历数组的每个数字
            int min=arr[i];// 定义最小值
            int minIndex=i;// 定义最小值的下标
            for (int j = i+1; j < arr.length; j++) {// 再跟每个数组中的每个值作比较
                if (arr[minIndex]>arr[j]){ // 找出最小值
                    min=arr[j];// 赋值给最小值
                    minIndex=j;// 交换下标,最小值的下标
                }
            }
            arr[minIndex]=arr[i];// 比较出来的最小值，也就是下标对应的值(也就是第一个值)
            arr[i]=min;// 再把最小值赋值给min(再把第一个值赋给最小值)
        }
        for (int i:arr) {
            System.out.print(i+"\t");
        }
    }
}
