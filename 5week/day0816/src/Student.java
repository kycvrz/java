public class Student {
    // 创建一个学生类 编写一个名为 Student 的类
    // 属性：姓名（name）、年龄（age）、学号（studentId）、成绩（score）
    // 方法：构造方法、获取姓名的方法、获取年龄的方法、获取学号的方法、获取成绩的方法、设置成绩的方法
    private String name;
    private int age;
    private int studentId;
    private double score;
    public Student(String name,int age,int studentId,double score){
        this.name=name;
        this.age=age;
        this.studentId=studentId;
        this.score=score;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getStudentId(){
        return studentId;
    }
    public double getScore(){
        return score;
    }
    public double setScore(double score) {
        if (score>90){
            score=83;
        }
        return score;
    }
}
