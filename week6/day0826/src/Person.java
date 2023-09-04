public class Person {
    Person(){
        System.out.println(2);
    }
}
class Child extends Person{
    Child(){
        System.out.println(1);
    }
    public static void main(String[] args) {
        new Child();
        new Person();
    }
}
