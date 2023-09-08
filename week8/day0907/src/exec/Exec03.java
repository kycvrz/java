package exec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exec03 {
    public static void main(String[] args) {
        // 创建一个HashSet，包含一些单词。编写代码，找到集合中最长的单词。
        HashSet hashSet=new HashSet();
        hashSet.add("bird");
        hashSet.add("bee");
        hashSet.add("joy");
        hashSet.add("singing");
        hashSet.add("freedom");
        hashSet.add("love");
        hashSet.add("travel");
        hashSet.add("summer");
        hashSet.add("dream");
        hashSet.add("success");
        List list=new ArrayList(hashSet);
        String[] str=new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String str1=(String) list.get(i);
            str[i]=str1;
        }
        for (int i = 0; i < str.length; i++) {
//            if (){

//            }
        }
        String str2="";
        for (Object obj:hashSet) {
            String str1=(String) obj;
            if (str2.length()==0 || str1.length()>=str2.length()){
                str2=str1;
            }
        }
        System.out.println(str);
    }
}
