package exercise.married;

public class Cab {
    // 有一个类 CAB ，有一个 canMarry 方法，接收两个 Person 对象，返回 boolean 值表示两个人能否结婚。
    // 结婚的条件：男生22周岁，女生20周岁，必须是一男一女，并且两者都未婚。
    public static boolean canMarry(Person male,Person female){
        if ( (((male.getGender()=='男' && male.getAge()>=22)
                && (female.getGender()=='女' && female.getAge()>=20))
                || ((female.getGender()=='男' && female.getAge()>=22)
                && (male.getGender()=='女' && male.getAge()>=20)))
                && male.getMarry() && female.getMarry() // 都是未婚
                && !male.getGender().equals(female.getGender()) // 一男一女
        ){
            return true;
        }
        return false;
    }
}
