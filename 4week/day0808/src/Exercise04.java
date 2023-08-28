import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        // 给定一个整数数组，输入一个值 n, 输出数组中第 n 大的数。
        // 输入 n 的值为 4，输出 3
        int[] arr = {2, 3, 1, 8, 3, 9, 6};
        // 进行排序(插入排序法)
        for (int i=1;i< arr.length;i++){
            int current=arr[i];// 第二位数字
            int Index=i-1;// 第一位数字
            while (Index>=0 && current>arr[Index]){
                arr[Index+1]=arr[Index];//互换数字
                Index--;
            }
            arr[Index+1]=current;
        }
        // 排序后的数组
        for (int a:arr) {
            System.out.print(a+"\t");
        }
        System.out.println();
        // 获取用户输入对象
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要找第几大数字");
        int num =sc.nextInt();
        while (true){
            if ((num-1)>=0 && (num-1)<arr.length){// 判断是否在长度范围内
                System.out.println(arr[num-1]);
                break;
            }else{
                System.out.println("输入数字无效，请重新输入");
                num= sc.nextInt();
            }
        }
    }
}
