package com.checker.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code969 {
    public static void main(String[] args) {
        System.out.println(pancakeSort(new int[]{3,1,2}));
    }

    public static List<Integer> pancakeSort(int[] arr) {
        ArrayList<Integer> result =new ArrayList<>();

        int[] b =  Arrays.copyOf(arr,arr.length);

        Arrays.sort(b);

        for(int i = b.length-1;i >= 0;i--){
            for(int j = 0;j < arr.length;j++){
                if(arr[j] == b[i]){
                    // 临时变量存储反转前的arr
                    int[] stamp = Arrays.copyOf(arr,arr.length);
                    // 第一次将目标值反转到第一位,第二次将目标值反转到目标位
                    // 等价于目标值当前位到目标位的所有数字反转,其余部分保持不变
                    for(int n = 0;n < arr.length;n++){

                        if(n > j && n <= i){
                            //0->i  i-(j+1)->j+1
                            //倒序输出
                            arr[i-n] = stamp[n];
                        }else if (n <= j){
                            //目标位以前,正序且移位
                            arr[n+i-j] = stamp[n];
                        }else {
                            //正序
                            arr[n] = stamp[n];
                        }
                    }
                    //完成变换将步数加入结果
                    result.add(j+1);
                    result.add(i+1);


                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return result;

    }
}
