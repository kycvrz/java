public class Exercise01_1 {
    public static void main(String[] args) {
        // 如果是一首词该如何旋转输出：
        // 十年生死两茫茫，不思量，自难忘。
        // 千里孤坟，无处话凄凉。
        // 纵使相逢应不识，尘满面，鬓如霜。
        // 夜来幽梦忽还乡，小轩窗，正梳妆。
        // 相顾无言，惟有泪千行。
        // 料得年年肠断处，明月夜，短松冈。
        char[][] arr=new char[][]{
                {'十','年','生','死','两','茫','茫','，','不','思','量','，','自','难','忘','。'},
                {'千','里','孤','坟','，','无','处','话','凄','凉','。'},
                {'纵','使','相','逢','应','不','识','，','尘','满','面','，','鬓','如','霜','。'},
                {'夜','来','幽','梦','忽','还','乡','，','小','轩','窗','，','正','梳','妆','。'},
                {'相','顾','无','言','，','惟','有','泪','千','行','。'},
                {'料','得','年','年','肠','断','处','，','明','月','夜','，','短','松','冈','。'},
        };
        // 遍历循环输出
//        for (char[] a:arr) {
//            for (char t:a) {
//                System.out.print(t);
//            }
//            System.out.println();
//        }
        // 旋转90度
        char[][] arr1=new char[16][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr1[j][arr.length-i-1]=arr[i][j];
            }
        }
        for (char[] a:arr1) {
            for (char t:a) {
                System.out.print(t+"\t");
            }
            System.out.println();
        }
        // 遍历数组
        for (int i = 0; i < arr[0].length; i++) {
            for (int j=arr.length-1;j>=0;j--){
                if (i<=arr[j].length-1){
                    System.out.print(arr[j][i]+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
