package linked;

public class Test {
    public static void main(String[] args) {
        Linked linked=new Linked();
        System.out.println("添加元素是否成功："+linked.add("hi"));
        System.out.println("添加元素是否成功："+linked.add("hello"));
        System.out.println("添加元素是否成功："+linked.add("world"));
        System.out.println("添加元素是否成功："+linked.add("cat"));
        System.out.println("添加元素是否成功："+linked.add("dog"));
        System.out.println("添加元素是否成功："+linked.add("cow"));
        System.out.println("该下标所在链表中的元素："+linked.get(2));
        System.out.println("删除元素是否成功："+linked.remove("dog"));
        System.out.println("链表的大小："+linked.size());
        System.out.println("链表是否为空："+linked.isEmpty());
        System.out.println("该元素在链表中的下标："+linked.indexOf("world"));
        System.out.println("该下标所在链表中的元素："+linked.get(2));
        System.out.println("链表中包不包含该元素："+linked.contains("hello"));
        System.out.println(linked);
    }
}
