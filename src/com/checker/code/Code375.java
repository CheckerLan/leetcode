package com.checker.code;

public class Code375 {
    public static void main(String[] args) {
        System.out.println(new Code375().getMoneyAmount(10));
    }
    public int getMoneyAmount(int n) {
        //int[][] area = new int[n][n];
        // for(int i = 0;i < area.length;i++){
        //     for(int j = 0;i+j < area.length;j++){
        //         area[j][i+j] = getBestResult(j,i+j);
        //     }
        // }

        // int reuslt = Integer.MAX_VALUE;
        // for(int i = 1;i <= n;i++){
        //     int minResult =  getBestResult(1,i - 1);
        //     int maxResult = getBestResult(i + 1,n);
        //     int tempReuslt = i + maxResult>minResult?maxResult:minResult;
        //     reuslt = reuslt<tempReuslt?reuslt:tempReuslt;
        // }
        return getBestResult(1,n);
    }

    public int getBestResult(int min,int max){
        if(max == min){
            return 0;
        }
        if(max == min+1){
            return min;
        }
        int reuslt = Integer.MAX_VALUE;
        for(int i = min + 1;i <= max - 1;i++){
            int minResult = getBestResult(min,i-1);
            int maxResult = getBestResult(i+1,max);
            int tempReuslt = i + (maxResult>minResult?maxResult:minResult);
            reuslt = reuslt<tempReuslt?reuslt:tempReuslt;
        }
        return reuslt;

    }
}
