import java.util.Random;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        // 一个班级有若干学生，每个学生的成绩以整数表示。请实现一个程序，
        // 根据学生的成绩对他们进行排名并输出。
        // 排名 成绩
        // 1 xxx
        // 2 xxx
        // 3 xxx
        // 键盘输入班级人数
        Scanner in=new Scanner(System.in);
        System.out.println("请输入班级学生人数");
        int num =in.nextInt();
//        Random sc=new Random();
        // 定义学生成绩数组(键盘输入)
        int[] scores=new int[num];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i+1)+"位学生成绩");
            scores[i]= in.nextInt();
        }
        // 使用选择排序
        // 第一步，默认最大值是第一位
        // 再从第二位开始进行比较进行
        for (int i = 0; i < scores.length; i++) {
            int max=scores[i];// 定义最大值
            int maxIndex=i;// 定义相对应的下标
            for (int j = i+1; j < scores.length; j++) {// 第二位进行比较，所以j=i+1 前一位数加1
                if (scores[j]>scores[maxIndex]){// 比较大小并进行互换位置(最大值跟下一位进行比较)
//                    max=scores[j];// 最大值就等于后面的数值
                    maxIndex=j;// 相对应最大值的下标
                }
            }
            // 进行互换
            scores[i]=scores[maxIndex];
            scores[maxIndex]=max;
//            scores[maxIndex]=scores[i];// 第二位开始的比较值
//            scores[i]=max;// 第一位就是最大值
        }
        System.out.println();
        // 输出排名和成绩
        System.out.println("排名"+"\t"+"成绩");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1)+"\t"+scores[i]);
        }
    }
}
