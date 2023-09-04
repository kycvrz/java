public class Test02 {
    public static void main(String[] args) {
        // 冒泡排序
        int[] arr =new int[]{4,7,2,6,10,3,5,12,1};
        for (int i=0;i<arr.length-1;i++){
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
        }
        for (int a:arr) {
            System.out.print(a+"\t");
        }
    }
}
