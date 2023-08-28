public class Exercise01 {
    public static void main(String[] args) {
        // 设计一个方法，用于计算整数的和
        int[][] arr=new int[][]{
                {76,44,53},
                {48,65,34,77},
                {24,7,99}
        };
        System.out.println(sumInteger(arr));

    }
    public static int sumInteger(int[][] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
