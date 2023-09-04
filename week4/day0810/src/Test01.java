public class Test01 {
    public static void main(String[] args) {
        // 定义一个5*5的二维数组并初始化，找出数组中的最大值的坐标。
        int[][] arr=new int[][]{
            {4,7,3,0,10},
            {3,7,46,55,38},
            {74,68,3,5,4},
            {99,54,27,9,56},
            {66,32,4,7,33}
        };
        // 分析：
        // 第一步找出每个一维数组中的最大值，再去比较各个一维数组中的最大值
        int Index1=0;
        int Index2=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[Index1][Index2]<arr[i][j]){
                    Index1=i;
                    Index2=j;
                }
            }

        }
        System.out.println(Index1+","+Index2);
//        for (int k = 0; k < arr.length; k++) {
//            int[] a=arr[k];
//            for (int i = 0; i < arr[0].length; i++) {
//                for (int j = 0; j < arr[i].length-1; j++) {
//                    if (a[j]<a[j+1]){
//                        a[j]=a[j]^a[j+1];
//                        a[j+1]=a[j]^a[j+1];
//                        a[j]=a[j]^a[j+1];
//                    }
//                }
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
