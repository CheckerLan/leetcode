package com.checker.code;


import com.checker.structure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;

public class Code501 {
    int result;
    int pre;
    int maxNum = 0;
    int nums = 0;
    ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);

        System.out.println(Arrays.toString(new Code501().findMode(root)));
    }


    public int[] findMode(TreeNode root) {
        list.add(Integer.MIN_VALUE);

        result = root.val;
        pre = result;
        inOrder(root);

        int[] resArray = list.stream().mapToInt(Integer::valueOf).toArray();;
        return resArray;

    }

    public void inOrder(TreeNode node){
        if(node == null){
            return ;
        }

        inOrder(node.left);

        if(node.val == pre){
            nums++;
        }else{
            if(nums == maxNum){
                list.add(node.val);
            }else if(nums > maxNum){
                list.clear();
                list.add(node.val);
                maxNum =nums;
            }
            nums = 1;
            pre = node.val;
        }


        inOrder(node.right);

    }
}
