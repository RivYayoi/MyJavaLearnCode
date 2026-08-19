package com.Mycode;

public class kbcs5 {
    public static void main(String[] args) {
        //调用方法
        Valuemax(1,2,31,4,5);
        Valuemax(11,2,3,4,5,6,7,8,9,10);
        Valuemax();
        Valuemax(11,2,33,44,55);

}

public static void Valuemax(double ...number){
//判断是否有数字
         if (number.length == 0){
             System.out.println("无数字");
             return;
         }

         double max = number[0];
         //排序
    // 遍历数组，找到最大值
         for (int i = 0; i < number.length; i++) {
             if(number[i] > max){
                 max = number[i];
             }
         }
         System.out.println("最大值为：" + max);
    }
}

