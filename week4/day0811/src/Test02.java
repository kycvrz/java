import java.util.Scanner;

public class Test02 {
    // 方法的递归，调用自身的过程
    public static void main(String[] args) {
        // 斐波那契数字 1 1 2 3 5 8 13
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要打印第几个斐波那契数字");
        int num=sc.nextInt();
        int n=feiBo(num);
        System.out.println(n);
    }
    public static int feiBo(int num){
        if (num==1 || num==2){
            return 1;
        }else{
            return feiBo(num-2)+feiBo(num-1);
        }
    }
}
