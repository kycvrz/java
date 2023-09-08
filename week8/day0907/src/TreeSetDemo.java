import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() { //
            @Override
            public int compare(Object o1, Object o2) {
                HonorOfKings h1 = (HonorOfKings) o1;
                HonorOfKings h2 = (HonorOfKings) o2;
                return h1.getIssueDate() - h2.getIssueDate();
            }
        });
        treeSet.add(new HonorOfKings("安琪拉", "心灵骇客", 2015));
        treeSet.add(new HonorOfKings("妲己", "时之彼端", 2013));
        treeSet.add(new HonorOfKings("小乔", "天鹅之梦", 2017));
        treeSet.add(new HonorOfKings("镜", "炽阳神光", 2023));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class HonorOfKings {
    private String role;
    private String skin;
    private int issueDate;

    public HonorOfKings() {
    }
    public HonorOfKings(String role, String skin, int issueDate) {
        this.role = role;
        this.skin = skin;
        this.issueDate = issueDate;
    }

    public String getRole() {
        return role;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(int issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "HonorOfKings{" +
                "角色：" + role + '\'' +
                ", 技能：" + skin + '\'' +
                ", 发行时间：" + issueDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HonorOfKings that = (HonorOfKings) o;
        return issueDate == that.issueDate && Objects.equals(role, that.role) && Objects.equals(skin, that.skin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, skin, issueDate);
    }
}
