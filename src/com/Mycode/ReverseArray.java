package com.Mycode;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};
        for (int array : arrays) {
            System.out.print(array);
        }
        System.out.println();
        for (int array : reverseArray(arrays)) {
            System.out.print(array);
        }
    }

    public static int[] reverseArray(int[] arrays) {
        int[] temp;
        temp = new int[arrays.length];
        for (int i = 0, j = arrays.length - 1; i < arrays.length; i++, j--) {
            temp[j] = arrays[i];
        }
        return temp;
    }
}
