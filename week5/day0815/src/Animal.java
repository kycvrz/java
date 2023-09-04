public class Animal {
    String name;
    int age;
    int weight;
    public Animal(){// 无参构造
        System.out.println("无");
    }
    public Animal(String name, int i, int i1) {// 有参构造
        System.out.println(name);
        System.out.println(i);
    }
    public Animal(String name,int age){
        System.out.println(name);
        this.name=name;
    }
    public void eat(){

        System.out.println(name+"吃饭");
    }
    public void sleep(){

        System.out.println(name+"睡觉");
    }
    public static void main(String[] args) {
        Animal sc=new Animal();
        sc.name="猴子";
        sc.eat();
        Animal sc0=new Animal("长颈鹿",3);
        Animal sc1=new Animal("松鼠",2,30);

    }
}
