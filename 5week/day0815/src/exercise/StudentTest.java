package exercise;
public class StudentTest{
    public static void main(String[] args){
        // 创建Student对象
        Student message=new Student("张三","男",22,180063,98.5);
        // 访问say方法
        System.out.println(message.say());
        // 访问所有属性
        System.out.println("姓名："+message.name);
        System.out.println("性别："+message.gender);
        System.out.println("年龄："+message.age);
        System.out.println("编号："+message.id);
        System.out.println("成绩："+message.score);
    }
}
// Student类
class Student {
    // 编写一个Student类，包含name、gender、age、id、score属性，分别为String、String、int、int、double类型。
    // 类中声明一个say方法，返回String类型，方法返回信息中包含所有属性值。在另一个StudentTest类中的main方法中，
    // 创建Student对象，并访问say方法和所有属性，并将调用结果打印输出
    String name;
    String gender;
    int age;
    int id;
    double score;
    // 构造方法没有返回值
    public Student(String name,String gender,int age,int id,double score) {
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.id=id;
        this.score=score;
    }
    // 方法有返回值String
    public String say(){
        return name+"是一个"+gender+"生,今年"+age+"岁,编号为："+id+",成绩为："+score;
    }
}

