package com.Mycode;
import java.util.Scanner;
public class Calculation {
    enum Operation{
        ADD,SUB,MUL,IV,EXIT
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        while (true) {
            System.out.println("请输入操作(ADD/SUB/MUL/IV/EXIT)：");
            String input = sc.next().toUpperCase();
            if (input.equals("EXIT")) {
                break;
            }
            Operation op;
            try {
                op = Operation.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("输入错误，请输入有效操作");
                continue;
            }
            System.out.println("请输入第二个数字：");
            int b = sc.nextInt();
            int result = 0;
            switch (op) {
                case ADD:
                    result = add(a, b);
                    break;
                case SUB:
                    result = sub(a, b);
                    break;
                case MUL:
                    result = mul(a, b);
                    break;
                case IV:
                    result = div(a, b);
                    break;
                default:
                    break;
            }
            System.out.println("当前结果：" + result);
            a = result;
        }
        System.out.println("最终结果：" + a);
        sc.close();
    }

    public static int add(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int mul(int a, int b){
        return a * b;
    }
    public static int div(int a, int b){
        return a / b;
    }
}