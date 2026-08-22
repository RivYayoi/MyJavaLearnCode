package com.Mycode;
import java.util.Arrays;

public class BubbleSort {
    static int temp = 0;
    static void main(String[] args) {

        int[] arr = {1,3,5,6,6,3,3,2,67,74};
        int[] reslut = BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] BubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j+1]){
                   temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
    return arr;
    }
}
