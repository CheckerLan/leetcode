package com.checker.code.foroffer;

public class Offer64 {

    public int sumNums(int n) {
        // Math函数作弊；
        // return (int)(Math.pow(n,2)+n) >> 1;

        // 官方解法1，递归
        // boolean x = (n > 0) && (n += sumNums(n-1)) > 0;
        // return n;

        // 官方解法2，快速乘

        // 普通版快速乘->将乘法变为加法-》数加上本身，然后被乘数除于2即右移两位
        // a*(2b)=(2a)*b=(a+a)*b;
        // a*(2b+1)=(2a)*b+a=(a+a)*b+a;
        // 奇数下的+a可以直接加入结果
        // 直到b==1，则a就为结果

        // 通项公式为：(n^2-n)/2
        return (ksc3(n, n) + n) >> 1;

    }

    // 普通版快速乘
    int ksc1(int a, int b) {
        int res = 0;
        while (b > 1) {
            if ((b & 1) != 0) {// 即b%2 == 1
                res += a;
            }
            a += a;
            b >>= 1;// 相当于b/=2
        }
        res += a;
        return res;
    }

    // 递归版快速乘（此步去除while）
    int ksc2(int a, int b) {

        if (b <= 1) {
            return a;
        }

        int res = 0;
        if ((b & 1) != 0) {// 即b%2 == 1
            res += a;
        }


        res += ksc2(a + a, b >> 1);

        return res;
    }

    // 去除if
    int ksc3(int a, int b) {

        int res = 0;

        // if(b <= 1){
        //     return a;
        // }

        // if((b & 1) != 0){// 即b%2 == 1
        //     res += a;
        // }

        boolean x = ((b <= 1) && ((res = a) > 0))
                || ((((b & 1) != 0) && ((res += a + ksc3(a + a, b >> 1)) > 0))
                || ((res += ksc3(a + a, b >> 1)) > 0));
        return res;
    }


}
