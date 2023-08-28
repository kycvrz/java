import java.util.Scanner;

public class BinarySearch {
    // 输入一个数字，设计一个方法通过二分查找返回其位置（不存在-1）
    public static int binarySearch(int[] arr,int number){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<=end){
            if (number<arr[mid]){
                end=mid-1;
            }else if (number>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
            mid=(start+end)/2;
        }
//        if (start>end){
            return -1;
//        }
    }
    public static void main(String[] args){
        int[] arr={23,45,54,68,76,99};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number=sc.nextInt();
        int Index=binarySearch(arr,number);
        System.out.println(number+"在数组中的位置是："+Index);
    }
}
