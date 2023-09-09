import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hi");
        Demo01<String> demo01 = new Demo01<>();
        System.out.println(demo01.test1("迪丽热巴"));
        demo01.test(new Movie("封神第一部",2023));
        // 泛型类 泛型接口 泛型方法
    }
}

class Demo01<T> { // 泛型类

    public Demo01() {
    }

    public T test1(T name) { // 普通方法
        return name;
    }

    public <E> void test(E e) { // 泛型方法(没有返回值)
        return;
    }

    public <A> String test03(A a) { // 泛型方法(有返回值)
        return (String) a;
    }
}

class Movie {
    private String name;
    private int date;

    public Movie(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
