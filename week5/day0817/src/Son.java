public class Son extends Father{
    String school;
    public Son(){}
    public Son(String name,int age,String school){
        super(name, age);
        this.school=school;
    }
    public void info(){// 重写
        System.out.println(name+age+school);
    }
    public void print(){// 重写
        super.print();
        System.out.println(school);
    }
}
