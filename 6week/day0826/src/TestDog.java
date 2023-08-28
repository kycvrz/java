public class TestDog{
    public static void main(String args[]){
        Animal a=new Animal();// 创建的是父类对象 访问父类的属性和方法
        // 创建的是子类对象，但是是通过父类引用 只能访问父类和子类共有的方法或属性
        Animal b=new Dog();// 向上转型 也就是父类引用调用相同方法名称的方法
        Dog c= (Dog) new Animal();// 向下转型 父类也可以访问子类的属性和方法或者重写方法
        c.a=1;
        c.bark();// 狗可以吠叫
        a.move();// 动物可以移动
        b.move();// 狗可以跑和走
//        b.bark();// brak是子类的方法，不能被访问
    }
}
class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog extends Animal{
    int a;
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}
