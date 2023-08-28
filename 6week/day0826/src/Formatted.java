import java.util.Arrays;

public class Formatted {
    public static void main(String[] args) {
        String name="张三三";
        int age=22;
        String str = String.format("我叫%s,今年%d。", name, age);
        System.out.println(str);
        byte[] s=name.getBytes();
        System.out.println(Arrays.toString(s));
        String str1=name.indent(1);
        System.out.println(str1);
        System.out.println(name.isEmpty());
        System.out.println(name.replaceFirst("三","1"));
        System.out.println(Arrays.toString(name.split("三",2)));
        char[] chars={'1','2'};
        System.out.println(name.translateEscapes());
    }
}
