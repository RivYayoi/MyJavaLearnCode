package com.Mycode;

import java.util.Arrays;

public class Two_dimensionalArray {
    public static void main(String[] args) {

        int[][] arrays = {{1,2},{4,5},{7,8}};
        System.out.println(Arrays.deepToString(arrays));
        for (int[] row : arrays) {
            Arrays.fill(row, 1);
        }
        System.out.println(Arrays.deepToString(arrays));

    }



}