package exercise.married;
import java.util.Objects;
public class Person {
    // 有一个类 CAB ，有一个 canMarry 方法，接收两个 Person 对象，返回 boolean 值表示两个人能否结婚。
    // 结婚的条件：男生22周岁，女生20周岁，必须是一男一女，并且两者都未婚。
    private String name;
    private Character gender;
    private Integer age;
    private Boolean marry;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Character getGender() {
        return gender;
    }
    public void setGender(Character gender) {
        this.gender = gender;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Boolean getMarry() {
        return marry;
    }
    public void setMarry(Boolean marry) {
        this.marry = marry;
    }
    public Person() {
    }
    public Person(String name, Character gender, Integer age, Boolean marry) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.marry = marry;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", marry=" + marry +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(gender, person.gender) && Objects.equals(age, person.age) && Objects.equals(marry, person.marry);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age, marry);
    }
    public static boolean canMarry(){
        return false;
    }
}
