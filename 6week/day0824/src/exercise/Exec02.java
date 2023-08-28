package exercise;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exec02 {
    public static void main(String[] args) {
        // 随机生成 20 个 1~ 40 之间的不重复幸运数字存储到数组中。 要求:
        // 1.数组中的数字乱序
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要随机生成多少个数字");
        int number=sc.nextInt();
        System.out.println(Arrays.toString(randomNumber(number)));
    }
    public static int[] randomNumber(int number){
        Random in=new Random();
        int[] arr=new int[number];
        for (int i = 0; i < number;) {
            int n= in.nextInt(40)+1;
            if (hasNumber(arr,n,i)){
                arr[i++]=n;
            }
        }
        return arr;
    }
    public static boolean hasNumber(int[] arr,int n,int count){
        for (int i = 0; i < count; i++) {
            if (arr[i]==n){
                return false;
            }
        }
        return true;
    }
}
