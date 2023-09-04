public abstract class Animal {
    // 动物继承层次
    // 设计一个关于动物的继承层次，包括一些基本的动物类型。
    // 1.创建一个抽象类 Animal，包含实例变量 name 和抽象方法 makeSound()
    // 2.派生出多个子类，如 Dog、cat 、cow，每个子类实现 makesound() 方法以发出相应的动物叫声
    // 3.创建一个 zoo类，其中有一个数组，用于存储不同类型的动物对象。展示它们的叫声。
    String name;
    public Animal(String name){
        this.name=name;
    };
    public abstract void makeSound();
}
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(super.name+"汪汪");
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(super.name+"喵喵");
    }
}
class Cow extends Animal{
    public Cow(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(super.name+"哞哞");
    }
}
class Zoo{
    Animal[] animals;
    public Zoo(Animal[] animals) {
        this.animals=animals;
    }
    public void makeSound(){// 遍历数组
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }
    }
}
class AnimalTest{
    public static void main(String[] args) {
//        Animal animal=new Dog("阿拉斯加");
//        animal.makeSound();
//        animal=new Cow("大黑牛");
//        animal.makeSound();
//        animal=new Cat("蓝猫");
//        animal.makeSound();
        Animal[] animals= {new Dog("阿拉斯加"),new Cat("小花猫"),new Cow("大黑牛")};
        Zoo zoo=new Zoo(animals);// 数组
        zoo.makeSound();// 输出内容
    }
}
