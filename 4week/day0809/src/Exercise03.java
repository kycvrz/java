import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        // 编写一个程序，生成一个给定行数的杨辉三角
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个杨辉三角");
        int num=sc.nextInt();
        int[][] arr = new int[5][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];// 数组定义一个新长度
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length-1 == j || j==0) { // 第一位和最后一位等于1
                    arr[i][j] = 1;
                } else{
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];// 不等于的时候就是上面一个加左上角
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
