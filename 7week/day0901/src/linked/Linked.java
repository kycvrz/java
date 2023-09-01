package linked;

import java.security.PublicKey;
import java.util.Objects;

public class Linked {
    private Node first;
    private int size;

    /**
     * 链表添加值
     *
     * @param obj 获取添加的值
     * @return 是否添加成功
     */
    public boolean add(Object obj) {
        Node node = new Node(obj, null);
        if (first == null) {// 判断第一个是否为空，如果为空，则把node赋给first
            first = node;
            size++;
            return true;
        }
        Node t = first;
        while (t.getNext() != null) {// node 有属性value和next
            t = t.getNext();// 不是空的时候找下一个，一直找到空的才添加
        }
        t.setNext(node);// 把传进来的值添加到空的地方
        size++;
        return true;
    }

    /**
     * 删除元素
     *
     * @param obj 获取删除元素的值
     * @return 是否删除成功
     */
    public boolean remove(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Node t = first; // 当前值
        Node prev = null; // 前一个值
        while (!Objects.equals(t.getValue(), obj)) { // 找出传进来值的位置 不相等的时候
            if (t.getNext() == null) {
                return false;
            }
            prev = t;
            t = t.getNext();
        }
        if (prev == null) { // 如果删除的是第一个值
            Node next = first.getNext(); // 就让前面的值等于first
            first.setNext(null);// first的next就等于null
            first = next;
            size--;
            return true;
        }
        prev.setNext(t.getNext());// 前一个next的值等于删除元素next 已经存储起来了
        t.setNext(null); // 再让删除元素的next等于null 断开连接之后就找不到了 所以就删除了
        size--;
        return true;
    }

    public boolean delete(Object obj) {
        if (isEmpty()) {
            return false;
        }
        // 如果删除第一个元素，并且只有一个元素
        if (Objects.equals(first.getValue(), obj)) {
            if (first.getNext() == null) {
                first = null;
                size--;
                return true;
            }
        }
        // 删除第一个元素，还有其他元素
        if (Objects.equals(first.getValue(), obj)) {
            first = first.getNext();
            size--;
            return true;
        }
        // 删除其他元素 找删除的元素位置
        Node t = first;// 表示前一个元素
        while (!Objects.equals(t.getNext().getValue(), obj)) { // t.getNext()表示第二个元素
            t = t.getNext();// 表示前一个元素
            if (t.getNext() == null) {
                return false;
            }
        }
        Node node = t.getNext();// 找到了要删除的元素
        t.setNext(node.getNext());
        node.setNext(null);
        size--;
        return true;
    }

    /**
     * 链表是否为空
     *
     * @return 返回链表是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 链表的长度
     *
     * @return 返回链表的长度
     */
    public int size() {
        return size;
    }

    /**
     * 将链表转换成字符串 Linked[元素, 元素, ...]
     *
     * @return 返回该字符串
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("Linked[");
        Node node = first;
        for (int i = 0; i < size; i++) {
            sb.append(node.getValue());
            if (node.getNext() != null) {
                sb.append(",");
            }
            node = node.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * 获取值的下标
     *
     * @param obj 获取到值
     * @return 返回下标
     */
    public int indexOf(Object obj) {
        if (isEmpty()) {
            return -1;
        }
        Node node = first;
        int index = 0;
        while (!Objects.equals(node.getValue(), obj)) {
            if (node.getNext() != null) {
                node = node.getNext();
                index++;
            } else {
                return -1;
            }
        }
        return index;
    }

    /**
     * 获取该下标所在的值
     *
     * @param index 获取下标
     * @return 返回该值
     */
    public Object get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getValue();
    }

    /**
     * 判断包不包含这个元素
     *
     * @param obj 获取这个元素
     * @return 是否包含
     */
    public boolean contains(Object obj) {
//        int index=indexOf(obj);
//        if (index==-1){
//            return false;
//        }else {
//            return true;
//        }
        if (isEmpty()) {
            return false;
        }
        Node node = first;
        while (node != null) {
            if (Objects.equals(node.getValue(), obj)) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }
}
