public class StudentTest {
    public static void main(String[] args) {
        Student stu=new Student("李四",18,180063,96.5);
//        System.out.println(stu.getName());
//        System.out.println(stu.getAge());
//        System.out.println(stu.getStudentId());
//        System.out.println(stu.getScore());
        System.out.println("姓名："+stu.getName()+",年龄："+stu.getAge()+",学号："+stu.getStudentId()+",成绩："+stu.getScore());
        System.out.println(stu.setScore(99));
        Student stu1=new Student("张三",22,180064,93);
//        System.out.println(stu1.getName());
//        System.out.println(stu1.getAge());
//        System.out.println(stu1.getStudentId());
//        System.out.println(stu1.getScore());
        System.out.println("姓名："+stu1.getName()+",年龄："+stu1.getAge()+",学号："+stu1.getStudentId()+",成绩："+stu1.getScore());
        System.out.println(stu1.setScore(94));
    }
}
