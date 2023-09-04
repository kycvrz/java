package linked;

public class Test {
    public static void main(String[] args) {
        Linked linked=new Linked();
        System.out.println(linked.add("hi"));// true
        System.out.println(linked.add("hello"));// true
        System.out.println(linked.add("world"));// true
//        System.out.println(linked.toString());
        System.out.println("链表的大小："+linked.size());// 3
        System.out.println("链表是否为空："+linked.isEmpty());// false
        System.out.println("链表是否包含这个对象："+linked.contains(1));// false
        System.out.println("删除链表中的元素："+linked.remove("hi"));//true
        System.out.println("返回指定下标的元素："+linked.get(2));// world
        System.out.println("返回指定元素的下标："+linked.indexOf("hello"));// 1
        System.out.println(linked.toString());

    }
}
