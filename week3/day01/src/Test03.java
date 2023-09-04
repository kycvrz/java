import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int num = input.nextInt();
		boolean num1 = num % 2 != 0;
		System.out.println(num+"是奇数吗？"+num1);


		System.out.println("请输入一个数字");
		int phone = input.nextInt();
		double a = 6.95;
		int b = 8;
		boolean c = phone >= 6.95 && phone >= 8;
		System.out.println("手机内存是否满足需求"+c);
	}
}
