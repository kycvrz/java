import java.util.Arrays;

public class Exam02 {
    public static void main(String[] args){
        String text= """
                hello world""";
        String[] str1=text.split("");
        System.out.println(Arrays.toString(str1));
        char[] str= text.toCharArray();
        System.out.println(Arrays.toString(str));
        String str2="hello world";
        System.out.println(text.equals(str2));
    }
}
