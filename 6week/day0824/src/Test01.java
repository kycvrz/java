import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
    public static void main(String[] args) {
        String str="12345";
        String regex = "\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
