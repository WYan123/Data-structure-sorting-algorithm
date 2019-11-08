package PaiXuSuanFa;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
     int arr[]=new int[] {3,4,6,7,2,7,2,8,0};
     quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[],int start,int end){
        if(start<end){                     //最开始的要求，也是递归的前提
            //把数组中第0个数字当作标准数
            int  stard =arr[start];
            int low = start;//记录需要排序的下标
            int high = end;
            //循坏比标准数大的数，比标准数小的数
            while(low<high){
                //右边数字比标准数大，下标移动
                while(low<high&&stard<=arr[high]){
                    high--;
                }
                //右边小，使用右边数字替换左边数字
                arr[low]=arr[high];
                //如果左边数字比基准数字小，移动下标
                while (low<high&&arr[low]<stard){
                    low++;
                }
                //如果左边数字比基准数字大，使用左边数字赋值给右边
                arr[high]=arr[low];
            }// 循坏结束后，low与high重合，需要将基准数赋值给其一即可
            arr[low]=stard;
            //处理所有基准数左边小的数字
            quickSort(arr,start,low);
            //处理所有基准数右边边大的数字
            quickSort(arr,low+1,end);               //如果这样则一直递归下去，所以判断start<end
        }

    }

}
