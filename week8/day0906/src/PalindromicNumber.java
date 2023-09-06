import java.util.LinkedList;
import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个数字，判断这个数字是不是回文数字");
        LinkedList linkedList=new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(3);
        for (int i = 0; i < linkedList.size(); i++) {
            int s1=(int)linkedList.getFirst();
            int s2=(int)linkedList.getLast();
            if (s1==s2){
                linkedList.removeFirst();
                linkedList.removeLast();
            }
        }
        if (linkedList.size()==0 || linkedList.size()==1){ // linkedList.size()>1 或者 linkedList.size()==0 || linkedList.size()==1
            System.out.println("是回文集合");
        }else {
            System.out.println("不是回文集合");
        }

    }
}
