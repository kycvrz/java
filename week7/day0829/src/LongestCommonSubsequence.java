import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        System.out.println("请输入一个字符串");
        String str1=sc.next();
        longestCommonSubsequence(str,str1);
    }
    public static void longestCommonSubsequence(String str,String str1){
        int m=str.length();
        int n=str1.length();
        int[][] arr=new int[m+1][n+1];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (str.charAt(i-1)==str1.charAt(j-1)){// 取字符串的每个字符
                    arr[i][j]=arr[i-1][j-1]+1;// 相等时， 左对角线加1
                }else{
                    arr[i][j]=Math.max(arr[i][j-1],arr[i-1][j]);// 不相等时 取左边和上面的最大值
                }
            }
        }
        for (int[] a:arr) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println(arr[m][n]);//

    }
}
