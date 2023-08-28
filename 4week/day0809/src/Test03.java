public class Test03 {
    public static void main(String[] args) {
        // 二分查找
        // 输入一个值找到相对应的下标
        int[] arr= {1,2,3,7,8,10};
        int key=9;
        int start =0;
        int end =arr.length-1;
        int mid =(start+end)/2;
        // 比较中间值和这个值，做相对应的判断
        while(end>=start){
            if (arr[mid]>key){
                end=mid-1;// 当这个值大时，则在前面，end=mid-1
            }else if (arr[mid]<key){
                start=mid+1;// 当这个值小时，则在后面，start=mid+1
            }else{// arr[mid]==key
                System.out.println(mid);
                break;
            }
            mid=(start+end)/2;
            // 当这个值数组中没有时，也就是开始下标大于最后下标
            // (也就是找到最后一位比较的数的，开始下标和最后下标相等时还未找到，所以start+1/end-1时 start>end)
            if (start>end){
                System.out.println(-1);
            }
        }
    }
}
