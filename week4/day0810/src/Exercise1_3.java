public class Exercise1_3 {
    public static void main(String[] args) {
        // 编写一个Java程序，使用循环输出所有的完美数。完美数是等于其所有因子之和的正整数，如6=1+2+3。
        // 28=14+7+4+2+1。
        int i =1;
        while(true) {
            long sum=0;
            for (int j = 1;  j< i; j++) {
                if (i%j==0){
                    sum+=j;
                }
            }
            if (i==sum){
                System.out.println(i);
            }
            i++;
        }

    }
}
