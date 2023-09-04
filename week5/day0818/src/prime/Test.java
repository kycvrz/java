package prime;

import prime.Demo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(Demo.primeSum(100));
        int[] arr={5,-6,7,9,10,-1};
        Demo.insertSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Demo.binarySearch(arr,5));
    }
}
