import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "Hello, world!";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        System.out.println(str.length());
        String text = "Hello, World!";

        try {
            byte[] byte1 = text.getBytes("UTF-8");
            System.out.println("UTF-8 bytes: " + Arrays.toString(byte1));
        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported encoding: " + e.getMessage());
        }
        System.out.println(str.hashCode());
    }
}
