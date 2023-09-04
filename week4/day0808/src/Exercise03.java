public class Exercise03 {
    public static void main(String[] args) {
        // 给定一个整数数组，编写一个程序，移除数组中的重复元素，输出一个去重后的数组。
        int[] arr=new int[]{78,54,36,36,36,44,75,36,33,75};
//        // 先进行排序(选择排序)
//        for (int i=0;i<arr.length;i++){
//            int min= arr[i];
//            int minIndex=i;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j]<arr[minIndex]){
//                    minIndex=j;
//                }
//            }
//            arr[i]=arr[minIndex];
//            arr[minIndex]=min;
//        }
//        // 输出数组数据
//        for (int a:arr) {
//            System.out.print(a+"\t");
//        }
//        System.out.println();
//         计算每个数字出现的次数
        // 定义一个新数组跟原数组长度相同
        int[] arr1=new int[arr.length];
        // 每当有重复值时不用放进去
        int count=0;// arr1的下标
        outer:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < count; j++) {
                // count是arr1的下标,每一个值去进行比较,如果值相等则进入外层的下一次循环,
                // 如果不相等则把这个值放进相对应下标的位置
                if (arr[i]==arr1[j]){// 判断这个数组里面是否有相同值，如果有的话，结束本次循环进入下一次循环
                    continue outer;// 结束当前循环进入下一次循环
                }
            }
            // 给arr1赋值
            arr1[count]=arr[i];// 把count作为arr1的下标，初始值为0,每当存进去一位时加1,则count就是下一位开始的下标
            count++;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(arr1[i]+"\t");
        }
        System.out.println();
        for (int a:arr1) {
            System.out.print(a+"\t");
        }
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            int count1=0;
//            for (int k = 0; k <arr.length ; k++) {
//                if (arr[i]==arr[k]){
//                    count++;
//                }
//            }
//            if (count1>1){
//                sum++;
//                System.out.println(i);
//            }
//        }
//        System.out.println(sum);
//        int[] arr1=new int[arr.length];
//        int temp=0;
//        for (int i = arr.length-1; i >=0; i++) {
//            if (i==1 || i==2||i==5||i==6){
//                temp=arr[arr.length-1];
//                arr[arr.length-1]=arr[i];
//                arr[i]=temp;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr1[i]+"\t");
//        }

    }
}
