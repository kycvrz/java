import java.util.Arrays;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        // 编写一个杨辉三角
        Scanner in = new Scanner(System.in);
        System.out.println("请输入杨辉三角的长度");
        int n=in.nextInt();
        int[][] yaHui=new int[n][];
        yangHui(yaHui);

    }
    public static void yangHui(int[][] yaHui){
        for (int i = 0; i < yaHui.length; i++) {
            yaHui[i]=new int[i+1];
            for (int j = 0; j < yaHui[i].length; j++) {
                if (j==0 || j==i){
                    yaHui[i][j]=1;
                }else{
                    yaHui[i][j]=yaHui[i-1][j-1]+yaHui[i-1][j];
                }
            }
        }
        for (int i = 0; i < yaHui.length; i++) {
            System.out.println(Arrays.toString(yaHui[i]));
        }
    }
}
