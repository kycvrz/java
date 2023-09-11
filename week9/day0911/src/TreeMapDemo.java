import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
//        TreeMap<String,Integer> treeMap=new TreeMap<>();
//        treeMap.put("成毅",31);
//        treeMap.put("罗云熙",35);
//        treeMap.put("黄子韬",30);
//        System.out.println(treeMap);
        TreeMap<Actor,Integer> treeMap=new TreeMap<>(new Comparator<Actor>() { // 匿名类
            @Override
            public int compare(Actor o1, Actor o2) {
                return o1.getAge()- o2.getAge();// 按照年龄排序
            }
        });
        treeMap.put(new Actor("成毅",31,"莲花楼"),1);
        treeMap.put(new Actor("罗云熙",35,"长月烬明"),3);
        treeMap.put(new Actor("黄子韬",30,"谈判官"),5);
        treeMap.put(new Actor("杨紫",29,"长相思"),2);
        System.out.println(treeMap);
    }
}
class Actor{
    private String name;
    private int age;
    private String TVPlay;

    public Actor(String name, int age, String TVPlay) {
        this.name = name;
        this.age = age;
        this.TVPlay = TVPlay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTVPlay() {
        return TVPlay;
    }

    public void setTVPlay(String TVPlay) {
        this.TVPlay = TVPlay;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", TVPlay='" + TVPlay + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return age == actor.age && Objects.equals(name, actor.name) && Objects.equals(TVPlay, actor.TVPlay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, TVPlay);
    }
}
