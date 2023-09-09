package exec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class Exec01 {
    public static void main(String[] args) {
        // 创建⼀个HashMap集合，使⽤三种遍历⽅式输出集合中的元素
        HashMap<Integer,Teleplay> hashMap=new HashMap<>();
        hashMap.put(1,new Teleplay("莲花楼","成毅"));
        hashMap.put(2,new Teleplay("长月烬明","罗云熙"));
        hashMap.put(3,new Teleplay("长相思","杨紫"));
        hashMap.put(4,new Teleplay("花千骨","赵丽颖"));
        hashMap.put(5,new Teleplay("谈判官","黄子韬"));
        // forEach 遍历
        hashMap.forEach(new BiConsumer<Integer, Teleplay>() {
            @Override
            public void accept(Integer key, Teleplay value) {
                System.out.println("序号:"+key+" "+value);
            }
        });
        // lambda表达式输出
        hashMap.forEach((key,value)-> System.out.println("序号:"+key+" "+value));
        // 迭代输出
        Iterator<Map.Entry<Integer,Teleplay>> iterator=hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Teleplay> entry=iterator.next();
            System.out.println("序号:"+entry.getKey()+" "+entry.getValue());
        }
        // 增强for遍历
        for (Integer t :hashMap.keySet()) {
            Teleplay teleplay=hashMap.get(t);
            System.out.println("序号:"+t+" "+teleplay);
        }

    }
}
class Teleplay{
    private String name;
    private String actor;

    public Teleplay(String name, String actor) {
        this.name = name;
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Teleplay{" +
                "电视剧：" + name +
                ", 演员：" + actor +
                '}';
    }
}
