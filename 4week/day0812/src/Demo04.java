import java.util.Arrays;
import java.util.Scanner;

public class Demo04{
    public static void yaHui(int[][]arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=new int[i+1];
            for(int j=0;j<arr[i].length;j++){
                if(j==0 || i==j){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入杨辉三角的行数");
        int n=sc.nextInt();
        int[][] arr=new int[n][];
        yaHui(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}