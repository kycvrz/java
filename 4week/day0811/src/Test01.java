import java.util.Random;
import java.util.Scanner;

public class Test01 {
    // 1 --> 浇水 2 --> 修剪 3 --> 打药  4 --> 生虫
    // 树初始成长值，当成长值 归零或小于0时，树死亡
    // 分析：
    // 首先grow<0时小树死亡 反则输出小树成长值
    static int count=0;
    public static void main(String[] args){
        // 生成随机数
        Random rand = new Random();
        // 输入操作次数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入操作次数");
        int number= sc.nextInt();
        int count=0;
        int a=0;
        int grow = 11;
        for (int i = 0; i < number; i++) {
            int type = rand.nextInt(4)+1;
            System.out.println(type);
            switch (type){
                case 1:
                    grow=water(grow);
                    break;
                case 2 :
                    grow=cut(grow);
                    break;
                case 3 :
                    grow=fertilize(grow);
                    break;
                case 4 :
                    if (a==4){

                    }
                    grow=worms(grow);
                    break;
            }
            if (grow<=0){
                System.out.println("小树已死亡");
                break;
            }else{
                System.out.println("小树的成长值为："+grow);
            }
        }
    }
    /**
     浇水，每浇一次水成长值 +10
     */
    public static int water(int grow){
        return grow+=10;
    }
    /**
     修剪树，每修剪一次成长值 +5
     */
    public static int cut(int grow){
        return grow+=5;
    }
    /**
     打药，每打药一次成长值 +20
     */
    public static int  fertilize(int grow){
        return grow+=20;
    }
    /**
     生虫，每生虫一次成长值 -10
     连续生虫三次，生长值额外 - 20
     */
    public static int  worms(int grow){
        count++;
        if (count%3==0){
            return grow-=20;
        }else{
            return grow-=10;
        }
    }
}
