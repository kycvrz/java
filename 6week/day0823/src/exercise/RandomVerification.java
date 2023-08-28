package exercise;

import java.util.Arrays;
import java.util.Random;

public class RandomVerification {
    public static void main(String[] args) {
        // 使用String来开发验证码。需求如下：
        // 实现随机产生验证码，验证码的每位可能是数字、大写字母、小写字母。
        int length=8;// 定义验证码的长度
//        String str=randomVerification(length);// 返回字符串
//        System.out.println(str);
        System.out.println(randomVerification(length));
    }
    /**
     * 获取随机验证码
     * @param length 获取一个长度
     * @return 返回随机的字符串
     */
    public static String randomVerification(int length){
        // 也可以用switch随机
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] chars=new char[length];// 建一个字符数组储存随机的字符
        for (int i = 0; i < length; i++) {
            chars[i]=str.charAt(new Random().nextInt(str.length()));
        }
//        String string=new String(chars);
//        return string;
        return new String(chars);
    }
}
