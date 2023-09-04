package thirdweek.day04;

public class Day4_test {
    public static void main(String[] args) {
        // 输出所有的水仙花数
        for (int i=100;i<=999;i++){
            int a = i/100;
            int b = i/10%10;
            int c = i%10;
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.println(i+"是水仙花数");
            }
        }
    }
}
