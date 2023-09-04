import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name = input.next();
		System.out.println("请输入性别：");
		String gender = input.next();
		System.out.println("请输入年龄："); 
		int age = input.nextInt();
		System.out.println("请输入身高：");
		double height = input.nextDouble();
		System.out.println("【基本信息】");
		System.out.print("姓名："+name);
		System.out.print("  ");
		System.out.println("性别："+gender);
		System.out.print("年龄："+age+"岁");
		System.out.print("  ");
		System.out.print("身高："+height+"m");
		
	}
}