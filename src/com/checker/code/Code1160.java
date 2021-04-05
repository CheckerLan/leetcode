package com.checker.code;

import java.util.Arrays;

public class Code1160 {
    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));
    }
    public static int countCharacters(String[] words, String chars) {
        //charTable对应为26个字母的映射
        int[] charTable = new int[26];
        int result = 0;


        for(int i = 0;i < chars.length();i++){
            int c = (int)chars.charAt(i);
            charTable[c-97]++;
        }

        for(int i = 0;i < words.length;i++){
            int[] tampTable = Arrays.copyOf(charTable,charTable.length);
            boolean flag = true;
            for(int j = 0;j <  words[i].length() && flag;j++){
                int t = (int)words[i].charAt(j);
                if(tampTable[t-97] > 0){
                    tampTable[t-97]--;
                }else{
                    flag = false;
                }
            }
            if(flag){
                result += words[i].length();
            }
        }
        return result;
    }
}
