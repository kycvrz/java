public class Sub extends Super{
    static Super s1=new Super(1);// 第一步
    Super s2=new Super(3);// 第三步
    Sub(int i){
        super(i);
//        new Super(i);
//        new Super(i);
        System.out.print("Sub"+i+",");// 第四步
    }
    public static void main(String[] args){
        Super c1=new Sub(2);// 第二步
    }
}
class Super{
    Super(int i){
        System.out.print("Super"+i+",");
    }
}
