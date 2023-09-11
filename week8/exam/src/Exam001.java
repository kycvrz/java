import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exam001 {
    public static void main(String[] args) {
//        String str="a good   example";
        String str="  hello world  ";
//        String str="the sky is blue";
        String[] str1= str.split(" ");
        String str2="";
//        System.out.println(Arrays.toString(str1));
        for (int i = str1.length-1; i>=0; i--) {
//            System.out.println(str1[i]);
            if (str1[i]!=""){
                str2+=str1[i];
                if (i!=0){
                    str2+=" ";
                }
            }
        }
        str2=str2.trim();
        System.out.println(str2);

//        str3 = str3.replaceAll("\\s+", " ");// 把所有空格替换为一个空格
//        System.out.println(str3);
    }
}
