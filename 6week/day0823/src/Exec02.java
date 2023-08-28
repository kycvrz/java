import java.util.Scanner;

public class Exec02 {
    public static void main(String[] args) {
        // 请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。
        // 比如:Hello12345World中字母: 10个，数字: 5个。
        // toCharArray() 判断是否是字母
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str= sc.next();
        countLetter(str);
    }
    public static void countLetter(String str){
        char[] chars=str.toCharArray();
        int letterCount=0;
        int figureCount=0;
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isLetter(i)){
                letterCount++;
            }else {
                figureCount++;
            }
        }
        System.out.println(letterCount);
        System.out.println(figureCount);
    }
}
