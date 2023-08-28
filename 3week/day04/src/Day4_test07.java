package thirdweek.day04;

public class Day4_test07 {
    public static void main(String[] args) {
        // 输出乘法口诀表
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
