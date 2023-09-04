package exercise;
import java.util.Arrays;
import java.util.Scanner;
public class Exec03 {
    public static void main(String[] args) {
        // 编写一个程序，去除字符串中的重复字符。
        // 例如：输入 asdfgnasd ，输出 asdfgn
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
//        repetition(str);
        System.out.println(deleteRepeatLetter(str));
    }
    public static void repetition(String str){
//        char[] chars1=str.toCharArray();
        int count=0;
        char[] chars=new char[str.length()];
        outer:
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < count; j++) {
                if (chars[j]==str.charAt(i)){
                    continue outer;
                }
            }
            chars[count]=str.charAt(i);
            count++;
        }
        for (int i=0;i<count;i++) {
            System.out.print(chars[i]+"\t");
        }
    }
    public static String deleteRepeatLetter(String str){
        str=str.replace(" ","");
        String str1="";
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (str1.indexOf(c)==-1){// 查找字符对应的索引，如果没有 返回-1
                str1+=c;
            }
        }
        return str1;
    }
}
