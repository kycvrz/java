package prime;

public class Demo {
    public static int primeSum(int number){// 素数之和
        int sum=0;
        for (int i=1;i<number;i++){
            int count=0;
            for (int j = 1; j <=i; j++) {
                if (i%j==0){
                    count++;
                }
                if (count>2){
                    break;
                }
            }
            if (count==2){
                sum+=i;
            }
        }
        return sum;
    }
    public static void insertSort(int[] arr){// 插入排序
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            int prevIndex=i-1;
            for (; prevIndex >=0 && current>arr[prevIndex]; prevIndex--) {
                arr[prevIndex+1]=arr[prevIndex];
            }
            arr[prevIndex+1]=current;
        }
    }
    public static int binarySearch(int[] arr,int number){//二分查找
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (number<arr[mid]){
                end=mid-1;
            }else if (number>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
