package exec;

import java.util.Objects;
import java.util.Vector;

public class StudentVector {
    // 创建⼀个Vector集合，⽤于存储学⽣的姓名。编写⼀个函数，接受⼀个学⽣姓名并将其添加到Vector中。
    // 然后编写另⼀个函数，接受⼀个学⽣姓名并从Vector中删除该姓名。最后，打印出Vector中所有的学⽣姓名。
    private Vector vector=new Vector();// 创建集合
    public StudentVector(){

    }
    public boolean add(String studentName){
        return vector.add(studentName);

    }
    public boolean remove(String studentName ){
        return vector.remove(studentName);
    }
    public void studentPrint(){
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }
    public static void main(String[] args) {
        StudentVector studentVector=new StudentVector();
        System.out.println(studentVector.add("成毅"));
        System.out.println(studentVector.add("张子豪"));
        System.out.println(studentVector.add("黄子韬"));
        System.out.println(studentVector.add("罗云熙"));
        System.out.println(studentVector.remove("黄子韬"));
        studentVector.studentPrint();
    }
}
