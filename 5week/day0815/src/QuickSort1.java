import java.util.Arrays;

public class QuickSort1 {
    public static void main(String[] args){
        int[] arr={67,80,-1,56,14,-44,77,39,21};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void quickSort(int[] arr,int left,int right){
        if (left<right){
            int pivot=arr[left];
            int startIndex=left;
            int endIndex=right;
            while(startIndex<endIndex){
                while(startIndex<endIndex && pivot<=arr[endIndex]){// 从右向左找比基准值小的值
                    endIndex--;
                }
                while (startIndex<endIndex && pivot>=arr[startIndex]){// 从个左向右找基准值大的值
                    startIndex++;
                }
                if (startIndex<endIndex){// 从右边向左找到的最小值和从左向右找到的最大值进行比较然后交换
                    int temp=arr[startIndex];
                    arr[startIndex]=pivot;
                    pivot=temp;
                }
            }
            if (arr[startIndex]<pivot){//当从右边向左找到的最小值和从左向右找到的最大值重合时
                arr[left]=arr[startIndex];// 把这个值去和基准值比较然后进行交换
                arr[startIndex]=pivot;
            }
            quickSort(arr,left,startIndex-1);// 基准值左边元素再去进行同样的方法进行找基准值排序
            quickSort(arr,startIndex+1,right);// 基准值右边的元素再进行同样的方法找基准值比较排序
        }
    }
}

