public class Test01 {
    public static void main(String[] args) {
        int[] arr =new int[]{4,7,2,6,10,3,5,12,1};
        // 选择排序
        for (int i = 0; i < arr.length; i++) {//控制循环的次数
            int temp=arr[i];// 定义一个数去跟每一个数去做比较
            for (int j=i+1;j<arr.length;j++) {// 控制每次比较多少次
                if (temp>arr[j]){
                    arr[i]=arr[j];// 进行互换位置
                    arr[j]=temp;
                    temp=arr[i];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
