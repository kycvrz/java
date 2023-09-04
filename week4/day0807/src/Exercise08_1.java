package day0807;

public class Exercise08_1 {
    public static void main(String[] args) {
        int[] array = {3, 9, 2, 7, 6, 4, 8, 5};

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // 找到第一个偶数位置
            while (left < right && array[left] % 2 != 0) {
                left++;
            }

            // 找到第一个奇数位置
            while (left < right && array[right] % 2 == 0) {
                right--;
            }

            // 交换奇数和偶数位置的元素
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }

        // 打印结果
        System.out.println("奇数放在左边，偶数放在右边的结果：");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
