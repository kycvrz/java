import java.util.Arrays;

public class TestBook {
    private static Book[] books;
    public static void main(String[] args) {
        books=new Book[4];
        books[0]=new Book("java",8);
        books[1]=new Book("php",5);
        books[2]=new Book("python",3);
        books[3]=new Book("c++",6);
        quickSort(books);
        for (Book book:books) {
            System.out.println(book);
        }
//        System.out.println(Arrays.toString(books));
    }
    public static void quickSort(Book[] books){
        quickSort1(books,0,books.length-1);
    }
    public static void quickSort1(Book[] books,int left,int right){
        if (left<right){
            Book temp=books[left];
            int i=left;
            int j=right;
            while (i<j){
                while (i<j && books[j].getNo()>=temp.getNo()){ // 从右向左找比基准值小的值
                    j--;
                }
                while (i<j && books[i].getNo()<=temp.getNo()){ // 从左向右找比基准值大的值
                    i++;
                }
                if (i<j){
                    Book b=books[i];
                    books[i]=books[j];
                    books[j]=b;
                }
            }
            if (temp.getNo()>books[i].getNo()){
                books[left]=books[i];
                books[i]=temp;
            }
            quickSort1(books,left,i-1);
            quickSort1(books,i+1,right);
        }
        return;
    }
}
