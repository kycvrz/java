package exercise;

import java.util.Scanner;

public class UserLogin {
    // 使用字符串的功能完成登录案例。
    // 系统默认的登录名和密码是kfm/123456，请在控制台开发一个登录界面，
    // 接受用户输入的登录名和密码，判断用户是否登录成功，登录成功后展示：“欢迎进入系统！”，即可停止程序。（最多三次登录机会）
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=3;
        while(count>0){
            System.out.println("请输入用户名");
            String name= sc.next();
            System.out.println("请输入密码");
            String password=sc.next();
            if (userLogin(name,password)){
                loginSuccessfully();
                break;
            }else{
                count--;
                System.out.println("登录失败，你还有"+count+"次登录机会");
                if (count==0){
                    System.out.println("账户暂时被锁定");
                }
            }
        }
    }
    public static boolean userLogin(String name,String password){
        String defaultName="kfm";
        String defaultPassword="123456";
        for (int i = 0; i < name.length(); i++) {
            if (defaultName.compareTo(name)!=0){
                return false;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (defaultPassword.compareTo(password)!=0){
                return false;
            }
        }
        return true;
    }
    public static void loginSuccessfully(){
        System.out.println("欢迎进入系统");
        System.out.println();
    }
}
