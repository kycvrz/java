public class Test {
    public static void main(String[] args) {
        Son son=new Son("张三",18,"云创动力");
        son.info();
        son.print();
        Father father=new Son("王五",22,"开发喵");
        father.info();
        father.name="李四";
        father.age=28;
        father.print();
    }
}
