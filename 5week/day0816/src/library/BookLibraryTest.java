package library;

import library.Book;
import library.Library;

import java.util.Scanner;

public class BookLibraryTest {
    static Library library=new Library();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // 完成以下功能
        // 添加图书
        // 查找图书
        // 显示图书列表。
        while(true){
            menu();
            System.out.println("请输入要操作的序号");
            int op = sc.nextInt();
            switch (op){
                case 1 ->showInfo();
                case 2 ->addBook();
                case 3 ->searchBook();
                case 4 ->{
                    System.out.println("退出成功");
                    return;
                }
            }
        }
    }
    public static void menu(){
        System.out.println("************");
        System.out.println("1.查看图书信息");
        System.out.println("2.添加图书");
        System.out.println("3.查找图书");
        System.out.println("4.退出");
        System.out.println("************");
    }
    public static void showInfo(){
        library.displayAllBooks();
    }
    public static void addBook(){
        System.out.println("请输入图书名称");
        String title= sc.next();
        System.out.println("请输入图书作者");
        String author= sc.next();
        System.out.println("请输入出版年份");
        int year= sc.nextInt();
        System.out.println("请输入图书价格");
        double price= sc.nextDouble();
        Book book=new Book(title,author,year,price);
        if (library.addBook(book)){
            System.out.println("添加成功"+book.getTitle());
        }else{
            System.out.println("添加失败");
        }
    }
    public static void searchBook(){
        System.out.println("请输入你要查找的图书名称：");
        String title= sc.next();
        Book book=library.findBook(title);
        if (book==null){
            System.out.println("没有此书");
        }else{
            System.out.println(book.info());
        }
    }
}
