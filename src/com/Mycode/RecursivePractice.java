package com.Mycode;

import java.util.Scanner;

public class RecursivePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int NumberIn = sc.nextInt();
        System.out.println(factorial(NumberIn));
        sc.close();
    }
    public static double factorial(double n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}
