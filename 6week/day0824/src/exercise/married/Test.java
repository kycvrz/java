package exercise.married;
import static exercise.married.Cab.canMarry;
public class Test {
    public static void main(String[] args) {
        Person male=new Person("张三",'男',22,false);
        Person female=new Person("李四",'女',23,true);
        Person male1=new Person();
        Person female2=new Person();
        // 结婚的条件：男生22周岁，女生20周岁，必须是一男一女，并且两者都未婚。
//        Scanner sc=new Scanner(System.in);
//        System.out.println("判断两个人是否可以结婚");
//        System.out.println("请输入一个姓名");
//        male.setName(sc.next());
//        System.out.println("请输入"+male.getName()+"的年龄：");
//        male.setAge(sc.nextInt());
//        System.out.println(male.getName()+"男生还是女生");
//        male.setGender(sc.next().charAt(0));
//        System.out.println(male.getName()+"婚姻状态：");
//        System.out.println("1.未婚");
//        System.out.println("2.已婚");
//        int type= sc.nextInt();
//        male.setMarry(type==1 ? true:false);
//
//        System.out.println("请再输入一个姓名");
//        female.setName(sc.next());
//        System.out.println("请输入"+female.getName()+"的年龄：");
//        female.setAge(sc.nextInt());
//        System.out.println(female.getName()+"男生还是女生");
//        female.setGender(sc.next().charAt(0));
//        System.out.println(female.getName()+"婚姻状态：");
//        System.out.println("1.未婚");
//        System.out.println("2.已婚");
//        int type1= sc.nextInt();
//        female.setMarry(type1==1 ? true:false);
        if (canMarry(male,female)){
            System.out.println(male.getName()+"和"+female.getName()+"可以结婚");
        }else {
            System.out.println(male.getName()+"和"+female.getName()+"不可以结婚");
        }
//        if (canMarry(male1,female2)){
//            System.out.println(male.getName()+"和"+female.getName()+"可以结婚");
//        }else {
//            System.out.println(male.getName()+"和"+female.getName()+"不可以结婚");
//        }
    }
}
