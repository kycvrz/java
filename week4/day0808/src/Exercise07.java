public class Exercise07 {
    public static void main(String[] args) {
        // 给定两个各不包含重复元素的数组 arr 和 arr1 ，求 arr 和 arr1 的交集(在 arr 中有，
        // arr1 中也包含的元素集合)，将交集中的元素放到一个数组中并输出。
        // 输出: [2, 3]
        int[] arr = {1,2,3,4,5,8,9};
        int[] arr1 = {2,3,4,9,10,7};
        int count=0;
        // 计算出重复的数有几个
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i]==arr1[j]){
                    count++;
                    break;
                }
            }
        }
        // 定义一个新数组
        int[] arr3=new int[count];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i]==arr1[j]){
                    arr3[j]=arr[i];
                }
            }
        }
        // 输出新数组的值
        for (int a:arr3) {
            System.out.print(a+"\t");
        }
    }
}
