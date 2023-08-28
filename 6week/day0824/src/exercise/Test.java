package exercise;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] arr={72, 101, 108, 108, 111};
        Charset charset = Charset.forName("UTF-8");
        String str=new String(arr);
        System.out.println(str);
        String str1=new String(arr,2,2);
        System.out.println(str1);
        String str2=new String(arr,3,2,charset);// 需要处理异常
        System.out.println(str2);
        byte[] byteArray = {72, 101, 108, 108, 111};
        try {
            String str3 = new String(byteArray, 1, 3, "UTF-8");
            System.out.println(str3);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported encoding: " + e.getMessage());
        }
    }
}
