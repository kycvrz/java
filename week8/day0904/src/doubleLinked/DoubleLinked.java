package doubleLinked;

import java.util.Objects;

public class DoubleLinked {
    private Node first;
    private Node last;
    private int size;

    /**
     * 增加元素
     *
     * @param obj 获取元素
     * @return 是否添加成功
     */
    public boolean add(Object obj) {
        Node node = new Node(null, obj, null);
        if (first == null) {
            first = node;
            last = first;
            size++;
            return true;
        }
        last.next = node;
        node.prev = last;
        last = node;
        size++;
        return true;
    }

    public boolean firstRemove() { // 如果删除的是第一个元素
        if (first == null) {
            return false;
        }
        Node next = first.next;
        next.prev = null;
        first = next;
        size--;
        return true;
    }

    public boolean lastRemove() { // 如果删除的是最后一个元素
        if (last == null) {
            return false;
        }
        Node prev=last.prev;
        prev.next = null;
        last=prev;
        size--;
        return true;
    }

    /**
     * 删除元素
     *
     * @param obj 获取删除的元素
     * @return 是否删除成功
     */
    public boolean remove(Object obj) { // 删除其他元素
        if (Objects.equals(first.value, obj)) {
            firstRemove();
            return true;
        }else if (Objects.equals(last.value, obj)){
            lastRemove();
            return true;
        }else {
            Node t = first.next;
            while (!Objects.equals(t.value, obj)) {
                t = t.next;
                if (t == null) {
                    return false;
                }
            }
            Node prior = t.prev;
            Node latter = t.next;
            prior.next = latter;
            latter.prev = prior;
            t.prev = null;
            t.next = null;
            size--;
            return true;
        }
    }
    public int size() {// 链表长度
        return size;
    }

    public boolean isEmpty() { // 链表是否为空
        return size == 0;
    }

    public Object get(int index) { //返回该索引的值
        if (index < 0 || index >= size) {
            return null;
        }
        Node t = first;
        for (int i = 0; i < index; i++) {
            t = t.next;
        }
        return t.value;
    }

    public int indexOf(Object obj) { // 返回该值对应的下标
        if (isEmpty()) {
            return -1;
        }
        Node t = first;
        int index = 0;
        while (t != null) {
            if (Objects.equals(t.value, obj)) {
                return index;
            }
            t = t.next;
            index++;
        }
        return -1;
    }

    public boolean contains(Object obj) {// 是否包含该值
        if (isEmpty()) {
            return false;
        }
        Node t = first;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(t.value, obj)) {
                return true;
            }
            t = t.next;
        }
        return false;
    }

    public String toString() {
        if (isEmpty()) {
            return "";
        }
        Node t = first;
        StringBuilder sb = new StringBuilder("DoubleLinked[");
        while (t.next!=null){
            sb.append(t.value+",");
            t=t.next;
        }
        sb.append("]");
//        for (int i = 0; i < size; i++) {
//            sb.append(t.value);
//            if (t != null) {
//                sb.append(",");
//            }
//            t = t.next;
//        }
//        sb.append("]");
        return sb.toString();
    }

    class Node {
        private Node prev;
        private Object value;
        private Node next;

        public Node(Node prev, Object value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = last;
        }
    }
}

class Test {
    public static void main(String[] args) {
        DoubleLinked doubleLinked = new DoubleLinked();
        System.out.println("添加元素是否成功：" + doubleLinked.add("黄子韬"));
        System.out.println("添加元素是否成功：" + doubleLinked.add("张子豪"));
        System.out.println("添加元素是否成功：" + doubleLinked.add("成毅"));
        System.out.println("添加元素是否成功："+doubleLinked.add("李钟硕"));
        System.out.println("删除元素是否成功：" + doubleLinked.remove("成毅"));
        System.out.println("是否包含该元素：" + doubleLinked.contains("张子豪"));
        System.out.println("该元素所在的下标："+doubleLinked.indexOf("成毅"));
        System.out.println("链表的大小：" + doubleLinked.size());
        System.out.println("链表是否为空：" + doubleLinked.isEmpty());
        System.out.println("该索引处的值：" + doubleLinked.get(1));
        System.out.println(doubleLinked);
    }
}
