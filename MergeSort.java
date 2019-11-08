package PaiXuSuanFa;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    int [] arr =new int[]{1,2,1,4,3,9};
    mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int []arr, int low,int high){
        if(low<high){int middle =(low+high)/2;
        mergeSort(arr,low,middle);//处理左边
        mergeSort(arr,middle+1,high);//处理右边
       //归并
        merge(arr,low,middle,high);
        }
    }
    public static void merge(int [] arr,int low ,int middle, int high){
        //用于存储归并后的数组
        int  [] temp=new int[high-low+1];
        int i =low;//记录第一个数组中需要遍历的下标
        int j =middle+1;//记录第二个数组中需要遍历的下标
        int index =0;//记录在临时数组中存放的下标
        //遍历两个数组中小的数，放入临时数组中
        while (i<=middle&&j<=high){
            if (arr[i] <= arr[j]) {//第一个数组中的数字更小，将小的存放在临时数组
                temp[index]=arr[i];
                i++;
            }else{                 //第一个数组中的数字更小，将小的存放在临时数组
             temp[index]=arr[j];
             j++;
            }
            index++;
        }
        //因为如果当某一边数组没有数字，就无法进入while循坏，所以将另一边剩的数据也要存入，如123  4536
        while (j<=high){
            temp[index]=arr[j];
            j++;
            index++;
        }
        while (i<=middle){
            temp[index]=arr[i];
            i++;
            index++;
        }
        for (int k = 0; k <temp.length ; k++) {
            arr[k+low]=temp[k];
        }
    }
}
