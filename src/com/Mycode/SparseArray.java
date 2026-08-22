package com.Mycode;
import java.util.Arrays;
public class SparseArray {
    //全局声明
    static int[][] arrays_1 = new int[12][12];//原数组
    static int Effective_num = 0;//有效值

    //主函数
    static void main(String[] args) {

        arrays_1[6][6] = 1;
        arrays_1[7][7] = 2;
        System.out.println("原数组:");
        PrintArrays(arrays_1);
        Line();
        Calculate_the_effective_value();
        Line();
         SparseArray();
        Line();
    }
    //分割线
    public static void Line(){
        System.out.println("-----------------");
    }
    //输出数组
     public static void PrintArrays(int[][] arr) {
         for (int[] ints : arr) {
             System.out.println(Arrays.toString(ints) + "\t");
         }

    }
   //计算有效值
    public static void Calculate_the_effective_value(){
        for (int i = 0; i < arrays_1.length; i++) {
            for (int j = 0; j < arrays_1.length; j++) {
                if (arrays_1[i][j] != 0)
                    Effective_num++;
            }
        }
        System.out.print("有效值为:");
        System.out.println(Effective_num);
    }
    //稀疏数组
    public static void SparseArray(){
        int[][] arrays_2 = new int[Effective_num + 1][3];
        arrays_2[0][0] = 12;
        arrays_2[0][1] = 12;
        arrays_2[0][2] = Effective_num;

        int Savetoarrays_2 = 0;
        for (int i = 0; i < arrays_1.length; i++) {
            for (int j = 0; j < arrays_1[i].length; j++) {
                if (arrays_1[i][j] != 0) {
                    Savetoarrays_2++;
                    arrays_2[Savetoarrays_2][0] = i;
                    arrays_2[Savetoarrays_2][1] = j;
                    arrays_2[Savetoarrays_2][2] = arrays_1[i][j];
                }
            }
        }
        System.out.println("稀疏数组:");
        for (int j = 0; j < arrays_2[0].length; j++) {
            if(j == 0)
                System.out.print("表头\t");
            else
                System.out.print("有效值\t");

            for (int i = 0; i < arrays_2.length; i++) {

                System.out.print(arrays_2[j][i] + "\t");
            }
            System.out.println();
        }
//还原阶段
        int[][] arrays_3 = new int[arrays_2[0][0]][arrays_2[0][1]];

        for(int i = 1;i<arrays_2.length;i++){
            arrays_3[arrays_2[i][0]][arrays_2[i][1]] = arrays_2[i][2];
        }
        System.out.println("还原后的数组:");
        PrintArrays(arrays_3);
    }


}