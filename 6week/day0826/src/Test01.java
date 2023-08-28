import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        String str="-----ffff";
        String str3="";
        System.out.println(str3.length());
        String[] str2=str.split("");
        System.out.println(Arrays.toString(str2));// []
        System.out.println(str2.length);// 0
    }
}
