import java.util.Objects;

public class Book {
    private String name;
    private int no;

    public Book() {
    }

    public Book(String name, int no) {
        this.name = name;
        this.no = no;
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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return no == book.no && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, no);
    }
}
