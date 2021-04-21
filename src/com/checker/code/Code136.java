package com.checker.code;

import java.util.Arrays;

public class Code136 {

    // 使用排序时间复杂度不为线性，为2次方-》n~2
    public int mySingleNumber(int[] nums) {
        // 排序
        Arrays.sort(nums);

        // 前不存在或者不相同且后不存在或不存在 即可证明该元素为单独的
        for (int i = 0; i < nums.length; i++) {
            if ((i - 1) < 0 || nums[i] != nums[i - 1]) {
                if ((i + 1) > (nums.length - 1) || nums[i] != nums[i + 1]){
                    return nums[i];
                }

            }
        }
        return Integer.MIN_VALUE;
    }

    // 官方正确解法：使用异或
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;

    }

    public static void main(String[] args) {
        Code136 code136 = new Code136();
        System.out.println(code136.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
