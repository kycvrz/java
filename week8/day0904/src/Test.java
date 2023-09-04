public enum Test {
    WZT("黄子韬",30),ZZH("张子豪",27);
    Test(String name, int age){
        this.name=name;
        this.age=age;
    }
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Test01{
    public static void main(String[] args) {
        Test wzt= Test.WZT;
        System.out.println(wzt.getName());
        System.out.println(wzt.getAge());
        Test zzh= Test.ZZH;
        System.out.println(zzh.getName());
        System.out.println(zzh.getAge());
        Test[] str= Test.values();
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+"\t");
            Test test=str[i];
            System.out.print(test.getName()+"\t");
            System.out.print(test.getAge()+"\t");
        }
        Test wzt01= Test.valueOf("WZT");// 找到这个对象
        System.out.println(Test.valueOf("ZZH"));// 输出这个对象
        System.out.println(wzt01.getName());
        wzt01.setName("成毅");
        System.out.println(wzt01.getName());
        System.out.println(wzt.ordinal());// 返回枚举常量在枚举中的索引
        System.out.println(zzh.ordinal());
    }
}
