import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        // 对数组进行排序
        int[] arr=new int[]{2, 3, 1, 8, 3, 9, 6};
        arr1(arr);
    }
    // 访问修饰符 数据类型 方法名称 （参数）
    public static void arr1(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]<arr[j+1]){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
