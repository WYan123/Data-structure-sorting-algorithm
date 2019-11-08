package PaiXuSuanFa;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = { 4, 5, 1, 7, 0, 9, 6, 3, 2, 8 };
        bubbleSort(a);

    }
    public static void bubbleSort(int[] arr) {
        //控制多少轮
        for (int i = 1; i < arr.length; i++) {
            //控制每一轮的次数
            for (int j = 0; j <= arr.length -1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
