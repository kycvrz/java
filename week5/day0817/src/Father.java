public class Father {
    String name;
    int age;
    public Father(){}
    public Father(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void info(){
        System.out.println(name+age);
    }
    void print(){
        System.out.println(name);
        System.out.println(age);
    }
}
