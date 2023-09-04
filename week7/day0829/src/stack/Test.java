package stack;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("张三",2,18,78);
        Student student1=new Student("李四",4,23,87);
        MyStack myStack=new MyStack(10);
        myStack.push(student);
        myStack.push(2);
        myStack.push(student1);
        System.out.println("栈顶元素为："+myStack.pop());
        System.out.println("栈是否有空白："+myStack.isEmpty());
        System.out.println("栈中元素的个数为："+myStack.size());
        System.out.println(myStack);
    }
}
