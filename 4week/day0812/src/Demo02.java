import java.util.Scanner;

// 二分查找时数组必须是排好序的数组
public class Demo02{
    public static int binarySearch(int[] arr,int number){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
        }
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<=end){
            if(number<arr[mid]){
                end=mid-1;
            }else if(number>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
            mid=(start+end)/2;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr=new int[]{56,77,89,64,53};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要查找的数字");
        int number=sc.nextInt();
        int Index=binarySearch(arr,number);
        System.out.println(number+"在数组中的位置是"+Index);
    }
}