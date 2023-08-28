import java.util.Scanner;
public class Score{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入语文成绩");
		int Chinese = input.nextInt();
		System.out.println("请输入数学成绩");
		int Math = input.nextInt();
		System.out.println("请输入英语成绩");
		int English = input.nextInt();
		System.out.println("语文成绩为："+Chinese);
		System.out.println("数学成绩为："+Math);
		System.out.println("英语成绩为："+English);
	}
}
