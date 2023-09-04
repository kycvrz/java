package stack;

import java.util.Arrays;
import java.util.Objects;

public class MyStack extends Stack{
    Object[] arr;// 创建一个数组来储存
    int count;// 记录数组元素的下标
    int capacity=10;// 记录数组的长度
    public MyStack(Object[] arr){
        arr=new Object[capacity];
    }
    public MyStack(int capacity){
        if (capacity<0){
            capacity=10;
        }
        this.capacity=capacity;
        arr=new Object[capacity];
    }
    /**
     * 将元素压入栈顶
     * 入栈
     * @param element 要压入的元素
     */
    @Override
    void push(Object element) {
        grow();
        arr[count++]=element;
    }
    /**
     * 弹出栈顶元素并返回
     * 把栈顶元素删除，并返回
     * 出栈
     * @return 弹出的栈顶元素, 如果栈为空返回 null
     */
    @Override
    Object pop() {
        Object remove=arr[count-1];// 因为count已经++ 所以栈顶的下标是count-1;
        System.arraycopy(arr,0,arr,0,count-1);// 再把其他元素复制到当前数组中
        System.arraycopy(arr,count,arr,count-1,arr.length-count);// 当前元素不复制
        count--;// 现在栈顶元素已经出去了，所以当前栈顶的下标就是count--;
        return remove;
    }
    /**
     * 返回栈顶元素，但不弹出
     * @return 栈顶元素
     */
    @Override
    Object peek() {
        if (!isEmpty()){
            return arr[count-1];
        }
        return null;
    }
    /**
     * 检查栈是否为空
     * @return 如果栈为空则返回true，否则返回false
     */
    @Override
    boolean isEmpty() {
        return count==0;
    }
    /**
     * 返回栈中的元素个数
     * @return 栈中元素的个数
     */
    @Override
    int size() {
        return count;
    }
    public void grow(){// 数组的扩容
        if (count>= arr.length){
            Object[] newArr=new Object[capacity*3/2];// >>1：除2  <<1：乘2
            System.arraycopy(arr,0,newArr,0,arr.length);
            arr=newArr;
        }
//        int oldCapacity=arr.length;
//        int newCapacity=oldCapacity*2;
//        if (newCapacity>oldCapacity){
//            newCapacity=Integer.MAX_VALUE;
//        }
//        arr=Arrays.copyOf(arr,newCapacity);
    }
    @Override
    public String toString() {
        return "MyStack{" +
                "数组为：" + Arrays.toString(arr) +
                ", 栈中元素的个数：" + count +
                ", 数组长度：" + capacity +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStack myStack = (MyStack) o;
        return count == myStack.count && capacity == myStack.capacity && Arrays.equals(arr, myStack.arr);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(count, capacity);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }
}
