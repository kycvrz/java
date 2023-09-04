import java.util.Scanner;
import java.util.Random;
public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入生成密码的位数");
        int n=sc.nextInt();
        String password=randomPassword(n);
        System.out.println(password);
    }
    public static String randomPassword(int n){
        String str="";
        Random sc=new Random();
        for(int i=0;i<n;i++){
            int type=sc.nextInt(3);
            if(i==0){// 不能以数字开头
                type=sc.nextInt(2);
            }
            char c='1';
            switch(type){
                case 0 -> c=(char)(sc.nextInt(26)+65);// 大写字母
                case 1 -> c=(char)(sc.nextInt(26)+97);// 小写字母
                case 2 -> c= (char)(sc.nextInt(10)+48);// 数字
            }
            if(str.indexOf(c)==-1){
                str+=c;
            }else{
                i--;
            }
        }
        return str;
    }
}

