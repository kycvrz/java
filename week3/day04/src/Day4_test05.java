package thirdweek.day04;

public class Day4_test05 {

    public static void main(String[] args) {
        // 编写一个循环，计算并输出从 10 到1之间所有奇数的乘积
        int a=1;
        for (int i=10;i>=1;i--){
            if (i % 2 !=0){
                a=a*i;
            }
        }
        System.out.println(a);
    }
}
