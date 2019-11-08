package PaiXuSuanFa;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 2, 8, 5, 9, 1, 0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int arr[]) {
        for (int i = 1; i < arr.length ; i++) {  //遍历所有数字
            if (arr[i] < arr[i - 1]) {
            int temp= arr[i];//把当前遍历数字存储起来
                //遍历当前数字前面所有数字
                int j;
                for ( j = i-1; j>=0&& arr[j]>temp ; j--) {
                //把前一个数字赋值给后一个
                    arr[j+1]=arr[j];
                }
                //把临时变量（外层for循坏的当前元素）赋值给不满足条件的后一个元素
                arr[j+1]=temp;
            }
        }
    }
}
