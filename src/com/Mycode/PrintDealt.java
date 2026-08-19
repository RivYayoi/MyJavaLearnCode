package com.Mycode;

public class PrintDealt {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int i1 = 5; i1 >= i; i1--) {
                System.out.print(" ");
            }
            for (int i1 = 0; i1 <= i; i1++) {
                System.out.print("#");
            }
            for (int i1 = 0; i1 < i; i1++) {
                System.out.print("#");
            }
        }
    }
}
