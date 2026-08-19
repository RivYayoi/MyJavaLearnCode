package com.Mycode;

import java.util.Scanner;

public class sjxpd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一边");
        double a = sc.nextDouble();
        System.out.println("请输入第二边");
        double b = sc.nextDouble();
        System.out.println("请输入第三边");
        double c = sc.nextDouble();

        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                System.out.println("等边三角形");
            }else if (a == b || a == c || b == c) {
                System.out.println("等腰三角形");
            }else {
                System.out.println("普通三角形");
            }


        } else {
            System.out.println("非三角形");
        }
    }
}
