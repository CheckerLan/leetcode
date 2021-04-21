package com.checker.code.foroffer;

import java.util.Arrays;

public class Offer17 {
    String[] s;
    int[] res;

    public int[] printNumbers(int n) {
        // 不考虑大数
//        if (n <= 0) {
//            return null;
//        }
//        int[] res = new int[(int) Math.pow(10, n) - 1];
//        for (int i = 0; i < res.length; i++) {
//            res[i] = i + 1;
//        }
//        return res;

        // 考虑大数
        s = new String[(int) Math.pow(10, n) - 1];
        res = new int[(int) Math.pow(10, n) - 1];
        char[] chars = new char[n];
        dfs(0, n, chars);
//        System.out.println(Arrays.toString(s));
        return res;
    }

    void dfs(int deep, int length, char[] c) {
        if (deep == length) {

            int n = Integer.parseInt(String.valueOf(c));
            if (n != 0) {
                s[n - 1] = String.valueOf(n);
                // 仅为此题进行转换
                res[n - 1] = n;
            }

            return;
        }

        for (char i = '0'; i <= '9'; i++) {
            c[deep] = i;
            dfs(deep + 1, length, c);
        }
    }


    public static void main(String[] args) {
        Offer17 offer17 = new Offer17();
        System.out.println(Arrays.toString(offer17.printNumbers(2)));

//        System.out.println(Arrays.toString(chars));
    }
}
