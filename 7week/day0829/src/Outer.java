public class Outer {
    public Outer(){}
    class Inter{
        public void test(){
            System.out.println("Inter-test");
        }
    }
}
class China{

    public China(){

    }
    class City{
        public void test(){
            System.out.println("China-test");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inter inter=outer.new Inter();
        inter.test();
        China china=new China();
        China.City city=china.new City();
        city.test();
    }
}
