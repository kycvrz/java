import java.util.Iterator;
import java.util.Objects;
import java.util.Vector;
import java.util.function.Consumer;

public class Actor {
    private String name;
    private String teleplay;
    private int viewCounts;

    public Actor(String name, String teleplay, int viewCounts) {
        this.name = name;
        this.teleplay = teleplay;
        this.viewCounts = viewCounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeleplay() {
        return teleplay;
    }

    public void setTeleplay(String teleplay) {
        this.teleplay = teleplay;
    }

    public int getViewCounts() {
        return viewCounts;
    }

    public void setViewCounts(int viewCounts) {
        this.viewCounts = viewCounts;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "演员：" + name +
                ", 电视剧：" + teleplay +
                ", 播放量：" + viewCounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return viewCounts == actor.viewCounts && Objects.equals(name, actor.name) && Objects.equals(teleplay, actor.teleplay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teleplay, viewCounts);
    }
}

class ActorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(new Actor("赵丽颖", "花千骨",18008));
        vector.add(new Actor("成毅", "莲花楼",20000));
        vector.add(new Actor("罗云熙", "长月烬明",18000));
        vector.add(new Actor("杨紫","长相思",16900));
        viewCountsSort(vector);
        System.out.println("for 循环输出");
        // for 循环输出
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
        System.out.println("增强for循环");
        // 增强for循环
        for (Object v:vector) {// 不知道什么类型 所以都是Object
            System.out.println(v);
        }
        System.out.println("迭代输出 Integer");
        // 迭代输出 Iterator
        Iterator iterator=vector.iterator(); // 创建接口对象 调用iterator()方法
        while (iterator.hasNext()){ // 是否为空
            System.out.println(iterator.next()); // 表示当前元素，并且指向下一个元素
        }
        System.out.println("forEach(Consumer)方法");
        // forEach(Consumer)方法 创建匿名类
        vector.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });
        System.out.println("lambda表达式");
        // lambda表达式
        vector.forEach((obj)-> System.out.println(obj));
    }
    public static void viewCountsSort(Vector vector){
        // 冒泡排序
        for (int i = 0; i < vector.size()-1; i++) {
            for (int j = 0; j < vector.size()-i-1; j++) {
                Actor viewCounts1=(Actor) vector.get(j);
                Actor viewCounts2=(Actor)vector.get(j+1);
                if (viewCounts1.getViewCounts()<viewCounts2.getViewCounts()){
                    vector.set(j,viewCounts2);
                    vector.set(j+1,viewCounts1);
                }
            }
        }
        // 选择排序
        for (int i = 0; i < vector.size(); i++) {
            Actor viewCount1=(Actor) vector.get(i);
            int index=i;
            for (int j = i+1; j < vector.size(); j++) {
                Actor viewCount2=(Actor) vector.get(j);
                if (viewCount1.getViewCounts()<viewCount2.getViewCounts()){
                    index=j;
                }
            }
            viewCount1=(Actor)vector.get(index);
        }
    }
}
