package exec.queue;

import java.util.Arrays;
import java.util.Objects;

public class ArrayQueue extends Queue{
    private Object[] objs;
    private int count;
    private int capacity=10;
    public ArrayQueue() { //
        objs=new Object[capacity];
    }
    public ArrayQueue(int capacity){
        this.capacity=capacity;
        objs=new Object[capacity];
    }

//    public ArrayQueue(int capacity) {
//        this.capacity=capacity;
//        objs=new Object[capacity];
//    }
    private void grow(){ // 数组的扩容
        if (count>=objs.length){
            Object[] newObj=new Object[capacity*3/2];
            System.arraycopy(objs,0,newObj,0,capacity);
            objs=newObj;
        }
    }
    /**
     * 将元素插入队尾
     * @param element 要插入的元素
     * @return 返回这个元素
     */
    @Override
    void enqueue(Object element) {
        grow();
        objs[count++]=element;
    }
    /**
     * 移除并返回队首元素
     * 删除第一个元素，并返回
     * @return 队首元素, 如果队列为空时，返回 null
     */
    @Override
    Object dequeue() {
        Object removed=objs[0];
//        Object[] newObjs=new Object[objs.length];
        System.arraycopy(objs,1,objs,0,objs.length-1);
        count--;
        return removed;
    }
    /**
     * 返回队首元素，但不移除
     * @return 队首元素
     */
    @Override
    Object peek() {
        if (!isEmpty()){
            return objs[0];
        }
        return null;
    }
    /**
     * 检查队列是否为空
     * @return 如果队列为空则返回true，否则返回false
     */
    @Override
    boolean isEmpty() {
        return count==0;
    }

    /**
     * 队列的长度
     * @return 返回队列的大小
     */
    @Override
    int size() {
        return count;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "数组为：" + Arrays.toString(objs) +
                ", 数组元素个数：" + count +
                ", 数组长度：" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayQueue that = (ArrayQueue) o;
        return count == that.count && capacity == that.capacity && Arrays.equals(objs, that.objs);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(count, capacity);
        result = 31 * result + Arrays.hashCode(objs);
        return result;
    }
}
