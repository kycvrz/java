package stack;

import java.util.Objects;

public class Student {
    private String name;
    private int no;
    private int age;
    private int score;

    public Student() {
    }

    public Student(String name, int no, int age, int score) {
        this.name = name;
        this.no = no;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "学生信息{" +
                "姓名：'" + name + '\'' +
                ", 学号：'" + no +
                ", 年龄：'" + age +
                ", 成绩：'" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no && age == student.age && score == student.score && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, no, age, score);
    }
}
