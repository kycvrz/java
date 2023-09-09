import java.util.Objects;

public class LinkedList<T> {
    private Node<T> first;// 链表的第一个值
    private int size;// 链表的大小/长度

    public LinkedList() {
    }

    /**
     * 获取链表的长度
     *
     * @return 返回链表的长度
     */
    public int size() {
        return size;
    }

    /**
     * @return 返回链表是否是空的
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @param o 获取一个值
     * @return 返回链表是否包含某个值
     */
    public boolean contains(Object o) {
        if (first == null) {
            return false;
        }
        Node<T> t = first;
        while (t != null) {
            if (t.value.equals(o)) {
                return true;
            }
            t = t.next;// 循环的终止条件(t.next也就是下一个Object的值)
        }
        return false;
    }

    /**
     * 添加元素到链表中
     *
     * @param o 参数对象
     * @return 是否添加成功
     */
    public boolean add(Object o) {
        // Object --> 放到Node对象里面去
        Node node = new Node();
        if (first == null) {
            first = node;
            size++;
            return true;
        }
//        System.out.println(t.next);
        Node t=first;// 因为要改变first，所以要储存起来
        while (t.next != null) {
            t=t.next;
        }
        t.next=node;
        size++;
        return true;
    }

    /**
     * 删除某个元素
     *
     * @param o 传一个值
     * @return 是否删除成功
     */
    public boolean remove(Object o) {
        if (isEmpty()){ //
            return false;
        }
        if (first == null) { // 空的
            return false;
        }
        Node t = first;
        if (t.next==null){ // 如果删除的是第一个元素
            size--;
            return true;
        }
        while (t != null) { // 如果删除的不是第一个元素
            if (t.value.equals(o)) {
                t = t.next;
                size--;
                return true;
            }
            t = t.next;
        }
        return false;
    }

    /**
     * 获取指定位置的元素
     *
     * @param index 获取一个下标
     * @return 返回对应下标的值
     */
    public Object get(int index) {
        if (first == null) {
            return null;
        }
        Node t = first;
        for (int i = 0; i < index; i++) {
            t = t.next;
        }
        return t.value;
    }

    /**
     * 返回指定元素的下标
     *
     * @param o 获取一个值
     * @return 返回该值的下标
     */
    public int indexOf(Object o) {
        Node t = first;
        int index = 0;
        while (t != null) {
            if (t.value.equals(o)) {
                return index;
            }
            t = t.next;
            index++;
        }
        return -1;
    }

    /**
     * 将链表转换成字符串 Linked[元素, 元素, ...]
     *
     * @return 返回字符串
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Linked[");
        Node t = first;
        while (t != null) {
            sb.append(t.value);
            if (t.next != null) {
                sb.append(",");
            }
            t = t.next;
        }
        sb.append("]");
//        String str="";
//        str+="Link[";
//        Node t=first;
//        while (t!=null){
//            str+=t.value;
//            if (t.next!=null){
//                str+=",";
//            }
//            t=t.next;
//        }
//        str+="]";
        return sb.toString();
    }

    class Node<T> {
        private T value;// 链表的第一个值
        private Node<T> next;// 链表的第二个值

        public Node() {
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(value, node.value) && Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, next);
        }
    }
}

