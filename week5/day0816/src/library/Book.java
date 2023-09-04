package library;

public class Book {
    // 表示图书，包含属性：书名（title）、作者（author）、出版年份（year）、价格（price）
    private String title;
    private String author;
    private int year;
    private double price;
    public Book(){}
    public Book(String title, String author, int year, double price){
        this.title=title;
        this.author=author;
        this.year=year;
        this.price=price;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String info(){
        return "图书名称："+title+",作者:"+author+",出版年份："+year+",出售价格："+price;
    }
}
