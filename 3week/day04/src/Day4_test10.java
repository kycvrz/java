package thirdweek.day04;

public class Day4_test10 {
    public static void main(String[] args) {
        // 画圣诞树
        int n = 3; // 2 * (n + 2) - 1
        for (int i = 1; i <= n; i ++) { // 循环行数
            // 6, 5，4, 3, 2   n - i + 2 空格
            // 1, 3, 5, 7, 9  2 * i - 1
            for (int j = 0; j < n - i + 2;j ++) { // 输出空格
                System.out.print("  ");
            }

            for (int j = 0; j < 2 * i - 1; j ++) { // 输出 *
                System.out.print("* ");
            }
            System.out.println(); // 一行输出结束 要换行
        }

        // 第二层
        for (int i = 1; i <= 3; i ++) { // 控制输出行数
            // 3, 2, 1 空格  n - i - 1
            // 7, 9, 11  2 * (i + n - 2) -1
            for (int j = 0; j < 3 - i + 1; j ++) { // 输出空格
                System.out.print("  ");
            }

            for (int j = 0; j < 2 * (i + n) - 5 ; j ++) {  // 输出 *
                System.out.print("* ");
            }

            System.out.println();  // 一行结束 输出换行

        }
        // 第三层
        for (int i = 1; i <= 3; i ++) { // 控制输出行数
            // 空格2 ， 1     3 - i   4 5 5 7
            // * 9 , 11, 13  2 * i + 2 * n - 3
            for (int j = 1; j <= 3 - i; j ++) {  // 输出空格
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * (n + i) -3; j ++) { // 输出 *
                System.out.print("* ");
            }
            System.out.println(); // 一行结束 输出换行
        }
        // 树干
        for (int i = 1; i <= 4; i ++) {
            for (int j = 1; j <= n - 1; j ++) {  // 输出空格
                System.out.print("  ");
            }

            for (int j = 1; j <= 4; j ++) {  // 输出 *
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
