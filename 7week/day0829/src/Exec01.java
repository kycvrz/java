import java.util.Arrays;
import java.util.Scanner;

public class Exec01 {
    public static void main(String[] args) {
        // 编写一个函数，接受一个字符串数组作为输入，返回这些字符串的最长公共前缀
        // 输入: ["flower", "flow", "flight"]
        // 输出："fl"
        // 输入：["dog", "racecar", "car"]
        // 输出： ""
        // 输入：["apple", "appetite", "applicable"]
        // 输出： "app"
        String[] a={"flower","flow","flight"};
        String[] b={"dog","racecar", "car"};
        String[] c={"apple", "appetite", "applicable"};
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入字符串数组长度");
//        int n=sc.nextInt();
//        System.out.println("请输入字符串"+n+"个字符串");
//        String[] str=new String[n];
//        for (int i = 0; i < n; i++) {
//            str[i]=sc.next();
//        }
//        System.out.println(Arrays.toString(str));
        System.out.println(longestCommonPrefix(b));
    }
    public static String longestCommonPrefix(String[] str){
        String str1="";
        outer:for (int i = 0; i < str.length; i++) {
            for (int j = 1; j < str.length; j++) {
                if (str[i].charAt(i)==str[j].charAt(i)){
                    continue;
                }else{
                    break outer;
                }
            }
            str1=str[str.length-1].substring(0,i+1);
        }
        return str1;
    }
}
