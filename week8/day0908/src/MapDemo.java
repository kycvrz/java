import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // 添加元素
        map.put("apple",8);
        map.put("banana",4);
        map.put("peach",8);
        // 通过键获取值
        int a=map.get("apple");
        // 找所有的键
        System.out.println(map.keySet());
        System.out.println(a);
        // 迭代遍历集合
        Set<String> set=map.keySet();
        Iterator<String> iterator=set.iterator();
//        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
//        Iterator<Map.Entry<String,Integer>> iterator=entrySet.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            int s1=map.get(str);
            System.out.println(str+s1);
//            Map.Entry<String,Integer> entry=iterator.next();
//            System.out.println(entry.getKey()+entry.getValue());
        }
        // 增强for遍历
        for (String key:map.keySet()) {
            int value=map.get(key);
            System.out.println(key+value);
        }
        // lambda遍历
        map.forEach((key,value)-> {
            System.out.println(key+value);
        });
        //forEach遍历
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+integer);
            }
        });
    }
}
