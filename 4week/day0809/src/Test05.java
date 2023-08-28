public class Test05 {
    public static void main(String[] args) {
        // 二维数组
        // 每个数组可以不同长度
        int[][] arr=new int[3][4];
        int[][] arr1=new int[][]{
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };
        // 遍历二维数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
            }
        }
        // 遍历二维数组
        for (int[] a:arr1) {
            for (int t:a) {
                System.out.println(t);
            }

        }
    }
}
