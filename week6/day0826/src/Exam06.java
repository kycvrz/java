import java.util.Random;
import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要生成几位密码");
        int n=sc.nextInt();
        System.out.println(randomPassword1(n));
    }
    public static String randomPassword(int n){
        String str="ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz1234567890";
        String str1="ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz";
        Random sc=new Random();
        char[] c=new char[n];
        for (int i = 0; i < n; i++) {
            if (i==0){// 不能以数字开头
                c[i]=str.charAt(sc.nextInt(str1.length()));
            }else{
                c[i]=str.charAt(sc.nextInt(str.length()));
            }
        }
        return new String(c);
    }
    public static String randomPassword1(int n){
        Random sc=new Random();
        String str="";
        for (int i = 0; i < n; i++) {
            int type = sc.nextInt(3);
            if (i == 0) {// 不能以数字开头
                type = sc.nextInt(2);
            }
            char c = switch (type) {
                case 0 -> (char) (sc.nextInt(26) + 65);
                case 1 -> (char) (sc.nextInt(26) + 97);
                default -> (char) (sc.nextInt(10) + 48);
            };
            while (str.indexOf(c) != -1) {
                c = switch (type) { // 要有字母和数字
                    case 0 -> (char) (sc.nextInt(26) + 65);
                    case 1 -> (char) (sc.nextInt(26) + 97);
                    default -> (char) (sc.nextInt(10) + 48);
                };
            }
            str += c;
        }
        return str;
    }
}
