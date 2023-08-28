import java.util.Arrays;

public class Exercise04 {
    public static void main(String[] args) {
        // 编写一个方法，接受一个字符数组，将其翻转并输出。
        char[][] chunxiao = {
                { '春' , '眠' , '不' , '觉' , '晓' } ,
                { '处' , '处' , '闻' , '啼' , '鸟' } ,
                { '夜' , '来' , '风' , '雨' , '声' } ,
                { '花' , '落' , '知' , '多' , '少' }
        };
        array(chunxiao);
        for (int i = 0; i < chunxiao.length; i++) {
            System.out.println(Arrays.toString(chunxiao[i]));
        }
    }
    public static void array(char[][] arr){
        int[][] a=new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][arr[i].length-j-1]+"\t");
                a[i][j]=a[i][arr[i].length-j-1];
            }
//            System.out.println();
        }
//        int maxLength=0;
//        for (int i = 0; i <=arr[i].length; i++) {
//            if (arr[i].length<arr[i+1].length){
//                maxLength=arr[i+1].length;
//            }
//        }
//        System.out.println(maxLength);
//        for (int i = 0; i < maxLength; i++) {
//            for (int j = arr.length; j >=0; j--) {
//                if (i<=arr[j].length-1){
//                    System.out.print(arr[j][i]+"\t");
//                }else{
//                    System.out.print("\t");
//                }
//            }
//        }
    }
}
