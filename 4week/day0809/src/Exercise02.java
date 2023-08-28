import java.util.Arrays;

public class Exercise02 {
    public static void main(String[] args) {
        // 设 names 数组中存放学生姓名
        String[] names = { "安琪拉" , "王昭君" , "蔡文姬" , "妲己" , "张良" };
        // 设 courses 数组中依次存放三门课程的名称
        String[] courses = { "C++" , "Java" , "Python" };
        // 设 scores 数组中依次存储的是 names 数组中各个学生的 C++ 、Java 、Python 课程的成绩
        int[][] scores = {
                { 90 , 89 , 75 } ,
                { 59 , 40 , 100 } ,
                { 100 , 99 , 80 } ,
                { 80 , 61 , 61 } ,
                { 60 , 100 , 99 } ,
        };
        // 采用以下程序可以输出每个学生的姓名以及该学生各门课程的成绩
//        for( int i = 0 ; i < scores.length ; i++ ){
//            System.out.print( names[ i ] + " => " ); // 输出学生姓名
//            for( int j = 0 ; j < scores[ i ] .length ; j++ ){
//                System.out.print( courses[ j ] + ":");// 输出课程名称
//                System.out.print( scores[ i ][ j ] ); // 输出课程成绩
//                if( j < scores[ i ] .length - 1 ) {
//                    System.out.print( " , " );
//                }
//            }
//            System.out.println();
//        }
        // 设计程序按照各个学生的 Java 成绩进行排序 ( 降序 )
        // 分析 先找出java所对应的下标
        // 第一个数：[i=1][j=1] 第二个数：[i=2][j=1] 第三个数 [i=3][j=1]
        int k=1;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length-1;j++) {
                if (scores[j][k]<scores[j+1][k]){// 判断
//                    scores[j][k]=scores[j][k]^scores[j+1][k];
//                    scores[j+1][k]=scores[j][k]^scores[j+1][k];
//                    scores[j][k]=scores[j][k]^scores[j+1][k];
//                    int temp=scores[j+1][k];
//                    scores[j+1][k]=scores[j][k];
//                    scores[j][k]=temp;
                    // 比较的是值，排序的是数组
                    int[] temp=scores[j];
                    scores[j]=scores[j+1];
                    scores[j+1]=temp;

                }
            }
        }
        // 输出java成绩排好的二维数组
        for (int i = 0; i < scores.length; i++) {
            System.out.println(Arrays.toString(scores[i]));
        }
    }
}
