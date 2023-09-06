import java.util.Comparator;
import java.util.Objects;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(new Student("张三", 29));
        vector.add(new Student("李四", 25));
        vector.add(new Student("王五", 23));
        vector.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Student d1 && o2 instanceof Student d2) { //向下转型
                    return d1.getAge()-d2.getAge();
                }
                return 0;
            }
        });
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }
}

class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
