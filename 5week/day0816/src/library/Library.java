package library;

import library.Book;

public class Library {
    // 表示图书馆，包含属性：书库（使用数组保存图书）、添加图书的方法、查找图书的方法、显示所有图书的方法
    private Book[] books;// 设置属性数组
    private int numBooks;
    private static int count;
    public Library(){// 给数组定义长度
        numBooks=10;
        books=new Book[numBooks];
        books[0] = new Book("高等元素论", "mhy", 2019, 648);
        books[1] = new Book("小王子", "wy", 1980, 48);
        count = 2;
    }
    public Library(Book[] books){
        this.books=books;
    }
    public boolean addBook(Book book){//
        if (count>books.length-1) {
            return false;
        }
        books[count]=book;
        count++;
        return true;
    }
    public Book findBook(String title){// 查找图书并且返回
        if(title==null){
            return null;
        }
        for (int i = 0; i < count; i++) {
            if (title.equals(books[i].getTitle())) {
                return books[i];
            }
        }
        return null;
    }
    public void displayAllBooks() {
        System.out.println("图书库中所有图书：");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].info());
        }
    }
}
