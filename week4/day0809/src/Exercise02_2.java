public class Exercise02_2 {
    public static void main(String[] args) {
        //设计程序，根据学生总成绩进行排序(降序排列)，并输出学生姓名、每门课程的名称和该学生的成绩、该学生的总成绩
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
        // 分析
        // 学生总成绩就是每个一维数的总和
        // 把每个一维数组加起来 并定义一个数组去储存总成绩
        // 先把一个一维数组相加
        int[] total=new int[scores.length];
//        int sum=0;
//        for (int j = 0; j < scores[0].length; j++) {
//            sum+=scores[0][j];
//        }
//        System.out.println(sum);

        // 遍历二维数组进行给一维数组赋值
        for (int i = 0; i < scores.length; i++) {// 遍历二维数
//            int sum1=0;
            for (int j = 0; j < scores[i].length; j++) {//遍历一维数组
                total[i]+=scores[i][j];
            }
//            total[i]=sum1;
        }
        // 输出相对应的总成绩
        for (int i = 0; i < total.length; i++) {
            System.out.println(total[i]);
        }
        // 使用冒泡排序 降序 总成绩进行排序
        // 冒泡排序的方法：两两进行比较
        // 姓名，课程名称的成绩，总成绩都是相对应的，总成绩进行排序时，姓名，课程名称的成绩也要相对应去变化
        for (int i = 0; i < total.length-1; i++) {
            for (int j = 0; j < total.length-i-1; j++) {
                if (total[j]<total[j+1]){
                    // 总成绩的排名
                    total[j]=total[j]^total[j+1];
                    total[j+1]=total[j]^total[j+1];
                    total[j]=total[j]^total[j+1];

                    // 姓名相对应也替换
                    String name=names[j];
                    names[j]=names[j+1];
                    names[j+1]=name;

                    // 课程的成绩相对应替换
                    int[] current=scores[i];// 是多个数组进行排序
                    scores[i]=scores[i+1];
                    scores[i+1]=current;
                }
            }
        }
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
        // 输出以总成绩排序的内容
        for( int i = 0 ; i < scores.length ; i++ ){
            System.out.print( names[ i ] + " => " ); // 输出学生姓名
            for( int j = 0 ; j < scores[ i ] .length ; j++ ){
                System.out.print( courses[ j ] + ":");// 输出课程名称
                System.out.print( scores[ i ][ j ]); // 输出课程成绩
                if( j < scores[ i ] .length - 1 ) {
                    System.out.print( " , " );
                }
            }
            System.out.print("\t总成绩："+total[i]);// 输出总成绩
            System.out.println();
        }
    }
}
