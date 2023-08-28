public class Idol {
    String names;
    int age;
    int height;
    double weight;
    String constellation;
    public void sing(){
        System.out.println("是不是"+names+"在这唱歌才能这么好听");
    }
    public void acting(){
        System.out.println("莲花楼是"+names+"演的,今年"+age+"岁,身高"+height+",体重"+weight+","+constellation);
    }
    public static void main(String[] args) {
        Idol sc=new Idol();
        sc.names="黄子韬";
        sc.sing();
        Idol sc1=new Idol();
        sc1.names="成毅";
        sc1.age=33;
        sc1.height=181;
        sc1.weight=140;
        sc1.constellation="金牛座";
        sc1.acting();
    }

}
