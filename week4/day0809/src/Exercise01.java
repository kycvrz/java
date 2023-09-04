import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {
        char[][] chunxiao = {
            { '春' , '眠' , '不' , '觉' , '晓' } ,
            { '处' , '处' , '闻' , '啼' , '鸟' } ,
            { '夜' , '来' , '风' , '雨' , '声' } ,
            { '花' , '落' , '知' , '多' , '少' }
        } ;
        for (int i = 0; i < chunxiao.length; i++) {
            for (int j = 0; j < chunxiao[i].length; j++) {
                System.out.print(chunxiao[i][j]+"\t");
            }
            System.out.println();
        }
        // 遍历数组
//        for (char[] a:chunxiao) {
//            for (char t:a) {
//                System.out.print(t);
//            }
//            System.out.println();
//        }
        // 遍历数组
//        for (int i=0;i<chunxiao.length;i++){
//            System.out.println(Arrays.toString(chunxiao[i]));
//        }
        // 旋转90度进行输出
        // 行标列 列变行
        for (int i = 0; i < chunxiao[0].length; i++) {// 遍历行也就是原来的列长度
            for (int j = chunxiao.length-1;j >=0; j--) {// 遍历列也就是原来行的长度
                System.out.print(chunxiao[j][i]+"\t");
            }
            System.out.println();
        }
        // 分析：
        // 二维数组的长度表示的是第一个长度
        // 原来数组的长度为4和5
        // 第一个数组的长度为5，第二个数组的长度为4
        // 定义一个新数组                    5                4
        char[][] chunxiao1=new char[chunxiao.length+1][chunxiao.length];
//        for (int i = 0; i < chunxiao1.length; i++) {// 第一个数组的长度
//            for (int j = 0; j < chunxiao[i].length; j++) { //第二个数组的长度
//                chunxiao1[i][j]=chunxiao[chunxiao.length-1-j][i];
//            }
//        }
        for (int i = 0; i < chunxiao1.length; i++) {
            for (int j = 0; j < chunxiao1[i].length; j++) {
//                char temp=chunxiao[i][j];
                System.out.print(chunxiao[chunxiao.length-j-1][i]+"\t");
//                chunxiao1[i][j]=chunxiao[chunxiao.length-j-1][i];
//                chunxiao[j][i]=temp;
            }
            System.out.println();
        }

        for (char[] a:chunxiao1) {
            for (char t:a) {
                System.out.print(t+"\t");
            }
            System.out.println();
        }
    }
}
