public class Test02 {
    public static void main(String[] args) {
        int[] arr = new int[]{22,67,54,99,29,19,3,6};
        // 选择排序
        for (int j = 0; j < arr.length-1; j++) {
            int min=arr[j];
            int minIndex=j;
            for (int i = j+1; i < arr.length; i++) {// 每次都i等于前一位下标加1
                if (arr[minIndex]>arr[i]){
                    min=arr[i];
                    minIndex=i;
                }
            }
            arr[minIndex]=arr[j];
            arr[j]=min;
        }

        for (int a:arr) {
            System.out.print(a+"\t");
        }
    }
}
