package thirdweek.test;

public class Test04 {
    public static void main(String[] args) {
        // 输出一个三角形
        int n=7;
        for (int i=1;i<=n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*i-1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
