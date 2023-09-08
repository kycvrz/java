import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add("whb");
        hashSet.add("lyq");
        hashSet.add("xj");
        hashSet.add("zxy");
        System.out.println(hashSet.size());
        // iterator()方法
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //forEach(Consumer)
        hashSet.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });
        //Iterable
        hashSet.forEach(obj -> System.out.println(obj));
        hashSet.clear();
        System.out.println(hashSet.size());
        Object[] objects=hashSet.toArray(); // 转化为数字
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
