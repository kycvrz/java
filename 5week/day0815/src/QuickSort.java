import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] arr={67,80,-1,56,14,-44,77,39,21};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void quickSort(int[] arr,int left,int right){
        if (left>=right){
            return;
        }
        int pivot=arr[left];
        int startIndex=left;
        int endIndex=right;
        while(startIndex<endIndex){
            while(startIndex<endIndex && pivot<=arr[endIndex]){
                endIndex--;
            }
            while (startIndex<endIndex && pivot>=arr[startIndex]){
                startIndex++;
            }
            if (startIndex<endIndex){
                int temp=arr[startIndex];
                arr[startIndex]=pivot;
                pivot=temp;
            }
        }
        if (arr[startIndex]<pivot){
            arr[left]=arr[startIndex];
            arr[startIndex]=pivot;
        }
        quickSort(arr,left,startIndex-1);
        quickSort(arr,startIndex+1,right);
    }
}
