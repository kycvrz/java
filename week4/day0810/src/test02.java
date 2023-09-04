public class test02 {
    public static void main(String[] args) {
        // 定义一个5*5的二维数组并初始化，找出最小值的坐标，计算出该坐标周边的所有元素之和
        int[][] arr=new int[][]{
                {4,7,3,18,10},
                {3,7,46,55,38},
                {74,68,3,5,4},
                {99,54,27,9,56},
                {66,32,4,7,33}
        };
        int sums=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sums+=arr[i][j];
            }
        }
        System.out.println(sums);
        int Index1=0;
        int Index2=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[Index1][Index2]>arr[i][j]){
                    Index1=i;
                    Index2=j;
                }
            }
        }
        System.out.println(Index1+","+Index2);
        // 计算周围总和
        int sum=(Index1==0 ? 0:arr[Index1-1][Index2] ) // 上
        + (Index1==arr.length-1 ? 0:arr[Index1+1][Index2])    // 下
        + (Index2==0 ? 0:arr[Index1][Index2-1])  // 左
        + (Index2==arr[0].length-1 ?0: arr[Index1][Index2+1]);  // 右
        System.out.println(sum);

//        int sums=0;
//        if (Index1!=0){
//            sums+=arr[Index1-1][Index2];
//        } else if(Index1!=arr.length-1) {
//            sums+=arr[Index1+1][Index2];
//        }else if (Index2!=arr[0].length-1){
//            sums+=arr[Index1][Index2+1];
//        }else if (Index2!=0){
//            sums+=arr[Index1][Index2-1];
//        }else{
//            sums+=0;
//        }
//        System.out.println(sums);
    }
}
