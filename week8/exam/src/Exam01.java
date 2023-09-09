import java.util.Arrays;
import java.util.Map;

public class Exam01 {
    public static void main(String[] args) {
//        String str="the sky is blue";
        String str="  hello world  ";
//        String str="a good   example";
        overturn(str);
    }
    public static void overturn(String str){
        String[] str1=str.split(" ");
//        for (int i = 0; i < str1.length; i++) {
//            System.out.println(str1[i]);
//        }
        String[] str2=new String[str1.length];
        for (int i = 0; i < str1.length; i++) {
            str2[i]=str1[str1.length-1-i];
        }
//        for (int i = 0; i < str2.length; i++) {
//            System.out.println(str2[i]);
//        }
        // 将字符数组转化为字符串转化为字符串
        String str3="";
        for (int i = 0; i < str2.length; i++) {
            str3+=str2[i]+" ";
        }
        str3=str3.trim();
        System.out.println(str3);
    }
}
