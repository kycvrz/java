import java.util.Random;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        // 随机排名
        // 需求：某公司开发部5名开发人员，要进行项目进展汇报演讲，现在采取随机排名后进行汇报。
        // 请先依次录入5名员工的工号，然后展示出一组随机的排名顺序。
        int[] nos=new int[5];
        Scanner in=new Scanner(System.in);
        Random sc=new Random();
        // 随机生成数字
        for (int i = 0; i < nos.length; i++) {
            System.out.println("请输入第"+(i+1)+"个员工工号");
            nos[i]=in.nextInt();
        }
        // 使用随机排名,遍历数组
        for (int i = 0; i < nos.length; i++) {
            int Index=sc.nextInt(nos.length);// 定义随机下标
            int temp=nos[Index];
            nos[Index]=nos[i];
            nos[i]=temp;
        }
        for (int a:nos) {
            System.out.println(a);
        }
    }
}
