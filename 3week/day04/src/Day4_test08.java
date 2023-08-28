package thirdweek.day04;

import java.util.Random;
import java.util.Scanner;

public class Day4_test08 {
    public static void main(String[] args) {
        // 随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中结束游戏
        // 生成一个1-100的数字 Random rand = new Random(); int number = rand.nextInt(100)+  [0,99]  [1,101]
        // 获取输入对象
        Random in =new Random();
        int number=in.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<100;i++){
            System.out.println("请输入一个数字");
            int a = sc.nextInt();
            if (a>number){
                System.out.println("数字过大");
            }else if (a<number){
                System.out.println("数字过小");
            }else if(number==a){
                System.out.println("恭喜你猜中了");
            }
        }

    }
}
