package thirdweek.day04;

public class Day4_test04 {
    public static void main(String[] args) {
        // 编写一个循环，计算并输出从 1 到 100 之间所有偶数的和
        int sum=0;
        for (int i =1;i<100;i++){
            if (i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
