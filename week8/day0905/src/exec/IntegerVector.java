package exec;

import java.util.Scanner;
import java.util.Vector;

public class IntegerVector {
    // 创建⼀个Vector集合，⽤于存储⼀组整数。编写⼀个函数，接受⼀个整数并返回在Vector中出现的次数。
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add(1);
        vector.add(4);
        vector.add(6);
        vector.add(1);
        vector.add(1);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字，判断在集合中出现的次数");
        int number=sc.nextInt();
        System.out.println(appearCounts(vector, number));
    }
    public static int appearCounts(Vector vector,int number){
        int count=0;
        for (int i = 0; i < vector.size(); i++) {
            if ((int)vector.get(i)==number){
                count++;
            }
        }
        return count;
    }
}
