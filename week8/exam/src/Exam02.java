import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Exam02 {
    public static void main(String[] args) {
//        String str1="anagram";
//        String str2="nagaram";
        String str1="rat";
        String str2="car";
        System.out.println(yiWei(str1,str2));
    }
    public static boolean yiWei(String str1,String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character,Integer> map1=new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c=str1.charAt(i);
            map1.compute(c, new BiFunction<Character, Integer, Integer>() {
                @Override
                public Integer apply(Character character, Integer integer) {
                    return integer==null?1:integer+1;
                }
            });
        }
//        map1.forEach((key,value)-> System.out.println(key+","+value));
        Map<Character,Integer> map2=new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            char c=str2.charAt(i);
            map2.compute(c, new BiFunction<Character, Integer, Integer>() {
                @Override
                public Integer apply(Character character, Integer integer) {
                    return integer==null?1:integer+1;
                }
            });
        }
//        map2.forEach((key,value)-> System.out.println(key+","+value));
        return map1.equals(map2);
    }
}
