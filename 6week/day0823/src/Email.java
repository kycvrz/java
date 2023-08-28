import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        //  // 必须包含“@”和“.”；“@”必须在“.”的前面；“@”只能出现一次；不能以“@”开头；不能 以“.”结尾。
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入邮箱");
        String email= sc.next();
        while(true){
            if (email.indexOf("@")>=0 && email.indexOf(".")>=0 // 必须包含“@”和“.”
                    && email.lastIndexOf("@")<=email.indexOf(".") // “@”必须在“.”的前面
                    && email.lastIndexOf("@")==email.indexOf("@") // “@”只能出现一次
                    && email.indexOf("@")<email.indexOf(".") // @ 要在 . 的前面
                    && !email.startsWith("@")// 不能以“@”开头
                    && !email.endsWith(".")// 不能 以“.”结尾
            ) {
                break;
            }else{
                System.out.println("输入有误,请重新输入邮箱");
                email=sc.next();
            }
        }
    }
}
