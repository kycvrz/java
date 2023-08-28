package thirdweek.day04;

public class Day4_test12 {
    public static void main(String[] args) {
        // 编写程序输出1到100之间的质数和
        int sum=0;
        for (int i=1;i<=100;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
                if (count>2){
                    break;
                }
            }
            if (count==2){
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
