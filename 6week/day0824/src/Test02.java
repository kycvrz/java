public class Test02 {
    public static void main(String[] args) {
        // int 类型转化为包装类 integer
        int a=new Integer(8);// 值、字符串、
        System.out.println(a);
        // 基本数据类型转化为包装类
        // Integer Double Byte Character Short Long Float Boolean
        Double b=new Double("78");// 值、字符串
        System.out.println(b);
        Double c=new Double(2);
        System.out.println(c);
        // 包装类转化为基本数据类型 value 是静态方法需要创建对象再去使用
        Double d=c.doubleValue();
        System.out.println(d);
        Integer i=c.intValue();
        System.out.println(i);
        // 自动转型 装箱
        Integer f=1;
        System.out.println(f);
        // 自动转型 拆箱 应用运算符的时候
        System.out.println(d+f);
    }
}
