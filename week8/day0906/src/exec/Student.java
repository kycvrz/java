package exec;

import java.util.*;

class studentTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Student students;
        for (int i = 1; i <= 20; i++) {
            int id = i;
            Random random = new Random();
            double score = random.nextDouble(60,100);
            students = new Student(id, score);
            arrayList.add(students);
        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
        arrayList.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student student = (Student) o1;
                Student student1 = (Student) o2;
                return (int) (student.getScore() - student1.getScore());
            }
        });
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Student student = (Student) arrayList.get(0);
        Student student1 = (Student) arrayList.get(arrayList.size() - 1);
        double minScore = student.getScore();
        double maxScore = student1.getScore();
        System.out.println("分数最低学生：" + student);
        System.out.println("分数最高学生：" + student1);

    }
}

public class Student {
    // 创建Student类，属性包括id[1-40],score[60-100], id属性⾃增，成绩属性随机⽣成。
    // 创建集合，保存20个对象，找到分数最⾼与最低的学⽣，使⽤List集合实现。
    private int id;
    private double score;

    public Student() {

    }

    public Student(int id, double score) {
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学号：" + id +
                ", 成绩：" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(student.score, score) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, score);
    }
}
