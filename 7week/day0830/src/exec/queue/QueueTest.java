package exec.queue;

public class QueueTest {
    public static void main(String[] args) {
        ArrayQueue arrayQueue=new ArrayQueue();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        System.out.println("移除队首元素："+arrayQueue.dequeue());
        System.out.println(arrayQueue.toString());
        System.out.println("返回队首元素："+arrayQueue.peek());
        System.out.println("队列是否为空："+arrayQueue.isEmpty());
        System.out.println("队列大小："+arrayQueue.size());
    }
}
