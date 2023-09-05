package exec;

import java.util.Scanner;
import java.util.Vector;

public class StudentScore {
    // 创建⼀个Vector集合，⽤于存储⼀组学⽣的成绩。
    // 编写⼀个函数，接受⼀个分数范围，并返回在该范围内的学⽣数量。
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add(89);
        vector.add(99);
        vector.add(78);
        vector.add(65);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个范围");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        System.out.println(studentCounts(vector, number1, number2));

    }
    public static int studentCounts(Vector vector,int number1,int number2){
        Vector vector1=new Vector<>();
        int count=0;
        for (int i = 0; i < vector.size(); i++) {
            if ((int)vector.get(i)>=number1 && (int)vector.get(i)<=number2){
                count++;
            }
        }
        return count;
    }
}
