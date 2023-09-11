package exec;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exec03 {
    public static void main(String[] args) {
        // 有一个员工类Employee,里面有name、age和salary字段。
        // 请通过 Stream 对多个Employee对象按salary排序,然后取前3个输出。
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("张三",35,6000.0));
        list.add(new Employee("李四",25,5500.0));
        list.add(new Employee("王五",33,5800.0));
        list.add(new Employee("赵七",29,8000.0));
        List<Employee> list1 = list.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getSalary(),o2.getSalary());
            }
        }).limit(3).collect(Collectors.toList());
        System.out.println(list1);

    }
}
class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }
}
