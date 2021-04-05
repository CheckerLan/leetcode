package com.checker.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Code1331 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{27, 46, -3, -36, 31, -14, -7, -36, 27, -14, 41, -40, 23, 27, 27, 27})));
    }
    public static int[] arrayRankTransform(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i < arr.length;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);


        for(int i = 0;i < arr.length;i++){
            int max = list.size()-1;
            int min = 0;
            while(max >= min){
                int mid =(max+min)/2;
                if(arr[i] == list.get(mid)){
                    arr[i] = mid+1;
                    break;
                }
                if(arr[i] > list.get(mid)){
                    min = mid + 1;
                }else{
                    max = mid - 1;
                }
            }
        }
        return arr;
    }
}
