package thirdweek.test;

public class Test01 {
    public static void main(String[] args) {
        // 输出所有的水仙花数 3次方加起来等于这个数本身
        for (int i=100;i<=999;i++){
            int a=i/100;
            int b=i/10%10;
            int c=i%10;
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
    }
}
