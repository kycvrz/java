import java.util.Scanner;

public class Exercise1_2 {
    public static void main(String[] args) {
        // 编写一个Java程序，使用循环实现一个简单的登陆验证系统。系统预先设置一个用户名和密码，
        // 用户最多有3次输入机会。如果输入的用户名和密码与预设值匹配，则输出“登陆成功”，否则提示剩余尝试次数
        // 定义一个用户名 String name
        // 定义一个密码 String password
        Scanner sc=new Scanner(System.in);
        String name1="xujing";
        String password1="xj123";
        for (int i=3;i>=1;i--){
            System.out.println("请输入用户名");
            String name= sc.next();
            System.out.println("请输入密码");
            String password= sc.next();
            if (name.equals(name1) && password.equals(password1)){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("剩余次数为："+(i-1));
            }
        }
    }
}
